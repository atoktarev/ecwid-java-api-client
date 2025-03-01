package com.ecwid.apiclient.v3.responsefields

import java.util.concurrent.ConcurrentHashMap
import kotlin.reflect.KAnnotatedElement
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.reflect.KType
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.full.memberProperties

/**
 * Generate responseFields parameter from data class
 */
class ResponseFieldsBuilder {
	private val cache = ConcurrentHashMap<KClass<*>, ResponseFields>()

	/**
	 * Only kotlin data classes allowed
	 *
	 * @throws IllegalArgumentException if class is not kotlin data class
	 */
	inline fun <reified T> buildResponseFields(): ResponseFields {
		return buildResponseFields(T::class)
	}

	/**
	 * Only kotlin data classes allowed
	 *
	 * @throws IllegalArgumentException if [klass] is not kotlin data class
	 */
	fun buildResponseFields(klass: KClass<*>): ResponseFields {
		require(klass.isData) {
			"Only kotlin data class allowed"
		}

		return cache.getOrPut(klass) {
			val fields = klass.memberProperties.associate(this::parseProperty)
			if (fields.isEmpty()) {
				ResponseFields.All
			} else {
				ResponseFields(fields)
			}
		}
	}

	private fun parseProperty(property: KProperty1<*, *>): Pair<String, ResponseFields.Field> {
		val fromAnnotation = buildFromAnnotation(property)
		if (fromAnnotation != null) {
			return property.name to fromAnnotation
		}

		val returnType = property.returnType

		val typeArguments = returnType.arguments
		when {
			// Collection
			typeArguments.size == 1 && isCollectionType(returnType) -> {
				val genericArgument = typeArguments.first().type
					?: error("Not allowed type $returnType in property ${property.name}")

				return property.name to buildFieldByType(genericArgument)
			}

			// Map
			typeArguments.size == 2 && isMapType(returnType) -> {
				val genericArgument = typeArguments[1].type
					?: error("Not allowed type $returnType in property ${property.name}")

				return property.name to buildFieldByType(genericArgument)
			}
		}

		return property.name to buildFieldByType(returnType)
	}

	private fun buildFieldByType(type: KType): ResponseFields.Field {
		val klass = type.classifier as? KClass<*>
			?: return ResponseFields.Field.All

		val fromAnnotation = buildFromAnnotation(klass)
		if (fromAnnotation != null) {
			return fromAnnotation
		}

		if (klass.isData) {
			val fields = buildResponseFields(klass).fields
			return if (fields.isEmpty()) {
				 ResponseFields.Field.All
			} else {
				ResponseFields.Field(fields)
			}
		}

		return ResponseFields.Field.All
	}

	private fun isMapType(propertyType: KType): Boolean {
		val klass = propertyType.classifier as? KClass<*>
			?: return false

		return klass.isSubclassOf(Map::class)
	}

	private fun isCollectionType(propertyType: KType): Boolean {
		val klass = propertyType.classifier as? KClass<*>
			?: return false

		return klass.isSubclassOf(Collection::class)
	}

	private fun buildFromAnnotation(element: KAnnotatedElement): ResponseFields.Field? {
		val annotation = element.findAnnotation<ResponseFieldsOverride>()
			?: return null

		return if (annotation.fields.isEmpty()) {
			ResponseFields.Field.All
		} else {
			val fieldsMap = annotation.fields.associateWith { ResponseFields.Field.All }
			ResponseFields.Field(fieldsMap)
		}
	}
}

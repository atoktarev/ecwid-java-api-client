package com.ecwid.apiclient.v3.dto.category.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.impl.RequestInfo
import com.ecwid.apiclient.v3.responsefields.ResponseFields

data class CategoriesSearchRequest(
	val parentCategoryId: ParentCategory = ParentCategory.Any,
	val hiddenCategories: Boolean? = null,
	val returnProductIds: Boolean? = null,
	val baseUrl: String? = null,
	val cleanUrls: Boolean? = null,
	val offset: Int = 0,
	val limit: Int = 100,
	val lang: String? = null,
	val responseFields: ResponseFields = ResponseFields.All,
) : ApiRequest {

	override fun toRequestInfo() = RequestInfo.createGetRequest(
		pathSegments = listOf(
			"categories"
		),
		params = toParams(),
		responseFields = responseFields,
	)

	sealed class ParentCategory {
		object Any : ParentCategory()
		object Root : ParentCategory()
		data class WithId(val id: Int = 0) : ParentCategory()
	}

	private fun toParams(): Map<String, String> {
		val parentCategoryId = when (parentCategoryId) {
			is ParentCategory.Root ->
				0
			is ParentCategory.WithId ->
				parentCategoryId.id
			else ->
				null
		}

		val request = this
		return mutableMapOf<String, String>().apply {
			parentCategoryId?.let { put("parent", it.toString()) }
			request.hiddenCategories?.let { put("hidden_categories", it.toString()) }
			request.returnProductIds?.let { put("productIds", it.toString()) }
			request.baseUrl?.let { put("baseUrl", it) }
			request.cleanUrls?.let { put("cleanUrls", it.toString()) }
			put("offset", request.offset.toString())
			put("limit", request.limit.toString())
			request.lang?.let { put("lang", it) }
		}.toMap()
	}
}

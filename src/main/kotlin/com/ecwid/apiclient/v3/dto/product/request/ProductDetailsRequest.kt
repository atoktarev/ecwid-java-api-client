package com.ecwid.apiclient.v3.dto.product.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.impl.RequestInfo

data class ProductDetailsRequest(
		val productId: Int = 0,
		val baseUrl: String? = null,
		val cleanUrls: Boolean? = null,
		val lang: String? = null
) : ApiRequest {
	override fun toRequestInfo() = RequestInfo.createGetRequest(
			pathSegments = listOf(
				"products",
				"$productId"
			),
			params = toParams()
	)

	private fun toParams(): Map<String, String> {
		val request = this
		return mutableMapOf<String, String>().apply {
			request.baseUrl?.let { put("baseUrl", it) }
			request.cleanUrls?.let { put("cleanUrls", it.toString()) }
			request.lang?.let { put("lang", it) }
		}.toMap()
	}
}

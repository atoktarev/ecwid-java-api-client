package com.ecwid.apiclient.v3.dto.application.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.impl.RequestInfo

class AppDeleteRequest(
	private val namespace: String = "",
): ApiRequest {
	override fun toRequestInfo() = RequestInfo.createDeleteRequest(
		pathSegments = listOf(
			"application",
			namespace
		)
	)
}

package com.ecwid.apiclient.v3.dto.profile.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.impl.RequestInfo

class StoreLogoRemoveRequest : ApiRequest {
	override fun toRequestInfo() = RequestInfo.createDeleteRequest(
		pathSegments = listOf(
			"profile",
			"logo"
		)
	)
}

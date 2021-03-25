package com.ecwid.apiclient.v3.dto.customer.result

import com.ecwid.apiclient.v3.dto.common.ApiResultDTO

data class DeletedCustomersSearchResult(
		val items: List<DeletedCustomer> = listOf(),
		val count: Int = 0,
		val total: Int = 0,
		val limit: Int = 0,
		val offset: Int = 0
) : ApiResultDTO

package com.ecwid.apiclient.v3.dto.order.result

import java.util.*

data class DeletedOrder(
		val id: Int = 0,
		val orderId: String? = null,
		val date: Date = Date()
)

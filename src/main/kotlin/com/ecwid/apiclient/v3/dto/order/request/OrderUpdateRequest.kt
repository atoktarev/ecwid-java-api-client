package com.ecwid.apiclient.v3.dto.order.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.httptransport.HttpBody
import com.ecwid.apiclient.v3.impl.RequestInfo

data class OrderUpdateRequest(
		val orderNumber: Int = 0,
		val orderIdentity: String = "",
		val updatedOrder: UpdatedOrder = UpdatedOrder()
) : ApiRequest {
	constructor(
			orderNumber: Int = 0,
			updatedOrder: UpdatedOrder = UpdatedOrder()
	) : this(orderNumber, orderNumber.toString(), updatedOrder)

	override fun toRequestInfo() = RequestInfo.createPutRequest(
			endpoint = "orders/$orderIdentity",
			httpBody = HttpBody.JsonBody(
					obj = updatedOrder
			)
	)
}

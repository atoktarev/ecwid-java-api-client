package com.ecwid.apiclient.v3.dto.profile.result

import com.ecwid.apiclient.v3.dto.common.ApiResultDTO

data class PaymentOptionDeleteResult(
	val deleteCount: Int = 0,
) : ApiResultDTO

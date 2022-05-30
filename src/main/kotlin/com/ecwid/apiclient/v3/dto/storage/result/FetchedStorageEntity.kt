package com.ecwid.apiclient.v3.dto.storage.result

import com.ecwid.apiclient.v3.dto.common.ApiFetchedDTO
import com.ecwid.apiclient.v3.dto.storage.request.UpdatedStorageEntity

data class FetchedStorageEntity(
	val key: String = "",
	val value: String = "",
) : ApiFetchedDTO {

	override fun getModifyKind() = ApiFetchedDTO.ModifyKind.ReadWrite(UpdatedStorageEntity::class)

}

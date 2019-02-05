package io.github.wulkanowy.api.messages

import com.google.gson.annotations.SerializedName

data class ReportingUnit(

    @SerializedName("IdJednostkaSprawozdawcza")
    val id: Int,

    @SerializedName("Skrot")
    val short: String,

    @SerializedName("Role")
    val roles: List<Int>,

    @SerializedName("Id")
    val senderId: Int,

    @SerializedName("NazwaNadawcy")
    val senderName: String
)

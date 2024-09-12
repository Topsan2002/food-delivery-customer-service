package com.fooddelivery.customerservice.dto

import java.lang.Error

data class ResponseDto(
    var status: Boolean,
    var message: String,
    var data: Any,
    var error: Any
)

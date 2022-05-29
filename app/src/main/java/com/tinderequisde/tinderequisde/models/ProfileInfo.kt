package com.tinderequisde.tinderequisde.models

data class ProfileInfo(
    var id: String,
    var photoUrl: String = "",
    var name: String = "",
    var description: String = "",
    var rating: String = "0f"
)

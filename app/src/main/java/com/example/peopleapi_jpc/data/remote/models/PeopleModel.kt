package com.example.peopleapi_jpc.data.remote.models

data class PeopleModel(
    val `data`: List<Data>,
    val page: Int,
    val per_page: Int,
    val support: Support,
    val total: Int,
    val total_pages: Int
)
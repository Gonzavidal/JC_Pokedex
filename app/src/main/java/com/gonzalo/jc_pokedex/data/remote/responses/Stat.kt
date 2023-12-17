package com.gonzalo.jc_pokedex.data.remote.responses

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: com.gonzalo.jc_pokedex.data.remote.responses.StatX
)
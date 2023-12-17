package com.gonzalo.jc_pokedex.data.remote.responses

data class Move(
    val move: com.gonzalo.jc_pokedex.data.remote.responses.MoveX,
    val version_group_details: List<com.gonzalo.jc_pokedex.data.remote.responses.VersionGroupDetail>
)
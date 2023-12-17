package com.gonzalo.jc_pokedex.data.remote.responses

data class Ability(
    val ability: com.gonzalo.jc_pokedex.data.remote.responses.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)
package com.example.kotlin.pokedexapp.data.network.model.pokemon

import com.example.kotlin.pokedexapp.data.network.model.pokemon.AbilityX

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)
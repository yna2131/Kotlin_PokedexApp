package com.example.kotlin.pokedexapp.data.network.model

import com.google.gson.annotations.SerializedName

data class PokedexObject(
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: ArrayList<com.example.kotlin.pokedexapp.data.network.model.PokemonBase>,
)
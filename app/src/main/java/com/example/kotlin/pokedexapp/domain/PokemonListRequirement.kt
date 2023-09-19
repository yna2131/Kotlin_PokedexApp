package com.example.kotlin.pokedexapp.domain

import com.example.kotlin.pokedexapp.data.PokemonRepository
import com.example.kotlin.pokedexapp.data.network.model.PokedexObject

class PokemonListRequirement {

    private val repository = PokemonRepository()

    suspend operator fun invoke(
        limit:Int
    ): PokedexObject? = repository.getPokemonList(limit)
}
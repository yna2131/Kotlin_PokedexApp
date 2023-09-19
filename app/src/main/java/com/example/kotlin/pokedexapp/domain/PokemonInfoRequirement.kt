package com.example.kotlin.pokedexapp.domain

import com.example.kotlin.pokedexapp.data.PokemonRepository
import com.example.kotlin.pokedexapp.data.network.model.pokemon.Pokemon

class PokemonInfoRequirement {
    private val repository = PokemonRepository()

    suspend operator fun invoke(
        numberPokemon:Int
    ): Pokemon? = repository.getPokemonInfo(numberPokemon)
}
package com.example.kotlin.pokedexapp.data.network

import com.example.kotlin.pokedexapp.data.network.model.pokemon.Pokemon

class PokemonApiClient {
    private lateinit var api: PokemonAPIService

    suspend fun getPokemonList(limit:Int): com.example.kotlin.pokedexapp.data.network.model.PokedexObject?{
        api = NetworkModuleDI()
        return try{
            api.getPokemonList(limit)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }

    suspend fun getPokemonInfo(numberPokemon:Int): Pokemon? {
        api = NetworkModuleDI()
        return try{
            api.getPokemonInfo(numberPokemon)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}
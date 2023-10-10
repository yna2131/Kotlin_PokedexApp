package com.example.kotlin.pokedexapp.framework.views.activities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.kotlin.pokedexapp.databinding.ActivityPokemonDetailBinding
import com.example.kotlin.pokedexapp.utils.Constants

class PokemonDetailActivity: Activity() {
    private lateinit var binding: ActivityPokemonDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
    }

    private fun initializeBinding(){
        binding = ActivityPokemonDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
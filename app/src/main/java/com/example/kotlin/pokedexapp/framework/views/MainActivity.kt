package com.example.kotlin.pokedexapp.framework.views

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.pokedexapp.framework.adapters.PokemonAdapter
import com.example.kotlin.pokedexapp.databinding.ActivityMainBinding
import com.example.kotlin.pokedexapp.framework.viewmodel.MainViewModel
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.pokedexapp.data.network.model.PokemonBase

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter : PokemonAdapter = PokemonAdapter()
    private lateinit var data:ArrayList<PokemonBase>

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()
        viewModel.getPokemonList()

    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setUpRecyclerView(dataForList:ArrayList<PokemonBase>){
        binding.RVPokemon.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVPokemon.layoutManager = linearLayoutManager
        adapter.PokemonAdapter(dataForList,this)
        binding.RVPokemon.adapter = adapter
    }

    private fun initializeObservers(){
        viewModel.pokedexObjectLiveData.observe(this){ poxedexObject ->
            if (poxedexObject != null) {
                setUpRecyclerView(poxedexObject.results)
            }
        }
    }
}
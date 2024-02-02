package com.gonzalo.jc_pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.gonzalo.jc_pokedex.data.remote.responses.Pokemon
import com.gonzalo.jc_pokedex.repository.PokemonRepository
import com.gonzalo.jc_pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}
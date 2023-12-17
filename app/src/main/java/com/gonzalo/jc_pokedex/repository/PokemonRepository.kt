package com.gonzalo.jc_pokedex.repository

import com.gonzalo.jc_pokedex.PokemonList
import com.gonzalo.jc_pokedex.data.remote.PokeApi
import com.gonzalo.jc_pokedex.data.remote.responses.Pokemon
import com.gonzalo.jc_pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error ocurred")
        }
        return Resource.Success(response)
    }
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error ocurred")
        }
        return Resource.Success(response)
    }
}
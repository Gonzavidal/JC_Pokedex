package com.gonzalo.jc_pokedex.pokemonlist

import android.content.IntentSender.OnFinished
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.toBitmap
import androidx.lifecycle.ViewModel
import androidx.palette.graphics.Palette
import com.gonzalo.jc_pokedex.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    fun calculateDominantColor(
        drawable: Drawable,
        onFinished: (android.graphics.Color) -> Unit) {
        val bmp = (drawable as Drawable).toBitmap().copy(Bitmap.Config.ARGB_8888, true)

        Palette.from(bmp).generate { palette ->
            palette?.dominantSwatch?.rgb?.let {
                onFinished(android.graphics.Color())
            }
        }
    }
}
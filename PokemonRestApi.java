package com.esiea32;

import com.esiea32.model.RestPokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;



public interface PokemonRestApi {

    @GET("pokemon")
    Call<RestPokemonResponse> getListPokemon();
}

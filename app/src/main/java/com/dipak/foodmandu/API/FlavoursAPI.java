package com.dipak.foodmandu.API;

import com.dipak.foodmandu.Model.Flavours;
import com.dipak.foodmandu.ui.home.Model.Super7;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface FlavoursAPI {

    @GET("flavours")
    Call<List<Flavours>> getflavours();

    @GET("flavours")
    Call<Flavours> getflavoursimage(@Header("Authorization") String token);
}

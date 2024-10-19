package br.com.cpelegrin.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiTempo {
    //"https://api.hgbrasil.com/weather?woeid=457197"
    @GET("weather?woeid=457197")
    Call<ApiPojo> getInfTempo();
}

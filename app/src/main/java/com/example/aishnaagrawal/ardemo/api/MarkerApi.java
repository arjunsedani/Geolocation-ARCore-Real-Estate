package com.example.aishnaagrawal.ardemo.api;

import com.example.aishnaagrawal.ardemo.model.MarkerInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by aishnaagrawal on 11/16/17.
 */

public interface MarkerApi {
    //@GET("36.97398389105355/37.00942677981021/-122.08119844562987/-122.0473811543701/")
    @GET("12.9198807/12.95532358875666/77.49949670000001/78.46567940874031/")
    Call<List<MarkerInfo>> getMarkers();
}

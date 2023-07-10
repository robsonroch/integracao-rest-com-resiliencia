package br.com.robson.app.util;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.AddressComponent;

public class GoogleMapsClient {

    private static final String apiKey = "sua chave do google";

    public static AddressComponent buscarEnderecoPorLatLon(double latitude, double longitude) {
        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(apiKey)
                .build();

        GeocodingResult[] results;
        try {
             results = GeocodingApi.reverseGeocode(context, new com.google.maps.model.LatLng(latitude, longitude))
                    .await();
            if (results.length > 0) {
                 GeocodingResult geocodingResult = results[0];
                 return geocodingResult.addressComponents[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
package com.Conversor.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conexion {
    String apiKey= "569670807c05c22825343673";






    public static String convertirMoneda(String monBase, String monFinal, double monto) throws IOException, InterruptedException {
        String apiKey= "569670807c05c22825343673";
        String busqueda= "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busqueda+monBase+"/"+monFinal+"/"+monto))
                .build();
        HttpResponse<String> response =client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json= response.body();
        Gson gson = new Gson();

        Consulta consulta = gson.fromJson(json,Consulta.class);

        return consulta.conversion_result();

    }
}

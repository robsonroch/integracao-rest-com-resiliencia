package br.com.robson.app.util;

import java.util.List;

import feign.RequestLine;

import br.com.robson.app.model.ClienteResponse;
import feign.RequestLine;

public interface MyServiceClientResilient {
    @RequestLine("GET /clientes")
    List<ClienteResponse> getData();

    default String fallbackGetData(Exception e) {
        return "Fallback data";
    }
}
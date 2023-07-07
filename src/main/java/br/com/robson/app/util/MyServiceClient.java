package br.com.robson.app.util;

import java.util.List;
import feign.RequestLine;

import br.com.robson.app.model.ClienteResponse;

public interface MyServiceClient {
    @RequestLine("GET /clientes")
    List<ClienteResponse> getData();
}
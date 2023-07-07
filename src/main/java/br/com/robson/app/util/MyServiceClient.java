package br.com.robson.app.util;

import java.util.List;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import br.com.robson.app.model.ClienteRequest;
import br.com.robson.app.model.ClienteResponse;

public interface MyServiceClient {
    @RequestLine("GET /clientes")
    List<ClienteResponse> getData();
    
    @RequestLine("POST /clientes")
    @Headers({"Content-Type: {contentType}", "Accept: {accept}"})
    String postData(@Param("contentType") String contentType, @Param("accept") String accept, ClienteRequest requestObject);
}
package br.com.robson.app;

import java.util.List;

import br.com.robson.app.model.ClienteResponse;
import br.com.robson.app.util.MyServiceClient;
import feign.Feign;
import feign.jackson.JacksonDecoder;

public class FeignClientExample {
    public static void main(String[] args) {
        MyServiceClient client = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(MyServiceClient.class, "http://localhost:8080/");

        List<ClienteResponse> data = client.getData();
        System.out.println(data);
    }
}







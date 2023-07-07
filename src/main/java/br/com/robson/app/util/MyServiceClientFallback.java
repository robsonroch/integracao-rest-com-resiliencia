package br.com.robson.app.util;

import java.util.List;

import br.com.robson.app.model.ClienteRequest;
import br.com.robson.app.model.ClienteResponse;

public class MyServiceClientFallback implements MyServiceClient {
	
    private Exception cause;

    public MyServiceClientFallback(Exception cause) {
        this.cause = cause;
    }

	@Override
	public List<ClienteResponse> getData() {
        if (cause != null) {
            System.out.println(cause.getMessage());
        }
        throw new RuntimeException("Error fetching account: " + cause.getMessage());
	}

	@Override
	public String postData(String contentType, String accept, ClienteRequest requestObject) {
        if (cause != null) {
            System.out.println(cause.getMessage());
        }
        throw new RuntimeException("Error fetching account: " + cause.getMessage());
	}


}

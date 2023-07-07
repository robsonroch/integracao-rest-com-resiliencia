package br.com.robson.app;

import java.util.List;
import java.util.Optional;

import br.com.robson.app.model.ClienteResponse;
import br.com.robson.app.util.MyServiceClient;
import br.com.robson.app.util.MyServiceClientFallback;
import feign.jackson.JacksonDecoder;
import io.github.resilience4j.bulkhead.Bulkhead;
import io.github.resilience4j.bulkhead.BulkheadRegistry;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterRegistry;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryRegistry;

public class Application {
	
	private static String SERVICE_NAME = "my_service";
	
    public static void main(String[] args) {
    	
    	
        CircuitBreakerRegistry circuitBreakerRegistry = CircuitBreakerRegistry.ofDefaults();
        RateLimiterRegistry rateLimiterRegistry = RateLimiterRegistry.ofDefaults();
        RetryRegistry retryRegistry = RetryRegistry.ofDefaults();
        BulkheadRegistry bulkheadRegistry = BulkheadRegistry.ofDefaults();
        
        
        CircuitBreaker circuitBreaker = circuitBreakerRegistry.circuitBreaker(SERVICE_NAME);
        RateLimiter rateLimiter = rateLimiterRegistry.rateLimiter(SERVICE_NAME);
        Retry retry = retryRegistry.retry(SERVICE_NAME);
        Bulkhead bulkhead = bulkheadRegistry.bulkhead(SERVICE_NAME);
                        
        FeignDecorators decorators = FeignDecorators.builder()
        		.withRateLimiter(rateLimiter)
        		.withCircuitBreaker(circuitBreaker)
        		.withRetry(retry)
        		.withBulkhead(bulkhead)
                .withFallbackFactory(MyServiceClientFallback::new)
                .build();
        
        MyServiceClient client2 = Resilience4jFeign.builder(decorators).decoder(new JacksonDecoder()).target(MyServiceClient.class, "http://localhost:8080/");
        
        
        List<ClienteResponse> data = client2.getData();
        System.out.println(data);
    }
}
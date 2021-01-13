package com.sample.gateway;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderFallback")
    public Mono<String> orderServiceFallback(){
        return Mono.just("order service is down");
    }

    @RequestMapping("/paymentFallback")
    public Mono<String> paymentServiceFallback(){
        return Mono.just("payment service is down");
    }

}

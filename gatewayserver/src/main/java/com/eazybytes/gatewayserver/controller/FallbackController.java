package com.eazybytes.gatewayserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/eazybankfallback")
    public Mono<String> contactSupport() {
        return Mono.just("An Error occurred. Contact support...");
    }
}
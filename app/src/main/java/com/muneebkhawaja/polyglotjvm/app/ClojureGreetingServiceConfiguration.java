package com.muneebkhawaja.polyglotjvm.app;

import com.muneebkhawaja.polyglotjvm.common.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.muneebkhawaja.polyglotjvm.clojure.lib.ClojureGreetingService;

@Configuration
public class ClojureGreetingServiceConfiguration {

    @Bean
    public GreetingService clojureGreetingService() {
        return new ClojureGreetingService();
    }
}
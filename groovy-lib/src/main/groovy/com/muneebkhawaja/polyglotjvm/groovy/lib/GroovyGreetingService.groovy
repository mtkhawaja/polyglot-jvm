package com.muneebkhawaja.polyglotjvm.groovy.lib

import com.muneebkhawaja.polyglotjvm.common.Greeting
import com.muneebkhawaja.polyglotjvm.common.GreetingService
import org.springframework.stereotype.Service

@Service
class GroovyGreetingService implements GreetingService {

    private final String name = "Groovy"

    @Override
    Greeting greet() {
        new Greeting("groovy", "hello from $name")
    }
}
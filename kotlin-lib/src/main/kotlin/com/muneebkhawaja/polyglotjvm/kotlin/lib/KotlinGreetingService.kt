package com.muneebkhawaja.polyglotjvm.scala.lib

import com.muneebkhawaja.polyglotjvm.common.Greeting
import com.muneebkhawaja.polyglotjvm.common.GreetingService
import org.springframework.stereotype.Service


@Service
class KotlinGreetingService : GreetingService {

    private val name = "Kotlin"

    override fun greet() =
        Greeting("kotlin", "hello from $name")
}
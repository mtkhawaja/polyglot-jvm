package com.muneebkhawaja.polyglotjvm.scala.lib

import com.muneebkhawaja.polyglotjvm.common.{Greeting, GreetingService}
import org.springframework.stereotype.Service

@Service
class ScalaGreetingService extends GreetingService {

  private val name: String = "Scala"

  override def greet(): Greeting =
    Greeting("scala", s"hello from $name")
}
package com.muneebkhawaja.polyglotjvm.common;

///  Contract for components that produce a human‑readable greeting.
///  Implementations can generate static or dynamic messages (for example, time‑based or localized greetings).
/// This interface is intentionally small so it can be implemented by libraries written in different
/// JVM languages within this multi‑module project.
public interface GreetingService {

    Greeting greet();
}
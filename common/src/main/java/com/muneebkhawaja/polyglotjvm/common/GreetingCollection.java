package com.muneebkhawaja.polyglotjvm.common;

import org.jspecify.annotations.NonNull;

import java.util.List;

public record GreetingCollection(@NonNull List<Greeting> greetings) {
}

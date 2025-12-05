package com.muneebkhawaja.polyglotjvm.app;

import com.muneebkhawaja.polyglotjvm.common.GreetingCollection;
import com.muneebkhawaja.polyglotjvm.common.GreetingService;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompositeGreetingService {
    private final List<GreetingService> greetingsServices;

    @Autowired
    public CompositeGreetingService(List<GreetingService> greetingsServices) {
        this.greetingsServices = greetingsServices;
    }

    public @NonNull GreetingCollection greetAll() {
        final var greetings = greetingsServices.stream()
                .map(GreetingService::greet)
                .toList();
        return new GreetingCollection(greetings);
    }

}

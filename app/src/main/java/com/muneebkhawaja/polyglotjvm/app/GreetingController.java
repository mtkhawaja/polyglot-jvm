package com.muneebkhawaja.polyglotjvm.app;

import com.muneebkhawaja.polyglotjvm.common.GreetingCollection;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final CompositeGreetingService greetingService;

    @Autowired
    public GreetingController(CompositeGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public ResponseEntity<GreetingCollection> getGreetings() {
        return ResponseEntity.ok(greetingService.greetAll());
    }
}

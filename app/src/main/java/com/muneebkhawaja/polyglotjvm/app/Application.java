package com.muneebkhawaja.polyglotjvm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {
        "com.muneebkhawaja.polyglotjvm.*",
})
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}

# polyglot-jvm

A JVM multiverse demo exploring coexistence, compilation, and execution of multiple JVM languages within one Maven build and unified bytecode universe.

### What This Project Demonstrates

This repository shows how different JVM language libraries can live side‑by‑side, compile independently, and still interoperate cleanly inside a Spring Boot application. Each language implements the
same small shared contract (`GreetingService`), and the application discovers them all at runtime.

The `common` module defines:

- `Greeting`
- `GreetingCollection`
- `GreetingService` (the core contract)

Every language module depends on `common` and provides its own implementation of `GreetingService`.

### Architecture

```plaintext
polyglot-jvm/
 ├─ common/                 # shared Java contract + types
 ├─ app/                    # Spring Boot application
 ├─ groovy-lib/             # Groovy implementation
 ├─ scala-lib/              # Scala implementation
 ├─ kotlin-lib/             # Kotlin implementation
 ├─ clojure-lib/            # Clojure implementation
```

The `app` module simply autowires *all* `GreetingService` beans and returns their collected output at:

```plaintext
GET /greet
```

### How Language Modules Work

Each language module:

1. Uses its language‑specific Maven plugin (Scala, Kotlin, Clojure, Groovy).
2. Declares a dependency on `polyglot-jvm-common`.
3. Exposes a Spring bean that implements `GreetingService`.

### Key Design Principle

The shared boundary is intentionally tiny:

```
public interface GreetingService {
    Greeting greet();
}
```

Everything else (syntax, FP/OOP style, type inference, compilation strategy) is **language‑local**.  
All compiled outputs converge into the same bytecode world.

package pl.sda.configuration;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

abstract class ScopeController {
    private final UUID randomUUID = UUID.randomUUID();

    @GetMapping
    UUID get() {
        return randomUUID;
    }
}

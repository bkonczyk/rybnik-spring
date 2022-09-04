package pl.sda.injection;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ConstructorInjection implements CommandLineRunner {

    private final ComponentA a;
    private final ComponentB b;
    private final ComponentD d;

    @Override
    public void run(String... args) {
        log.info("Initialized component C");
        log.info("A is injected: {} ", a != null);
        log.info("B is injected: {} ", b != null);
        log.info("D is injected: {} ", d != null);
    }
}

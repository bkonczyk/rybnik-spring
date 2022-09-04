package pl.sda.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FieldInjection implements CommandLineRunner {

    @Autowired
    private ComponentA a;
    @Autowired
    private ComponentB b;
    @Autowired
    private ComponentD d;

    @Override
    public void run(String... args) {
        log.info("A is injected: {} ", a != null);
        log.info("B is injected: {} ", b != null);
        log.info("D is injected: {} ", d != null);
    }
}

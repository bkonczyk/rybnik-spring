package pl.sda.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SetterInjection implements CommandLineRunner {

    private ComponentA a;
    private ComponentB b;
    private ComponentD d;

    @Autowired
    public void setA(ComponentA a) {
        this.a = a;
    }

    @Autowired
    public void setB(ComponentB b) {
        this.b = b;
    }

    @Autowired
    public void setD(ComponentD d) {
        this.d = d;
    }

    @Override
    public void run(String... args) {
        log.info("A is injected: {} ", a != null);
        log.info("B is injected: {} ", b != null);
        log.info("D is injected: {} ", d != null);
    }
}

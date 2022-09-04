package pl.sda.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class PostConstructExample {

    @PostConstruct
    void showOff() {
      log.info("I am showing off");
    }
}

package pl.sda.data.person;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
@Slf4j
public class PersonPlayground {

    private final PersonRepository repository;

    @PostConstruct
    void findAllPeople() {
        List<Person> all = repository.findAll();
        log.info("People count is: " + repository.count());
        List<Person> oldies = repository.findAllByAgeGreaterThan(50);
        List<Person> oldMateusz = repository.findAllByAgeGreaterThanAndName(50, "Mateusz");
        List<Person> allByNameIsIn = repository.findAllByNameIsIn(Set.of("Mariusz", "Mateusz", "Grzegorz"));
        List<Person> allByAgeBetween = repository.findAllByAgeBetween(20, 35);
        log.info("Method finished");
    }
}

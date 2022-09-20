package pl.sda.firstspringproject.zoo.animal;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.util.UUID.randomUUID;

@Component
@Profile("dev")
@RequiredArgsConstructor
public class AnimalInitializer {

    private final AnimalRepository repository;

    @PostConstruct
    void initializeAnimals() {
        List<Animal> animals = repository.getAll();
        animals.add(new Animal(randomUUID(), "reksio", "dog", 10));
        animals.add(new Animal(randomUUID(), "pucio", "lion", 1));
    }
}

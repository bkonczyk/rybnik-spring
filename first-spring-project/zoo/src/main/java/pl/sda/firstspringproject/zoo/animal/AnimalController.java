package pl.sda.firstspringproject.zoo.animal;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.UUID.randomUUID;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    private final List<Animal> animals = new ArrayList<>();

    public AnimalController() {
        animals.add(new Animal(randomUUID(), "reksio", "dog", 10));
        animals.add(new Animal(randomUUID(), "pucio", "lion", 1));
    }

    @GetMapping
    List<Animal> getAll() {
        return animals;
    }

    @GetMapping("/{name}")
    Animal getSingle(@PathVariable String name) {
        return animals.stream()
                .filter(animal -> name.equalsIgnoreCase(animal.getName()))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("There is no such animal"));
    }

    @PostMapping
    void create(@RequestBody Animal animal) {
        animals.add(animal);
    }

    @PutMapping("/{index}")
    void update(@PathVariable int index, @RequestBody Animal animal) {
        animals.set(index, animal);
    }

    @DeleteMapping("/{index}")
    void delete(@PathVariable int index) {
        animals.remove(index);
    }
}

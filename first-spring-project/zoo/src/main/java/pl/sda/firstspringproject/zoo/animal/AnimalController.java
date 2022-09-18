package pl.sda.firstspringproject.zoo.animal;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/animals")
@Slf4j
public class AnimalController {

    private final AnimalService service;

    @GetMapping
    List<Animal> getAll() {
        log.info("Rasdasd");
        return service.getAll();
    }

    @GetMapping("/{name}")
    Animal getSingle(@PathVariable String name) {
        log.info("xD");
        return service.getByName(name);
    }
//
//    @PostMapping
//    void create(@RequestBody Animal animal) {
//        animals.add(animal);
//    }
//
//    @PutMapping("/{index}")
//    void update(@PathVariable int index, @RequestBody Animal animal) {
//        animals.set(index, animal);
//    }
//
//    @DeleteMapping("/{index}")
//    void delete(@PathVariable int index) {
//        animals.remove(index);
//    }
}

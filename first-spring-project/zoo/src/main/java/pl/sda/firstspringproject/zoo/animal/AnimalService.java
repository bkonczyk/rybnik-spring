package pl.sda.firstspringproject.zoo.animal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository repository;

    public List<Animal> getAll() {
        return repository.getAll();
    }

    public Animal getByName(String name) {
        return repository.getAll().stream()
                .filter(animal -> name.equalsIgnoreCase(animal.getName()))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No such animal"));
    }
}

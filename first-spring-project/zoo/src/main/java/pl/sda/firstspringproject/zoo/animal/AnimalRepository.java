package pl.sda.firstspringproject.zoo.animal;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {

    private final List<Animal> animals = new ArrayList<>();

    public List<Animal> getAll() {
        return animals;
    }
}

package pl.sda.firstspringproject.zoo.animal;

import lombok.Data;

import java.util.UUID;

@Data
public class Animal {

    private final UUID id;
    private final String name;
    private final String kind;
    private final Integer age;
}

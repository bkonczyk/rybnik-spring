package pl.sda.data.person;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class PersonMockData {

    @Value("${mock.number}")
    private Integer number;

    private final PersonRepository repository;

    private List<String> sampleNames = List.of("Mariusz", "Sara", "Sebastian", "Bartek", "Grzegorz",
            "Mateusz", "Kuba", "Klaudia", "Weronika", "Tomek");

    @PostConstruct
    void initializeMockData() {
        Random random = new Random();
        int size = sampleNames.size();
        for (int i = 0; i < number; i++) {
            String name = sampleNames.get(random.nextInt(size));
            int age = random.nextInt(60) + 20;
            Sex sex = Arrays.asList(Sex.values()).get(random.nextInt(2));
            Person person = new Person(null, name, age, sex);
            repository.save(person);
        }
    }
}

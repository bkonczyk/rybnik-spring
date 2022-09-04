package pl.sda.controllers.cars;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    @PostConstruct
    private void initializeCarsList() {
        cars.add(Car.of("Hyundai", 2020));
        cars.add(Car.of("Polonez", 1965));
        cars.add(Car.of("Lanos", 2001));
        cars.add(Car.of("Golf", 1988));
        cars.add(Car.of("Passeratti", 2015));
    }
}

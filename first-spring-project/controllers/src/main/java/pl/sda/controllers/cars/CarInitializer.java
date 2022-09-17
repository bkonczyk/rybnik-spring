package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CarInitializer {

    private final CarService carService;

    @PostConstruct
    private void initializeCarsList() {
        List<Car> cars = carService.getCars();
        cars.add(Car.of(UUID.randomUUID(), "Hyundai", 2020));
        cars.add(Car.of(UUID.randomUUID(), "Polonez", 1965));
        cars.add(Car.of(UUID.randomUUID(), "Lanos", 2001));
        cars.add(Car.of(UUID.randomUUID(), "Golf", 1988));
        cars.add(Car.of(UUID.randomUUID(), "Passeratti", 2015));
        cars.add(Car.of(UUID.randomUUID(), null, 2015));
    }
}

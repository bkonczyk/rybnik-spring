package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CarInitializer {

    private final CarService carService;

    @PostConstruct
    private void initializeCarsList() {
        List<Car> cars = carService.getCars();
        cars.add(Car.of("Hyundai", 2020));
        cars.add(Car.of("Polonez", 1965));
        cars.add(Car.of("Lanos", 2001));
        cars.add(Car.of("Golf", 1988));
        cars.add(Car.of("Passeratti", 2015));
        cars.add(Car.of(null, 2015));
    }
}

package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.util.UUID.randomUUID;

@Component
@RequiredArgsConstructor
public class CarInitializer {

    private final CarService carService;

    @PostConstruct
    private void initializeCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(null, "Hyundai", 2020, BigDecimal.valueOf(1000)));
        cars.add(new Car(null, "Polonez", 1965, BigDecimal.valueOf(2000)));
        cars.add(new Car(null, "Lanos", 2001, BigDecimal.valueOf(3000)));
        cars.add(new Car(null, "Golf", 1988, BigDecimal.valueOf(4000)));
        cars.add(new Car(null, "Passeratti", 2015, BigDecimal.valueOf(5000)));
        cars.add(new Car(null, null, 2015, BigDecimal.valueOf(6000)));
        carService.addCars(cars);
    }
}

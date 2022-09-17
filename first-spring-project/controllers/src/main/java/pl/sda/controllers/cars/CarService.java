package pl.sda.controllers.cars;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
class CarService {

    private final List<Car> cars = new ArrayList<>();

     List<Car> getCars() {
        return cars;
    }

     List<Car> getCarsByMake(String make) {
        return cars.stream()
                .filter(car -> make.equalsIgnoreCase(car.getMake()))
                .collect(toList());
    }

     void addCar(Car car) {
        cars.add(car);
    }

     void addCars(List<Car> cars) {
        this.cars.addAll(cars);
    }

    @PostConstruct
    private void initializeCarsList() {
        cars.add(Car.of("Hyundai", 2020));
        cars.add(Car.of("Polonez", 1965));
        cars.add(Car.of("Lanos", 2001));
        cars.add(Car.of("Golf", 1988));
        cars.add(Car.of("Passeratti", 2015));
        cars.add(Car.of(null, 2015));
    }

     void modifyFirst(Car car) {
        cars.set(0, car);
    }

     void removeAtIndex(int index) {
        cars.remove(index);
    }
}

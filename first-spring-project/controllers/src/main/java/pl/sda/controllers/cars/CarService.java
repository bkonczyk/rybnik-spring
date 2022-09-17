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

     void modifyFirst(Car car) {
        cars.set(0, car);
    }

     void removeAtIndex(int index) {
        cars.remove(index);
    }
}

package pl.sda.controllers.cars;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class CarService {

    private final List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsByMake(String make) {
        return cars.stream()
                .filter(car -> make.equalsIgnoreCase(car.getMake()))
                .collect(toList());
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCars(List<Car> cars) {
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

    public void modifyFirst(Car car) {
        cars.set(0, car);
    }

    public void removeAtIndex(int index) {
        cars.remove(index);
    }
}

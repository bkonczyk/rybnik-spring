package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
class CarService {

    private final CarMapper carMapper;
    private final List<Car> cars = new ArrayList<>();

    List<Car> getCars() {
        return cars;
    }

    List<CarListView> getCarViews() {
        return cars.stream()
                .map(carMapper::toCarListView)
                .collect(toList());
    }

    List<Car> getCarsByMake(String make) {
        return cars.stream()
                .filter(car -> make.equalsIgnoreCase(car.getMake()))
                .collect(toList());
    }

    void addCar(CreateCarRequest request) {
        Car car = carMapper.toCar(request);
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

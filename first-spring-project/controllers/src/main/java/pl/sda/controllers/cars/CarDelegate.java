package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CarDelegate {

    private final CarService service;

    public List<CarListView> getCars() {
        return service.getCarViews();
    }

    public List<Car> getCarsByMake(String make) {
        return service.getCarsByMake(make);
    }

    public void addCar(CreateCarRequest car) {
        service.addCar(car);
    }

    public void addCars(List<Car> cars) {
        service.addCars(cars);
    }

    public void modify(UUID id, Car car) {
        service.modify(id, car);
    }

    public void remove(UUID id) {
        service.remove(id);
    }
}

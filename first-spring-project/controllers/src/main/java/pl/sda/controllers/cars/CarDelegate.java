package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public void modifyFirst(Car car) {
        service.modifyFirst(car);
    }

    public void removeAtIndex(int index) {
        service.removeAtIndex(index);
    }
}

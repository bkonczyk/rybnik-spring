package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
class CarService {

    private final CarMapper mapper;
    private final CarRepository repository;

    List<Car> getCars() {
        return repository.findAll();
    }

    List<CarListView> getCarViews() {
        return getCars().stream()
                .map(mapper::toCarListView)
                .collect(toList());
    }

    List<Car> getCarsByMake(String make) {
        return repository.findAllByMakeIgnoreCase(make);
    }

    void addCar(CreateCarRequest request) {
        Car car = mapper.toCar(request);
        repository.save(car);
    }

    void addCars(List<Car> cars) {
        repository.saveAll(cars);
    }

    void modify(UUID id, Car car) {
        repository.findById(id).ifPresent(foundCar -> {
            Car updatedCar = new Car(id,
                    car.getMake(),
                    car.getYear(),
                    car.getPrice());
            repository.save(updatedCar);
        });
    }

    void remove(UUID id) {
        repository.deleteById(id);
    }
}

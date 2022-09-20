package pl.sda.controllers.cars;

import org.springframework.stereotype.Component;

import static java.util.UUID.randomUUID;

@Component
class CarMapper {

    CarListView toCarListView(Car car) {
        return new CarListView(car.getMake(), car.getYear());
    }

    Car toCar(CreateCarRequest request) {
        return new Car(null,
                request.getMake(),
                request.getYear(),
                request.getPrice()
        );
    }
}

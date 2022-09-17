package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
@Slf4j
class CarController {

    private final CarFacade carFacade;

    @GetMapping
    List<Car> getAllCars() {
        log.info("Received a request to get all cars");
        return carFacade.getCars();
    }

    @GetMapping("/{make}")
    List<Car> getAllCarsByMake(@PathVariable String make) {
        log.info("Received request to get {} cars", make);
        return carFacade.getCarsByMake(make);
    }

    @PostMapping
    void addCar(@RequestBody Car car) {
        log.info("Received request to add car {}", car);
        carFacade.addCar(car);
    }

    @PostMapping("/list")
    void addCars(@RequestBody List<Car> cars) {
        log.info("Received request to add list car {}", cars);
        carFacade.addCars(cars);
    }

    @PutMapping
    void modifyFirstCar(@RequestBody Car car) {
        log.info("Received request to modify first car {}", car);
        carFacade.modifyFirst(car);
    }

    @DeleteMapping("/{index}")
    void deleteAtIndex(@PathVariable Integer index) {
        log.info("Received request to remove car at index {}", index);
        carFacade.removeAtIndex(index);
    }
}

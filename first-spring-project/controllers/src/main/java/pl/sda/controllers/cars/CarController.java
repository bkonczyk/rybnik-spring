package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
@Slf4j
class CarController {

    private final CarDelegate carDelegate;

    @GetMapping
    List<Car> getAllCars() {
        log.info("Received a request to get all cars");
        return carDelegate.getCars();
    }

    @GetMapping("/{make}")
    List<Car> getAllCarsByMake(@PathVariable String make) {
        log.info("Received request to get {} cars", make);
        return carDelegate.getCarsByMake(make);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void addCar(@RequestBody Car car) {
        log.info("Received request to add car {}", car);
        carDelegate.addCar(car);
    }

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.CREATED)
    void addCars(@RequestBody List<Car> cars) {
        log.info("Received request to add list car {}", cars);
        carDelegate.addCars(cars);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void modifyFirstCar(@RequestBody Car car) {
        log.info("Received request to modify first car {}", car);
        carDelegate.modifyFirst(car);
    }

    @DeleteMapping("/{index}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteAtIndex(@PathVariable Integer index) {
        log.info("Received request to remove car at index {}", index);
        carDelegate.removeAtIndex(index);
    }
}

package pl.sda.controllers.cars;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
@Slf4j
public class CarController {

    private final CarService carService;

    @GetMapping
    List<Car> getAllCars() {
        log.info("Received a request to get all cars");
        return carService.getCars();
    }

    @GetMapping("/{make}")
    List<Car> getAllCarsByMake(@PathVariable String make) {
        log.info("Received request to get {} cars", make);
        return carService.getCarsByMake(make);
    }

    @PostMapping
    void addCar(@RequestBody Car car) {
        log.info("Received request to add car {}", car);
        carService.addCar(car);
    }

    @PostMapping("/list")
    void addCars(@RequestBody List<Car> cars) {
        log.info("Received request to add list car {}", cars);
        carService.addCars(cars);
    }

    @PutMapping
    void modifyFirstCar(@RequestBody Car car) {
        log.info("Received request to modify first car {}", car);
        carService.modifyFirst(car);
    }

    @DeleteMapping("/{index}")
    void deleteAtIndex(@PathVariable Integer index) {
        log.info("Received request to remove car at index {}", index);
        carService.removeAtIndex(index);
    }
}

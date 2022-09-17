package pl.sda.controllers.cars;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Data
class Car {

    private final String make;
    private final Integer year;
}

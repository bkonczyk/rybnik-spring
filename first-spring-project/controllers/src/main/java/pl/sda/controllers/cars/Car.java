package pl.sda.controllers.cars;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(staticName = "of")
@Data
class Car {

    private final UUID id;
    private final String make;
    private final Integer year;
}

package pl.sda.controllers.cars;

import lombok.Data;

@Data
public class CreateCarRequest {
    private final String make;
    private final Integer year;
}

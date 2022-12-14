package pl.sda.controllers.cars;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateCarRequest {
    private final String make;
    private final Integer year;
    private final BigDecimal price;
}

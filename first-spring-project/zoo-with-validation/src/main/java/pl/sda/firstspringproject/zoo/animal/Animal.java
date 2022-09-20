package pl.sda.firstspringproject.zoo.animal;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
public class Animal {

    private final UUID id;
    @NotNull(message = "Animal name cannot be null")
    @Length(min = 2, max = 20, message = "Name should be between 2 to 20 letters")
    private final String name;
    @Size(max = 10, message = "Kind max size is 10")
    private final String kind;
    @Min(value = 0, message = "Minimum age is 0")
    @Max(value = 60, message = "Max value is 60")
    private final Integer age;
}

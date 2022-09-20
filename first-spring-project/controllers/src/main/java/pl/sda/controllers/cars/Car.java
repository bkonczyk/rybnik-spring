package pl.sda.controllers.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor
@Data
class Car {

    @Id
    @GeneratedValue
    @Type(type="uuid-char")
    private UUID id;
    private String make;
    private Integer year;
    private BigDecimal price;
}

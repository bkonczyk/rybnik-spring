package pl.sda.controllers.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
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
    @Column(name = "make")
    private String make;
    @Column(name = "yeaaa")
    private Integer year;
    @Column(name = "asd")
    private BigDecimal price;
}

package pl.sda.data.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "people")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    @Type(type="uuid-char")
    private UUID id;

    private String name;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Sex sex;
}

enum Sex {
    M, F
}


package pl.sda.data.person;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

interface PersonRepository extends JpaRepository<Person, UUID> {

    List<Person> findAllByAgeGreaterThan(Integer age);

    List<Person> findAllByAgeGreaterThanAndName(Integer age, String name);

    List<Person> findAllByAgeGreaterThanEqualAndNameAndSex(Integer age, String name, Sex sex);

    List<Person> findAllByNameIsIn(Set<String> names);

    List<Person> findAllByAgeBetween(Integer from, Integer to);
}

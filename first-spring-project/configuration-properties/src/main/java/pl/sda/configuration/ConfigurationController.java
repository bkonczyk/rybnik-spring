package pl.sda.configuration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
@Getter
@Setter
@RequiredArgsConstructor
public class ConfigurationController {

    @Value("${pl.sda.message}")
    private String message;

    private final Person person;

    @GetMapping
    String getMessage() {
        return message;
    }

    @GetMapping("/person")
    Person getPerson() {
        return person;
    }
}

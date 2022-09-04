package pl.sda.advancedinjection.circular;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceA {

    private final ServiceB serviceB;
}

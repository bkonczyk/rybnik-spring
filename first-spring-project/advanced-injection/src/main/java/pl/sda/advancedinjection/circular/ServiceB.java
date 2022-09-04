package pl.sda.advancedinjection.circular;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceB {

//    circular dependency if uncommented
//    private final ServiceA serviceA;
}

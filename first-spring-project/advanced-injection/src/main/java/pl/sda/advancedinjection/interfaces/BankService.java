package pl.sda.advancedinjection.interfaces;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class BankService {

    private final AccountProvider creditAccountProvider;

    @PostConstruct
    void whichAccountProvider() {
        log.info(creditAccountProvider.getAccount());
    }
}

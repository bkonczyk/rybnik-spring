package pl.sda.advancedinjection.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankServiceConfiguration {

    @Bean
    BankService bankService(AccountProvider debitAccountProvider) {
        return new BankService(debitAccountProvider);
    }
}

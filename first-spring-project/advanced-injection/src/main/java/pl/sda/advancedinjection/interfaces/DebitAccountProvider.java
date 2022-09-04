package pl.sda.advancedinjection.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DebitAccountProvider implements AccountProvider {

    @Override
    public String getAccount() {
        return "DEBIT";
    }
}

package testDataGenerators;

import entities.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class CustomerGenerator {

    private final static Logger log = LoggerFactory.getLogger(CustomerGenerator.class);

    public static Customer generateCustomer(Locale locale, String password) {
        CustomerDataFaker faker = new CustomerDataFaker(locale);

        Customer customer = Customer.builder()
                .username(faker.username())
                .firstName(faker.firstName())
                .lastName(faker.lastName())
                .email(faker.email())
                .password(password)
                .build();

        log.info("Generated customer = {}", customer);

        return customer;
    }
}

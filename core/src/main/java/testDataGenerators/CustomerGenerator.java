package testDataGenerators;

import entities.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class CustomerGenerator {

    private final static Logger log = LoggerFactory.getLogger(CustomerGenerator.class);

    public static Customer generateCustomer(Locale locale, String password) {
        log.info("Generating a new customer");

        CustomerDataFaker faker = new CustomerDataFaker(locale);

        Customer customer = Customer.builder()
                .username(faker.username())
                .firstName(faker.firstName())
                .lastName(faker.lastName())
                .email(faker.email())
                .password(password)
                .build();

        log.info("The customer is generated");
        log.debug("Generated customer = {} on local = {}", customer, locale);

        return customer;
    }
}

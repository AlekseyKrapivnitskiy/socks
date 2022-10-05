package testDataGenerators;

import entities.Customer;

import java.util.Locale;

public class CustomerGenerator {

    public static Customer generateCustomer(Locale locale, String password) {
        CustomerDataFaker faker = new CustomerDataFaker(locale);

        return Customer.builder()
                .username(faker.username())
                .firstName(faker.firstName())
                .lastName(faker.lastName())
                .email(faker.email())
                .password(password)
                .build();
    }
}

package testDataGenerators;

import com.github.javafaker.Faker;

import java.util.Locale;

import static utils.ConfigProperties.getProperty;

public class CustomerDataFaker {

    private String firstName;
    private String lastName;
    private String email;

    public CustomerDataFaker(Locale locale) {
        Faker faker = new Faker(locale);

        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        email = firstName.toLowerCase(Locale.ROOT).trim() + lastName.toLowerCase(Locale.ROOT).trim() + "@" +
                getProperty("emailDomain");
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String email() {
        return email;
    }
}

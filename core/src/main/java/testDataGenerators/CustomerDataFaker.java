package testDataGenerators;

import com.github.javafaker.Faker;

import java.util.Locale;

import static utils.ConfigProperties.getProperty;

public class CustomerDataFaker {

    private String username;
    private String firstName;
    private String lastName;
    private String email;

    public CustomerDataFaker(Locale locale) {
        Faker faker = new Faker(locale);

        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        username = firstName.trim() + lastName.trim();
        email = username.toLowerCase() + "@" + getProperty("emailDomain");
    }

    public String username() {
        return username;
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

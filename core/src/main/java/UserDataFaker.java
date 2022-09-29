import com.github.javafaker.Faker;

import java.util.Locale;

public class UserDataFaker {

    private String firstName;
    private String lastName;
    private String email;

    public UserDataFaker(Locale locale) {
        Faker faker = new Faker(locale);

        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        email = firstName.toLowerCase(Locale.ROOT).trim() + lastName.toLowerCase(Locale.ROOT).trim() + "@test.com";//todo to config
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

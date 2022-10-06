package utils.passwordGenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import testDataGenerators.CustomerGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {

    private final static Logger log = LoggerFactory.getLogger(CustomerGenerator.class);

    public static String generatePassword(PasswordPolicy passwordPolicy) {
        log.info("Generating password with the password policy = {}", passwordPolicy);

        String LOWER = "abcdefghijklmnopqrstuvwxyz";
        String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String DIGITS = "0123456789";
        String PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";

        StringBuilder password = new StringBuilder(passwordPolicy.getLength());
        Random random = new Random(System.nanoTime());

        List<String> charCategories = new ArrayList<>();
        if (passwordPolicy.isUseLower()) {
            charCategories.add(LOWER);
        }
        if (passwordPolicy.isUseUpper()) {
            charCategories.add(UPPER);
        }
        if (passwordPolicy.isUseDigits()) {
            charCategories.add(DIGITS);
        }
        if (passwordPolicy.isUsePunctuation()) {
            charCategories.add(PUNCTUATION);
        }

        for (int i = 0; i < passwordPolicy.getLength(); i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }

        log.info("Generated password = {}", password);

        return password.toString();
    }

}
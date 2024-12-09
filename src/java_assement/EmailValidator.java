package java_assement;

// Your imports here:
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    // Your code below:
    private static final String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern pattern = Pattern.compile(emailRegex);


    public static boolean isValidEmail(String email) {
        // Implement this method:

        if (email == null || email.isEmpty()) {
            return false;
        }
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {
        String[] emails = {
                "example@example.com",
                "test.email@example.com",
                "test-email@example.co.uk",
                "user123@example-domain.com",
                "invalid_email.com",
                "invalid-email@example.",
                "invalid-email@.com"
        };

        for (String email : emails) {
            System.out.println(email + " is valid? " + isValidEmail(email));
        }
    }
}

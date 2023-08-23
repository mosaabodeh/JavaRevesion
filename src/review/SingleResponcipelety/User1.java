package review.SingleResponcipelety;

import java.time.LocalDate;

// User class with multiple responsibilities
public class User1 {
    private String username;
    private String email;
    private LocalDate registrationDate;

    public User1(String username, String email) {
        this.username = username;
        this.email = email;
        this.registrationDate = LocalDate.now();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    // Violation: Additional responsibility of sending email moved here
    public void sendRegistrationEmail() {
        System.out.println("Sending registration email to: " + email);
        // Logic to send registration email
    }

    // Violation: Additional responsibility of validating user moved here
    public boolean isValid() {
        // Logic to validate user
        return true;
    }

    public static void main(String[] args) {
        User1 newUser1 = new User1("john_doe", "john@example.com");

        // Violation: User object now responsible for sending email and validation
        newUser1.sendRegistrationEmail();
        if (newUser1.isValid()) {
            System.out.println("User is valid.");
        } else {
            System.out.println("User is not valid.");
        }
    }
}


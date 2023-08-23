package review.SingleResponcipelety;


import java.time.LocalDate;

// User class with multiple responsibilities
class User {
    private String username;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    private LocalDate registrationDate;

    public User(String username, String email) {
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


    // Violation: Additional responsibility of validating user moved here




    public static void main(String[] args) {
        User newUser = new User("john_doe", "john@example.com");
        Email e = new Email(newUser);
        AtDate d= new AtDate(newUser);
        IsValid is=new IsValid();

       d.sendingdateAndTime();
        e.sendRegistrationEmail();
        if (is.isValid()) {
            System.out.println("User is valid.");
        } else {
            System.out.println("User is not valid.");
        }
    }
}
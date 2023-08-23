package review.SingleResponcipelety;

public class Email {
  String email;

    public Email(User newUser1) {
    this.email=newUser1.getEmail();
    }

    public void sendRegistrationEmail() {
        System.out.println("Sending registration email to: " + email);
        // Logic to send registration email
    }
}

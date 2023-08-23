package review.SingleResponcipelety;

import java.time.LocalDate;

public class AtDate {
    LocalDate dateNow;

    public AtDate(User newUser1) {
        this.dateNow=newUser1.getRegistrationDate();
    }

    public void sendingdateAndTime() {
        System.out.println("At Date & Time: " + dateNow);
        // Logic to send registration email
    }
}

package review.Liskov.Implementatuon;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(); // Creating an Ostrich object
        Ostrich os=new Ostrich();
        bird.Eat();
        bird.fly();
        os.Eat();

    }

}

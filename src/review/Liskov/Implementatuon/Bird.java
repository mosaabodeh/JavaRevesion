package review.Liskov.Implementatuon;

import review.Liskov.Interfaces.IFly;

public class Bird implements IFly {

    @Override
    public void fly() {
        System.out.println("hello iam Bird can Flay easy");
    }
    public void Eat(){
        System.out.println("hello i can eat Brid");
    }
}

package review.InterfaceSuggestsion.Implementation;

import review.InterfaceSuggestsion.Interfaces.IEat;
import review.InterfaceSuggestsion.Interfaces.IWork;


public class Human implements IWork, IEat {
    @Override
    public void Eat() {
        System.out.println("hello iam Human i can Eat !");
    }

    @Override
    public void work() {
        System.out.println("hello iam human , i can Work ! ");

    }
}

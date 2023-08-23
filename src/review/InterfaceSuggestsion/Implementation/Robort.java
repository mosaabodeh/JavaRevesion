package review.InterfaceSuggestsion.Implementation;

import review.InterfaceSuggestsion.Interfaces.IWork;

public class Robort implements IWork {
    @Override
    public void work() {
        System.out.println("hello iam robot i can Work");
    }
}

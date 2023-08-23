package review.InterfaceSuggestsion;

public class inter {

    interface Worker {
        void work();
        void eat();
    }

    class Human implements Worker {
        @Override
        public void work() {
            System.out.println("Human is working");
            // Working implementation
        }

        @Override
        public void eat() {
            System.out.println("Human is eating");
            // Eating implementation
        }
    }

    class Robot implements Worker {
        @Override
        public void work() {
            System.out.println("Robot is working");
            // Working implementation
        }

        @Override
        public void eat() {
            // This method doesn't make sense for a robot
            throw new UnsupportedOperationException("Robots don't eat");
        }
    }

    public class Main {
        public void main(String[] args) {
            Worker humanWorker = new Human();
            Worker robotWorker = new Robot();

            humanWorker.work();
            humanWorker.eat();

            robotWorker.work();
            robotWorker.eat(); // This will throw an exception for Robot
        }
    }

}

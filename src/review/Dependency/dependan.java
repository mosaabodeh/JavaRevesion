/*
package review.Dependency;

public class dependan {
    class LightBulb {
        public void turnOn() {
            System.out.println("Light bulb turned on");
        }

        public void turnOff() {
            System.out.println("Light bulb turned off");
        }
    }

    class Switch {
        private LightBulb bulb;

        public Switch() {
            bulb = new LightBulb();
        }

        public void flip() {
            if (bulb != null) {
                if (isOn()) {
                    bulb.turnOff();
                } else {
                    bulb.turnOn();
                }
            }
        }

        public boolean isOn() {
            // Check bulb's status
            return false;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Switch lightSwitch = new Switch();
            lightSwitch.flip();
        }
    }

}
*/

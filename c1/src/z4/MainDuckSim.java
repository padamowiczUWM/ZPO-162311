package z4;

import java.util.ArrayList;

public class MainDuckSim {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck(new FlyingWithWings(), new Quack()));
        ducks.add(new RubberDuck(new FlyingNoWay(), new Squeak()));
        ducks.add(new ModelDuck(new FlyingNoWay(), new MuteQuack()));

        for(Duck duck: ducks) {
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }

        ducks.get(1).setFlyingBehavior(new FlyingBehavior() {
            @Override
            public void fly() {
                System.out.println("Duck is flying with a rocket!");
            }
        });

        ducks.get(1).performFly();
    }
}

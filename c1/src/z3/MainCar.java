package z3;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(new Mazda3(), new FastCar()));
        cars.add(new Car(new Fiat126p(), new SlowCar()));

        for(Car car: cars) {
            car.showCarName();
            System.out.printf("%d km/h\n", car.getMaxSpeed());
        }
    }
}

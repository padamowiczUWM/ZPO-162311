package z3;

public class Car {
    CarName carName;
    CarSpeed carSpeed;

    public Car(CarName carName, CarSpeed carSpeed) {
        this.carName = carName;
        this.carSpeed = carSpeed;
    }

    public int getMaxSpeed() {
        return carSpeed.getMaxSpeed();
    }

    public void showCarName() {
        carName.showCarName();
    }
}

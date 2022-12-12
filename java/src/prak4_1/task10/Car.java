package prak4_1.task10;

public class Car extends TransportVehicle {
    public Car(int speed, int countOfPassengers) {
        super(speed, countOfPassengers, (long)((1 + countOfPassengers / 5) * 3.7 * 50 / 100));
    }
}
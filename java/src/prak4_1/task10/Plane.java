package prak4_1.task10;

public class Plane extends TransportVehicle {
    public Plane(int speed, int countOfPassengers) {
        super(speed, countOfPassengers, (long)(countOfPassengers / 50 * 68291 / 100));
    }
}

package builder.impl;

import builder.Builder;
import builder.Car;

public class CarBuilder implements Builder {

    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int num) {
        car.setSeats(num);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String computer) {
        car.setTripComputer(computer);
    }

    @Override
    public void setGPS(String GPS) {
        car.setGPS(GPS);
    }

    public Car getResult() {
        return car;
    }
}

package builder.impl;

import builder.Builder;
import builder.CarManual;

public class CarManualBuilder implements Builder {

    private CarManual carManual;

    @Override
    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public void setSeats(int num) {
        carManual.setSeats(num);
    }

    @Override
    public void setEngine(String engine) {
        carManual.setEngine(engine);
    }

    @Override
    public void setTripComputer(String computer) {
        carManual.setTripComputer(computer);
    }

    @Override
    public void setGPS(String GPS) {
        carManual.setGPS(GPS);
    }

    public CarManual getResult() {
        return carManual;
    }
}

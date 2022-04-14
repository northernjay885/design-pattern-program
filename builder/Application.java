package builder;

import builder.impl.CarBuilder;
import builder.impl.CarManualBuilder;

public class Application {

    void makeCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getResult();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportCar(carManualBuilder);

        CarManual carManual = carManualBuilder.getResult();
    }
}

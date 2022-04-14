package builder;

public class Director {

//    private Builder builder;
//
//    void setBuilder(Builder builder) {
//        this.builder = builder;
//    }

    void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
    }

    void constructSUV(Builder builder) {
        builder.reset();
        builder.setEngine("Engine");
    }

}

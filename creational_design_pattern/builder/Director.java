package creational_design_pattern.builder;

public class Director {

//    private Builder creational_design_pattern.builder;
//
//    void setBuilder(Builder creational_design_pattern.builder) {
//        this.creational_design_pattern.builder = creational_design_pattern.builder;
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

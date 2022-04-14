package creational_design_pattern.builder;

public interface Builder {
    void reset();
    void setSeats(int num);
    void setEngine(String engine);
    void setTripComputer(String computer);
    void setGPS(String GPS);
}

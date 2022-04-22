package structural_design_pattern.decorator;

public interface DataSource {

    void writeData(String data);
    String readData();
}

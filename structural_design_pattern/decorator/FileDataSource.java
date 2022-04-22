package structural_design_pattern.decorator;

public class FileDataSource implements DataSource {
    @Override
    public void writeData(String data) {
        // Write data to file.
    }

    @Override
    public String readData() {
        // Read data from file.
        return null;
    }
}

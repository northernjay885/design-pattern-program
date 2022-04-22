package structural_design_pattern.decorator;

import structural_design_pattern.decorator.DataSource;
import structural_design_pattern.decorator.DataSourceDecorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        // Compress passed data
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        // Decompress the data
        return data;
    }
}

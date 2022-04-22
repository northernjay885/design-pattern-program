package structural_design_pattern.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        // Encrypt passed data
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        // Decrypt the data
        return data;
    }
}

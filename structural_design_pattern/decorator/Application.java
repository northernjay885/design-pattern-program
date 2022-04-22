package structural_design_pattern.decorator;

public class Application {

    void dumbUsageExample() {
        DataSource source = new FileDataSource();
        source.writeData("wahaha");

        source = new CompressionDecorator(source);
        source.writeData("wahaha");

        source = new EncryptionDecorator(source);
        source.writeData("wahaha");
        // The source variable now contains this:
        // Encryption > Compression > FileDataSource
    }
}

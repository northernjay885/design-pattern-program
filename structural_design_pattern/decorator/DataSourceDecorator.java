package structural_design_pattern.decorator;

public class DataSourceDecorator implements DataSource {

    public DataSourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }

    protected DataSource wrappee;

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
        // some operations
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}

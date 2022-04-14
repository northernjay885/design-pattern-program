package creational_design_pattern.abstract_factory;

public class Application {

    private Button button;
    private CheckBox checkBox;
    private final GUIFactory factory;

    public Application(GUIFactory guiFactory) {
        this.factory = guiFactory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}

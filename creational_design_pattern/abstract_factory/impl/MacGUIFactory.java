package creational_design_pattern.abstract_factory.impl;

import creational_design_pattern.abstract_factory.Button;
import creational_design_pattern.abstract_factory.CheckBox;
import creational_design_pattern.abstract_factory.GUIFactory;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

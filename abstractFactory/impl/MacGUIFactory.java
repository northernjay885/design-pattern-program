package abstractFactory.impl;

import abstractFactory.Button;
import abstractFactory.CheckBox;
import abstractFactory.GUIFactory;

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

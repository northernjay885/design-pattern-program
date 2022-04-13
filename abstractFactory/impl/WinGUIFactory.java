package abstractFactory.impl;

import abstractFactory.Button;
import abstractFactory.CheckBox;
import abstractFactory.GUIFactory;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}

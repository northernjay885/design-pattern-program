package creational_design_pattern.abstract_factory;

import creational_design_pattern.abstract_factory.impl.MacGUIFactory;
import creational_design_pattern.abstract_factory.impl.WinGUIFactory;


public class ApplicationConfigurator {



    public static void main(String[] args) throws Exception {
        String osInfo = System.getProperty("os.name");
        GUIFactory guiFactory;
        if ("Windows".equals(osInfo)) {
            guiFactory = new WinGUIFactory();
        } else if ("Mac".equals(osInfo)) {
            guiFactory = new MacGUIFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }

        Application app = new Application(guiFactory);
    }
}

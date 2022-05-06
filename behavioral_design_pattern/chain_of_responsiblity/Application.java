package behavioral_design_pattern.chain_of_responsiblity;

public class Application {

    public void createUI() {
        Dialog dialog = new Dialog();
        dialog.wikiPageURL = "http://...";
        Panel panel = new Panel();
        panel.modalHelpText = "This panel does...";
        Button ok = new Button();
        ok.tooltipText = "This is an OK button that...";
        Button cancel = new Button();
        // ...
        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);
    }
}

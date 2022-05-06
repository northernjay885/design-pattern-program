package behavioral_design_pattern.chain_of_responsiblity;

public class Panel extends Container {

    public String modalHelpText;

    @Override
    public void showHelp() {
        if (modalHelpText != null) {
            // Show a modal window with the help text.
        } else {
            super.showHelp();
        }
    }
}

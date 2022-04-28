package behavior_design_pattern.chain_of_responsiblity;

public abstract class Component implements ComponentWithContextualHelp {
    protected Container container;
    public String tooltipText;

    @Override
    public void showHelp() {
        if (tooltipText != null) {
            // Show tooltip.
        }
    }
}

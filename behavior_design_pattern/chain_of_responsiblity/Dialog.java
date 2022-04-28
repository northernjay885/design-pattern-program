package behavior_design_pattern.chain_of_responsiblity;

public class Dialog extends Container {
    public String  wikiPageURL;

    public void showHelp() {
        if (wikiPageURL != null) {
            // Open the wiki help page.
        } else {
            super.showHelp();
        }
    }
}

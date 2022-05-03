package behavior_design_pattern.mediator;

public class Component {

    Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    void click() {
        dialog.notify(this, "click");
    }

    void keypress() {
        dialog.notify(this, "keypress");
    }
}

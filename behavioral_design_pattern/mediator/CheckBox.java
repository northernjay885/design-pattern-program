package behavioral_design_pattern.mediator;

public class CheckBox extends Component{

    public boolean checked;
    public CheckBox(Mediator dialog) {
        super(dialog);
    }

    public void check() {
        dialog.notify(this, "check");
    }

}

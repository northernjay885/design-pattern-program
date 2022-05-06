package behavioral_design_pattern.mediator;

public class AuthenticationDialog implements Mediator {

    private String title;
    private CheckBox loginOrRegisterChkBx;
    private TextBox loginUsername, loginPassword;
    private TextBox registrationUsername, registrationPassword, registrationEmail;
    private Button okBtn, cancelBtn;

    public AuthenticationDialog() {
        this.loginOrRegisterChkBx = new CheckBox(this);
        this.loginUsername = new TextBox(this);
        this.loginPassword = new TextBox(this);
        this.registrationUsername = new TextBox(this);
        this.registrationPassword = new TextBox(this);
        this.registrationEmail = new TextBox(this);
        this.okBtn = new Button(this);
        this.cancelBtn = new Button(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterChkBx && "check".equals(event)) {
            if (loginOrRegisterChkBx.checked) {
                title = "Log in";
            } else {
                title = "Register";
            }
        }

        if (sender == okBtn && "click".equals(event)) {
            if (loginOrRegisterChkBx.checked) {
                // Try to find a user using login credentials.
                if (!found()) {

                }
            } else {
                // Create a user account using data from the registration fields.
            }
        }
    }

    private boolean found() {
        return false;
    }
}

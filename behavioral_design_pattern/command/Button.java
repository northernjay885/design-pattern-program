package behavioral_design_pattern.command;

public class Button {
    public Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}

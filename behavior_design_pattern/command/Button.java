package behavior_design_pattern.command;

import behavior_design_pattern.command.Command;

public class Button {
    public Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}

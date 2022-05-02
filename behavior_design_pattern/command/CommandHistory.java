package behavior_design_pattern.command;

import java.util.Deque;

public class CommandHistory {
    Deque<Command> history;

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }
}

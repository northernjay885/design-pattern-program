package behavior_design_pattern.command;

import java.util.List;

public class Application {

    public String clipboard;
    private List<Editor> editors;
    private Editor activeEditor;
    private CommandHistory history;

    public void createUI() {
        Command copy = executeCommand(new CopyCommand(this, activeEditor));
        Button copyButton = new Button();
        copyButton.setCommand(copy);
        ShortCuts shortCuts = new ShortCuts();
        shortCuts.onKeyPress("Ctrl+C", copy);

        Command cut = executeCommand(new CutCommand(this, activeEditor));
        Button cutButton = new Button();
        cutButton.setCommand(cut);
        shortCuts.onKeyPress("Ctrl+X", cut);

        Command paste = executeCommand(new PasteCommand(this, activeEditor));
        Button pasteButton = new Button();
        pasteButton.setCommand(paste);
        shortCuts.onKeyPress("Ctrl+V", paste);

        Command undo = executeCommand(new UndoCommand(this, activeEditor));
        Button undoButton = new Button();
        undoButton.setCommand(undo);
        shortCuts.onKeyPress("Ctrl+Z", undo);
    }

    public Command executeCommand(Command c) {
        if (c.execute()) {
            history.push(c);
        }
        return c;
    }

    public void undo() {
        Command c = history.pop();
        if (c != null) {
            c.undo();
        }
    }
}

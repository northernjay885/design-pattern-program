package behavior_design_pattern.command;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        return true;
    }
}

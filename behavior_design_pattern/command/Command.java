package behavior_design_pattern.command;

public abstract class Command {

    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup() {
        this.backup = editor.text;
    }

    public void undo() {
        editor.text = backup;
    }

    public abstract boolean execute();
}

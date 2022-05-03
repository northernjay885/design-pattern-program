package behavior_design_pattern.memento;

public class Command {
    private Editor.Snapshot backup;
    private Editor editor;

    public void makeBackup() {
        backup = editor.createSnapshot();
    }

    public void undo() {
        if (backup != null) {
            editor.restore(backup);
        }
    }
}

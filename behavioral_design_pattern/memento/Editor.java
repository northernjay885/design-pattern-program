package behavioral_design_pattern.memento;

public class Editor {

    class Snapshot {
        private Editor editor;
        private String text, curX, curY, selectionWidth;

        private Snapshot(Editor editor, String text, String curX, String curY, String selectionWidth) {
            this.editor = editor;
            this.text = text;
            this.curX = curX;
            this.curY = curY;
            this.selectionWidth = selectionWidth;
        }

        private void restore() {
            editor.setText(text);
            editor.setCursor(curX, curY);
            editor.setSelectionWidth(selectionWidth);
        }
    }

    private String text, curX, curY, selectionWidth;

    void setText(String text) {
        this.text = text;
    }

    void setCursor(String x, String y) {
        this.curX = x;
        this.curY = y;
    }

    void setSelectionWidth(String width) {
        this.selectionWidth = width;
    }

    Snapshot createSnapshot() {
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }

    void restore(Snapshot snapshot) {
        snapshot.restore();
    }
}

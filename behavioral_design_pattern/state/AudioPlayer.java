package behavioral_design_pattern.state;

import java.util.List;

public class AudioPlayer {

    private State state;
    private UserInterface ui;
    private int volume;
    private List<String> playlist;
    private String currentSong;
    protected boolean playing;

    public AudioPlayer() {
        this.state = new ReadyState(this);

        ui = new UserInterface();
//        ui.lockButton.onClick(this::clickLock);
    }


    public void changeState(State state) {
        this.state = state;
    }

    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }

    public void startPlayback() {

    }

    public void stopPlayback() {

    }

    public void nextSong() {

    }

    public void previousSong() {

    }

    public void fastForward(int time) {

    }

    public void rewind(int time) {

    }


}

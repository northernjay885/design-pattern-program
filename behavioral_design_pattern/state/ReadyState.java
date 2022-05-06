package behavioral_design_pattern.state;

public class ReadyState extends State {

    Event event;
    public ReadyState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
        player.changeState(new LockState(player));
    }

    @Override
    public void clickPlay() {
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void clickNext() {
        if (event.doubleClick) {
            player.nextSong();
        } else {
            player.fastForward(5);
        }
    }

    @Override
    public void clickPrevious() {
        if (event.doubleClick) {
            player.previousSong();
        } else {
            player.rewind(5);
        }
    }
}

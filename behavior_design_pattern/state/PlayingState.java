package behavior_design_pattern.state;

public class PlayingState extends State {

    Event event;
    public PlayingState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
        player.changeState(new LockState(player));
    }

    @Override
    public void clickPlay() {
        player.stopPlayback();
        player.changeState(new ReadyState(player));
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

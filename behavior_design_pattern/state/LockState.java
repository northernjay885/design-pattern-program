package behavior_design_pattern.state;

public class LockState extends State {

    public LockState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
        if (player.playing) {
            player.changeState(new PlayingState(player));
        } else {
            player.changeState(new ReadyState(player));
        }
    }

    @Override
    public void clickPlay() {
        //locked, so do nothing
    }

    @Override
    public void clickNext() {

    }

    @Override
    public void clickPrevious() {

    }
}

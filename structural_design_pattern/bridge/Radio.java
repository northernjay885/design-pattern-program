package structural_design_pattern.bridge;

public class Radio implements Device {
    @Override
    public boolean isEnable() {
        return false;
    }

    @Override
    public void disable() {

    }

    @Override
    public void enable() {

    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public int getChannel() {
        return 0;
    }

    @Override
    public void setVolume(int percent) {

    }

    @Override
    public void setChannel(int channel) {

    }
}

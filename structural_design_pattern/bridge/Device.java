package structural_design_pattern.bridge;

public interface Device {
    boolean isEnable();

    void disable();

    void enable();

    int getVolume();

    int getChannel();

    void setVolume(int percent);

    void setChannel(int channel);
}


package behavior_design_pattern.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingListener implements EventListener {

    private File log;
    private String message;

    public LoggingListener(String logFilename, String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    @Override
    public void update(String data) {
        try (FileWriter writer = new FileWriter(log)) {
            writer.write(data);
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}

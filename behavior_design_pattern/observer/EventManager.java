package behavior_design_pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListener>> listeners;

    public EventManager() {

    }

    public void subscribe(String eventType, EventListener listener) {
        listeners.putIfAbsent(eventType, new ArrayList<>());
        listeners.get(eventType).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, String data) {
        for (EventListener listener : listeners.get(eventType)) {
            listener.update(data);
        }
    }
}

package behavior_design_pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {

    private final Facebook facebook;
    private final String profileId;
    private final String type;

    private int curPos;
    private List<Profile> cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = new ArrayList<>();
        }
    }

    @Override
    public Profile getNext() {
        if (hasNext()) {
            curPos++;
        }
        return cache.get(curPos);
    }

    @Override
    public boolean hasNext() {
        lazyInit();
        return cache.size() < curPos;
    }
}

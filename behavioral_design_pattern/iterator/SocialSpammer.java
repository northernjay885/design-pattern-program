package behavioral_design_pattern.iterator;

public class SocialSpammer {
    void send(ProfileIterator iterator, String message) {
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            System.out.println(profile);
        }
    }
}

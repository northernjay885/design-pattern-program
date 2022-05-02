package behavior_design_pattern.iterator;

public class Application {
    SocialNetwork socialNetwork;
    SocialSpammer socialSpammer;

    public void config() {
        //if working with Facebook
        this.socialNetwork = new Facebook();
        this.socialSpammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = socialNetwork.createFriendsIterator(profile.getId());
        socialSpammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = socialNetwork.createCoworkersIterator(profile.getId());
        socialSpammer.send(iterator, "Very important message");
    }
}

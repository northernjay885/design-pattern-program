package structural_design_pattern.proxy;

public class Application {

    public static void main(String[] args) {

        ThirdPartyYoutubeLib aYoutubeService = new ThirdPartyYoutube();
        ThirdPartyYoutubeLib aYoutubeProxy = new CachedYoutube(aYoutubeService);
        YoutubeManager manager = new YoutubeManager(aYoutubeProxy);
        manager.renderListPanel();

    }
}

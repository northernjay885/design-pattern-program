package structural_design_pattern.proxy;

import java.util.List;

public class YoutubeManager {

    protected ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id) {
        String info = service.getVideoInfo(id);
    }

    public void renderListPanel() {
        List<String> list = service.listVideos();
    }

}

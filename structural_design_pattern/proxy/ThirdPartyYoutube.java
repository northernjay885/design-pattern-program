package structural_design_pattern.proxy;

import java.util.List;

public class ThirdPartyYoutube implements ThirdPartyYoutubeLib {


    @Override
    public List<String> listVideos() {
        return null;
    }

    @Override
    public String getVideoInfo(int id) {
        return null;
    }

    @Override
    public void downloadVideo(int id) {
    }
}

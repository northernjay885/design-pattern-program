package structural_design_pattern.proxy;

import java.util.List;

public interface ThirdPartyYoutubeLib {

    List<String> listVideos();
    String getVideoInfo(int id);
    void downloadVideo(int id);

}

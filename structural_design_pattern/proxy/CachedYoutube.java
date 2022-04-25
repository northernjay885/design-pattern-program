package structural_design_pattern.proxy;

import java.util.List;

public class CachedYoutube implements ThirdPartyYoutubeLib {

    private final ThirdPartyYoutubeLib thirdPartyService;
    private String videoCache;
    private List<String> listCache;
    private boolean needReset;

    public CachedYoutube(ThirdPartyYoutubeLib service) {
        this.thirdPartyService = service;
    }

    @Override
    public List<String> listVideos() {
        if (listCache == null || needReset) {
            listCache = thirdPartyService.listVideos();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        if (videoCache == null || needReset) {
            videoCache = thirdPartyService.getVideoInfo(id);
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        if(!downloadExist(id) || needReset) {
            thirdPartyService.downloadVideo(id);
        }
    }

    private boolean downloadExist(int id) {
        return true;
    }
}

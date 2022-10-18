
public class VideoEncoder implements IVideoEncoder {

    @Override
    public void encode(Video video) {
        System.out.println(video.getTitle() + " has been encoded.");
    }

}

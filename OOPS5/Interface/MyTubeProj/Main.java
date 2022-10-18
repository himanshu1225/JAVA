
public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setTitle("My First Video");
        video.setDesc("This is my first ever video on youtube");
        video.setAuthor(new Author("Himanshu", "himanshu12b@gmail.com"));

        // VideoProcessor processor = new VideoProcessor();
        // processor.process(video);

        VideoProcessor processor = new VideoProcessor(new VideoEncoder(), new SqlDB(), new Gmail());
        processor.process(video);

    }
}
public class VideoProcessor {
    private IVideoEncoder encoder;
    private IDataBase database;
    private IEmailService service;

    public VideoProcessor(IVideoEncoder encoder, IDataBase dataBase, IEmailService service) {
        this.encoder = encoder;
        this.database = dataBase;
        this.service = service;
    }

    public void process(Video video) {
        // video encoding
        // VideoEncoder encoder = new VideoEncoder();
        // encoder.encode(video);

        // store video info in DB
        // VideoDB database = new VideoDB();
        // database.store(video);

        // send email to user that video got uploaded.
        // EmailService service = new EmailService();
        // service.sendMail(video.getAuthor());

        encoder.encode(video);
        database.store(video);
        service.sendMail(video.getAuthor());
    }

}

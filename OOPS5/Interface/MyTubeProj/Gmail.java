
public class Gmail implements IEmailService {

    @Override
    public void sendMail(Author author) {
        System.out.println("Notification: ");
        System.out
                .println("Hey " + author.getAuthorName() + " " + author.getAuthorEmail()
                        + " your video has been uploaded!");
    }

}

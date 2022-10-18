
public class SqlDB implements IDataBase {

    @Override
    public void store(Video video) {
        System.out.println("Storing the data of video in the Database.......");
        System.out.println("Following data has been stored: ");
        System.out.println("Title: " + video.getTitle());
        System.out.println("Description: " + video.getDesc());
        System.out.println("Author name: " + video.getAuthor().getAuthorName());
        System.out.println("Author email:  " + video.getAuthor().getAuthorEmail());

    }

}

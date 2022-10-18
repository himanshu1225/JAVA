public class Author {
    private String authorName;
    private String authorEmail;

    public Author(String name, String email) {
        this.authorName = name;
        this.authorEmail = email;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

}

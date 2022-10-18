public class TextBox extends UIControl {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    public String getText() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("rendering Text Box");
    }

}

import org.w3c.dom.Text;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("Constructor: textBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    @Override
    public String toString() {
        return "TextBox [text=" + text + "]";
    }

}

import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        UIControl control = new UIControl(true);
        TextBox box = new TextBox();
        show(control);
    }

    public static void show(UIControl control) {
        // UIControl control = new TextBox();
        // at compile time we have only access to control members
        // UIControl control = box -> box is casted automatically to control
        // (upcasting).
        // As every textbox is control.
        // But every control object is not textBox, it can be dropbox, checkbox etc.
        // If i pass control and try to typecast that control to text class cast
        // Exception.

        // we gave control object which is generic and we were type to type cast it to
        // more specialised type, java cannot do this.

        if (control instanceof TextBox) {
            TextBox text = (TextBox) control;
            text.setText("I am a text");
        }
        // Here control is explicity downcasted to TextBox
        // Bcz we want to access the property of text to set the text.
        System.out.println(control);
    }
}

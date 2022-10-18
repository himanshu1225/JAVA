public class Main {
    public static void main(String[] args) {
        UIControl[] control = { new TextBox(), new CheckBox() };
        // I want to render all the components of UIControl
        // Procedural
        // for (UIControl ctrl : control) {
        // if (ctrl instanceof TextBox) {
        // System.out.println("TextBox redered");
        // } else if (ctrl instanceof CheckBox) {
        // System.out.println("Checkbox redered");
        // }
        // }

        // If anything new comes then again we have to make if else
        // or if made methods in UIControl for each compoenent then make new for other.
        // so rather use polymorphism.

        // At compile time we have declared array of UIControl.
        // But at run time we are inserting different objects inside the array.
        for (UIControl ctrl : control) {
            // Here ctrl will call render depend of the object
            // first ctrl will call render of textBox, then Checkbox
            ctrl.render();
        }

    }
}

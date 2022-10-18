public class UIControl {
    private boolean isEnabled;

    // public UIControl() {
    // System.out.println("Constructor: Ui control");
    // }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("Constructor: Ui control");
    }

    public void enable() {
        this.isEnabled = true;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}
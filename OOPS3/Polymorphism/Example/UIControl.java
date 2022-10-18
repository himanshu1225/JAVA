public class UIControl {
    private boolean isEnabled;

    public void disable() {
        this.isEnabled = false;
    }

    public void enable() {
        this.isEnabled = true;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void render() {

    }
}
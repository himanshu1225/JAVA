public class NiceCar {
    private Engine engine;
    private Media player;
    private Brake brake;

    public NiceCar(Engine engine) {
        this.engine = engine;
        this.player = new CDPlayer();
        this.brake = new PowerBrake();
    }

    public void start() {
        engine.start();
    }

    public void brake() {
        brake.brake();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.acc();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }

}

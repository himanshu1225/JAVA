public class CarManufacture {
    public static void main(String[] args) {
        NiceCar car = new NiceCar(new PowerEngine());
        car.start();
        car.accelerate();
        car.startMusic();
        car.brake();
        car.stop();
        car.stopMusic();

        car.upgradeEngine(new ElectricEngine());
        car.start();
        car.accelerate();
        car.startMusic();
        car.brake();
        car.stop();
        car.stopMusic();
    }
}

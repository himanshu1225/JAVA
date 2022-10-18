public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.acc();
        car.brake();
        car.stop();

        // You want to stop the music of car and stoping the car itself.
        // Secondly carMedia access krne ke liye new car leni padi :D
        // No sense. Little problem here
        // So we create class for each interface.
        Media carMedia = new Car();
        carMedia.stop();
    }
}

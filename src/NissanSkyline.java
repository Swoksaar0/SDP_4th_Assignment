public class NissanSkyline extends Car {
    public NissanSkyline(String model, Engine engine) {
        super(model, engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving on Skyline " + model);
        engine.stop();
    }
}
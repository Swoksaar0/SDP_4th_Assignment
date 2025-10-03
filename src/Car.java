public abstract class Car {
    protected Engine engine;
    protected String model;

    protected Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public abstract void drive();
}
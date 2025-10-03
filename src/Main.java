public class Main {
    public static void main(String[] args) {
        Car skylineR34 = new NissanSkyline("R34", new TwinTurboEngine());
        Car skylineR35 = new NissanSkyline("R35", new ElectricEngine());

        skylineR34.drive();
        skylineR35.drive();
    }
}
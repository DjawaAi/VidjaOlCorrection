public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку большегруза " + getModelName());
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель " + getModelName());
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп ");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}

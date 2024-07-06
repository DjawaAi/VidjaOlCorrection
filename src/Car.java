public class Car extends MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки авто " + getModelName());
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель " + getModelName());
    }


    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}

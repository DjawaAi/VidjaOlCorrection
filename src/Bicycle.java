public class Bicycle extends WheeledTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки на велосипеде " + getModelName());
    }

    @Override
    public void service() {
        updateTyre();
    }
}

package Transport;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Началось обслуживание машины " + getModelName());
        super.check();
    }
}
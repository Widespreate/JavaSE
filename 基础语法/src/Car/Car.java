package Car;

public abstract class Car {
    public abstract void carFactory();
    private String factoryName ;

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }
}

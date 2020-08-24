package Pet;

public abstract class Pet {
    public abstract void eat();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

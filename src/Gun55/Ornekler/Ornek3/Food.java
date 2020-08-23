package Gun55.Ornekler.Ornek3;

public abstract class Food {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public abstract void madeIn();
    public abstract void taste();

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}

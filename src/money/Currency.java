package money;

public abstract class Currency {
    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

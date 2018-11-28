package valueobject;

import java.util.Objects;

public final class ComplexNumber {
    private final double x;
    private final double y;

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("%.2f+i%.2f",x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

package valueobject;

public class ComplexNumberTestDrive {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(1,2);
        ComplexNumber y = new ComplexNumber(2,2);
        ComplexNumber z = new ComplexNumber(1,2);
        System.out.println(x.toString()+" == "+y.toString()+" ? "+x.equals(y));
        System.out.println(x.toString()+" == "+z.toString()+" ? "+x.equals(z));
    }
}

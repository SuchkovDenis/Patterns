package money;

public class MoneyTestDrive {
    public static void main(String[] args) {
        Money money1 = new Money(new RUR(), 600);
        Money money2 = new Money(new EUR(), 100000);
        System.out.println(money1);
        System.out.println(money2);
    }
}

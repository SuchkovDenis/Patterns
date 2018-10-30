package builder;

public class BuilderTestDrive {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder()
                .name("Jhoe")
                .email("jhoe.test@mail.com")
                .age(24);
        System.out.println(personBuilder);
    }
}

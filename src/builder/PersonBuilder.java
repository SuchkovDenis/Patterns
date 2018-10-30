package builder;

public class PersonBuilder {
    private String name;
    private String email;
    private int age;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

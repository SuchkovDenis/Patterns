package datamapper;

import java.util.ArrayList;

public class DataMapperTestDrive {
    public static void main(String[] args) {
        Person person;
        ArrayList<Person> persons;
        PersonMapper mapper = new PersonMapper(PersonDAO.getInstance());

        // show initial persons in DB
        System.out.println("show all");
        persons = mapper.getAll();
        for (Person p : persons)
            System.out.println("\t"+p);
        System.out.println();

        // get by id
        System.out.println("get by id=1");
        person = mapper.getById(1);
        System.out.println(person);
        System.out.println();

        // insert person
        System.out.println("insert Иванов Иван with id=222 and get it");
        mapper.insert(new Person(222,"Иванов","Иван"));
        person = mapper.getById(222);
        System.out.println(person);
        System.out.println();

        // show new persons in DB
        System.out.println("show all");
        persons = mapper.getAll();
        for (Person p : persons)
            System.out.println("\t"+p);
        System.out.println();

        // delete person with id 1
        System.out.println("delete person with id=1");
        mapper.deleteById(1);
        System.out.println();

        System.out.println("show all");
        persons = mapper.getAll();
        for (Person p : persons)
            System.out.println("\t"+p);
        System.out.println();
    }
}

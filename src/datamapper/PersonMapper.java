package datamapper;

import java.util.ArrayList;
import java.util.List;

public class PersonMapper {
    private PersonDAO dao;

    public PersonMapper(PersonDAO dao) {
        this.dao = dao;
    }

    public Person getById(int i) {
        Person person;
        for (ArrayList<String> obj : dao.getPersons()) {
            if (Integer.parseInt(obj.get(0))==i) {
                person = new Person(Integer.parseInt(obj.get(0)), obj.get(1), obj.get(2));
                return person;
            }
        }
        return null;
    }

    public void insert(Person person) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(Integer.toString(person.getId()));
        arr.add(person.getLastname());
        arr.add(person.getFirstname());
        dao.getPersons().add(arr);
    }

    public void deleteById(int i) {
        Person person;
        for (ArrayList<String> obj : dao.getPersons()) {
            if (Integer.parseInt(obj.get(0))==i) {
                dao.getPersons().remove(obj);
            }
        }
    }

    public ArrayList<Person> getAll() {
        ArrayList<Person> persons = new ArrayList<>();
        Person person;
        for (ArrayList<String> obj : dao.getPersons()) {
            person = new Person(Integer.parseInt(obj.get(0)), obj.get(1), obj.get(2));
            persons.add(person);
        }
        return persons;
    }
}

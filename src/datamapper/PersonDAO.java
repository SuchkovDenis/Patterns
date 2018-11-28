package datamapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PersonDAO {
    private static PersonDAO ourInstance;
    private ArrayList<ArrayList<String>> persons;

    public static synchronized PersonDAO getInstance() {
        if (ourInstance == null)
            ourInstance =new PersonDAO();
        return ourInstance;
    }

    private PersonDAO() {
        // При создании базы данных положим туда одно значение
        persons = new ArrayList<>();
        ArrayList<String> person = new ArrayList<>();
        person.add("1");
        person.add("Петров");
        person.add("Николай");
        persons.add(person);
    }

    public ArrayList<ArrayList<String>> getPersons() {
        return persons;
    }
}

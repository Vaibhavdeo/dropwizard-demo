package com.sample.drop.repositories;

import com.sample.drop.entities.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonDB {

    private static Map<Integer, Person> persons = new HashMap<Integer, Person>();

    static {
        persons.put(1, new Person(1, "FN1", "LN1", "email1@email.com"));
        persons.put(2, new Person(2, "FN2", "LN2", "email2@email.com"));
        persons.put(3, new Person(3, "FN3", "LN3", "email3@email.com"));
        persons.put(4, new Person(4, "FN4", "LN4", "email4@email.com"));
    }

    public static Person getById(int id) {
        return persons.get(id);
    }

    public static List<Person> getAll() {
        List<Person> personList2 = persons.values().stream().collect(Collectors.toList());
        return personList2;
    }

    public static int getCount() {
        return persons.size();
    }

    public static void remove() {
        if (!persons.keySet().isEmpty()) {
            persons.remove(persons.keySet().toArray()[0]);
        }
    }

    public static String save(Person person) {
        String result = "";
        if (persons.get(person.getId()) != null) {
            result = "Updated Person with id=" + person.getId();
        } else {
            result = "Added Person with id=" + person.getId();
        }
        persons.put(person.getId(), person);
        return result;
    }
}

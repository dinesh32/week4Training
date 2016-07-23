/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public class LinkedListDemo {
    public List<Person> fetchPerson(int size) {
        List<Person> persons = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Person person = new Person();
            person.setName("Name" + i);
            person.setAddress("Address" + i);
            person.setPhoneNumber("PhNo" + i);
            person.setAge(2 * i);

            persons.add(person);
        }
        return  persons;
    }
    
}

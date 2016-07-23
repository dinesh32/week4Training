/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.List;

import java.util.Vector;

/**
 *
 * @author Dinesh
 */
public class VectorDemo {

    public Vector<Person> addItemInVector(int itemSize) {
        Vector<Person> persons = new Vector<>();
        int i = 1;
        while (itemSize-- > 0) {
            Person person = new Person();
            person.setName(i + "Person Name");
            person.setAge(i * 2);
            person.setAddress(i + "Address");
            person.setPhoneNumber(i + "Phone Number");
        
        
        persons.addElement(person);
        i++;
    }
return persons;
}

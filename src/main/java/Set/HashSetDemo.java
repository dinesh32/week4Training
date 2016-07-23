/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;


import Collection.List.Person;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dinesh
 */
public class HashSetDemo {
    public Set <Person> fetchPerson(int size){
       Set <Person> persons=new  HashSet<>();
       
       Person samePerson=new Person();
       samePerson.setAddress("A");
       samePerson.setName("A");
       samePerson.setPhoneNumber("A");
       samePerson.setAge(1);
       
       
       for(int i=0;i<size;i++){
           if(i/3==0){
               persons.add(samePerson);
           }
           else
           {
               persons.add(new Person("Name" + i, i, "Address"+i,"Phonenumber"+i));
           }
       }
       
        
    return persons;
    }
    
}

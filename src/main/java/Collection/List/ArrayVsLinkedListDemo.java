/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.List;

import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public class ArrayVsLinkedListDemo {

    private String listType;

    public void readList(List<Person> list) {
        System.out.println("ListType=" + listType);
        long startTime = System.nanoTime();
        for (Person person : list) {
            //System.out.println("" + person);
        }
        long endTime = System.nanoTime();
        System.out.println("Total time required to read List type=" + listType + "is"
                + formatTime(((double) endTime - (double) startTime) / 1000000.0) + "secs");
    }
    private String formatTime(double time){
        DecimalFormat formatter =new DecimalFormat("0.#######");
        return formatter.format( time);
    }

    public void addElementAtBetweenList(List<Person> persons, int index) {
        System.out.println("ListType=" + listType);
        long startTime = System.nanoTime();
        Person person = new Person();
        persons.add(index,person);
        long endTime = System.nanoTime();
         System.out.println("Total time required to read List type=" + listType + "is"
                + formatTime(((double) endTime - (double) startTime) / 1000000.0) + "secs");
    }
     public void removeElementAtBetweenList(List<Person> persons, int index) {
        System.out.println("ListType=" + listType);
        long startTime = System.nanoTime();
        Person person = new Person();
        persons.remove(index);
        long endTime = System.nanoTime();
         System.out.println("Total time required to remove List type=" + listType + "is"
                + formatTime(((double) endTime - (double) startTime) / 1000000.0) + "secs");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.List;

import java.util.Iterator;
import java.util.Vector;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Dinesh
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VectorDemoTest {

    private final VectorDemo demo = new VectorDemo();
    private Vector<Person> persons;

    public VectorDemoTest() {
    }

    @Test
    public void testAddItemInVector() {

        persons = demo.addItemInVector(10);
        assertNotNull(persons);
        assertEquals(10, persons.size());
        testPrintVector();
    }

    public void testPrintVector() {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("" + person + "");

        }
        System.out.println(""+persons.get(2));
    }
}

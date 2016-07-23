/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.List;

import java.util.List;
import org.junit.Test;

/**
 *
 * @author Dinesh
 */
public class ArrayVsLinkedListDemoTest {

    private ArrayVsLinkedListDemo demoArrayList = new ArrayVsLinkedListDemo();
    private ArrayVsLinkedListDemo demoLinkedList = new ArrayVsLinkedListDemo();
    private List<Person> arrayList = new ArrayListDemo().fetchPerson(1000);
    private List<Person> linkedList = new LinkedListDemo().fetchPerson(1000);

    public ArrayVsLinkedListDemoTest() {
    }

    @Test
    public void testReadList() {
        System.out.println("ArrayVsLinkedListDemoTest.testReadList()#START");
        demoArrayList.readList(arrayList);
        demoLinkedList.readList(linkedList);
        System.out.println("ArrayVsLinkedListDemoTest.testReadList()#END");
    }

    @Test
    public void testAddElementAtBetweenList() {
       // System.out.println("ArrayVsLinkedListDemoTest.testAddElementAtBetweenList()#START");
        demoArrayList.addElementAtBetweenList(arrayList,500);
        demoLinkedList.addElementAtBetweenList(linkedList,500);
        //System.out.println("ArrayVsLinkedListDemoTest.testAddElementAtBetweenList()#END");
    }

    @Test
    public void testRemoveElementAtBetweenList() {
       // System.out.println("ArrayVsLinkedListDemoTest.testRemoveElementAtBetweenList()#START");
        demoArrayList.removeElementAtBetweenList(arrayList,500);
        demoLinkedList.removeElementAtBetweenList(linkedList,500);
       // System.out.println("ArrayVsLinkedListDemoTest.testRemoveElementAtBetweenList()#END");
    }

}

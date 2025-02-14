package List_Interface;
//Problem 5: Find the Nth Element from the End
//Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class NthElementFromEnd {

    public static <T> String findElement(LinkedList<T> list, int index){

        return "a";
    }
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("List: "+ list);

        int index=2;

        String nthElement = findElement(list, index);
        System.out.println("Nth Element is: "+ nthElement);

    }
}

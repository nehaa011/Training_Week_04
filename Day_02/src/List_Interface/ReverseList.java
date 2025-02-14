package List_Interface;
//Problem 1: Reverse a List
//Write a program to reverse the elements of a given List without using built-in reverse methods.
//Implement it for both ArrayList and LinkedList.

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static List ArrayReverseList(List list) {
        List<Integer> rev1 = new ArrayList<>();
        for(int i= list.size(); i>0 ; i--){
            rev1.add(i);
        }
        return rev1;
    }

    public static List LinkedReverseList(List list){
        List<Integer> rev2 = new LinkedList<>();
        for(int i= list.size(); i>0 ; i--){
            rev2.add(i);
        }
        return rev2;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);
        List reversedArrayList = ArrayReverseList (list);
        System.out.println("Reversed ArrayList: " + reversedArrayList);

        List reversedLinkedList = LinkedReverseList(list);
        System.out.println("Reversed LinkedList:" + reversedLinkedList );
    }
}



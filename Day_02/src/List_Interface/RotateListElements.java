package List_Interface;
//Problem 3: Rotate Elements in a List
//Rotate the elements of a list by a given number of positions.
import java.util.Collections;
import java.util.*;

public class RotateListElements {

    public static List<Integer> rotateList(List<Integer> list, int position){
        int n= list.size();
        if(n==0 || position ==0){
            return list;
        }

        position = position%n ;
        Collections.rotate(list, -position);
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: "+ list);
        int rotateBy=2;
        List<Integer> rotatedList= rotateList(list, rotateBy);
        System.out.println("Rotated List: "+ rotatedList);
        
    }

}

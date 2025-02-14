package List_Interface;
//Problem 4: Remove Duplicates While Preserving Order
//Remove duplicate elements from a list while maintaining the original order of elements.
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static List<Integer> Duplicates(List<Integer> list){
        List<Integer> list2 = new ArrayList<>();

        for(int elements : list){
            if(! list2.contains(elements)){
                list2.add(elements);
            }
        }
        return list2;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original List: " + list);

        List<Integer>  removedDuplicate = Duplicates(list);
        System.out.println("List After Removing Duplicates: " + removedDuplicate);

    }
}

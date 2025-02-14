package Set_Interface;
//Program 1: Check if Two Sets Are Equal
//Compare two sets and determine if they contain the same elements, regardless of order.

import java.util.HashSet;
import java.util.Set;

public class CheckTwoSets{
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Set 1: "+ set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println("Set 2: "+ set2);

        Boolean equal = set1.equals(set2);
        if(equal){
            System.out.println("Set 1 and Set 2 are Equal.");
        }
        else{
            System.out.println("Set 1 and Set 2 are not Equal.");
        }
    }
}
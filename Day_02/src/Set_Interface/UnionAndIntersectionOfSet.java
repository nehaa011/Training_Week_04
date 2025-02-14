package Set_Interface;
//Program 2: Union and Intersection of Two Sets
//Given two sets, compute their union and intersection.

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfSet {
    public static void main(String[] args){
        Set<Integer> set1= new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set 1: "+ set1);

        Set<Integer> set2= new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set 2: "+ set2);

        set1.addAll(set2);
        System.out.println("Union of Two Sets are: " + set1);

        set1.retainAll(set2);
        System.out.println("Intersection of Two Sets are: "+ set1);


    }
}

package List_Interface;
//Problem 2: Find Frequency of Elements
//Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FrequencyOfElements {

    public static Map<String, Integer> count(List<String> list){
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String item: list){
            frequencyMap.put(item, frequencyMap.getOrDefault(item , 0) + 1);
        }
        return  frequencyMap;
    }

    public static void main(String[] args){
        List<String> list= new ArrayList<String >();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        System.out.println("Original List: "+ list);

        Map<String, Integer> frequencyCount= count(list);
        System.out.println("Frequency of Each Element: "+ frequencyCount );
    }
}

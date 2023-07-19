package org.example;

import java.util.*;

public class TestingClass {
    public static void main(String[] args) {

        Map<String, Integer> months = new LinkedHashMap<>();

        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);


        Set<String> monthNamesSet = months.keySet();
        System.out.println("Month Names Set: " + monthNamesSet);


        List<Integer> cardinalMonth = new ArrayList<>(months.values());
        System.out.println("Cardinal Month List: " + cardinalMonth);

        Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
        System.out.println("Cardinal Month Array: " + Arrays.toString(cardinalMonthArray));
    }
}

package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
    public ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> array = new ArrayList<String>(Arrays.asList(inputArray));
        array.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return array;
    }

    public static void main(String[] args) {
        SortArray sort = new SortArray();
        ArrayList<String> array = sort.sortArray(new String[]{"Magic Vest", "Old Staff", "Spurious Rock"});
        for (String item: array) {
            System.out.println(item);
        }
    }
}

package MinimumChangeRequiredToMakeTwoArraysEqual;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinimumDifference' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */

    public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
    // Write your code here
    
        
    String[] a1 = a.toArray(new String[0]);
    String[] b1 = b.toArray(new String[0]);
    List<Integer> list = new LinkedList<Integer>();
    for(int i =0;i<a1.length;i++) {
        int count = countManipulations(a1[i],b1[i]);
        list.add(count);
    }
    return list;
    }

    public static int countManipulations(String s1, String s2) {
        int count = -1;

        // store the count of character
        int char_count[] = new int[26];

        // iterate though the first String and update
        // count
        for (int i = 0; i < s1.length(); i++)
            char_count[s1.charAt(i) - 'a']++;

        // iterate through the second string
        // update char_count.
        // if character is not found in char_count
        // then increase count
        for (int i = 0; i < s2.length(); i++)
            if (char_count[s2.charAt(i) - 'a']-- <= 0)
                count++;

        return count;
    }

}


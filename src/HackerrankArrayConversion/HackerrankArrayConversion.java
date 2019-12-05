package HackerrankArrayConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author Varadharajan on 05/12/19 18:18
 * @Projectname Messagebird
 */
public class HackerrankArrayConversion {

    public static void main(String[] args) {

        List<List<Integer>> aList = new ArrayList<>();
        List<List<String>> sList = new ArrayList<>();
        
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(0);
        a1.add(1);
        a1.add(1);
        aList.add(a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(0);
        a2.add(1);
        a2.add(1);
        a2.add(0);
        aList.add(a2);

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(0);
        a3.add(0);
        a3.add(0);
        a3.add(1);
        aList.add(a3);

        ArrayList<Integer> a4 = new ArrayList<>();
        a4.add(1);
        a4.add(0);
        a4.add(0);
        a4.add(0);
        aList.add(a4);

       List<String> s1 = Arrays.asList("NYC", "New Delhi");
       List<String> s2 = Arrays.asList("AUstraila", "Norway");

       sList.add(s1);
       sList.add(s2);

       listOfStringToArray(s1);
       listOfListTo2DArray(aList);
       listToArray(a1);
       listOfListOfStringTo2DArray(sList);
    }

    private static void listToArray(List<Integer> list) {
        int[] arr = list.stream().mapToInt(x -> x).toArray();
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void listOfListTo2DArray(List<List<Integer>> list) {
        int[][] intArray = list.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
        Stream.of(intArray).map(Arrays::toString).forEach(System.out::println);
    }

    public static void listOfStringToArray(List<String> list)
    {
        String[] array = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }

    public static void listOfListOfStringTo2DArray(List<List<String>> list) {
        String[][] intArray = list.stream().map(i -> new String[]{String.valueOf(i)}).toArray(String[][]::new);

        Stream.of(intArray).map(Arrays::toString).forEach(System.out::println);
    }


}

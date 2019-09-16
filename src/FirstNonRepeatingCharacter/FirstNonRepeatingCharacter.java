package FirstNonRepeatingCharacter;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Varadharajan on 2019-09-06
 * @project name: GoldmansachsCoderPadQuestions
 */
public class FirstNonRepeatingCharacter {

    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];

    /* calculate count of characters
       in the passed string */
    static void getCharCountArray(String str) {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }

    /* The method returns index of first non-repeating
       character in a string. If all characters are repeating
       then returns -1 */
    static int firstNonRepeating(String str) {
        getCharCountArray(str);
        int index = -1, i;

        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    // Driver method
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int index = firstNonRepeating(str);

        System.out.println(index == -1 ? "Either all characters are repeating or string " +
                "is empty" : "First non-repeating character is " + str.charAt(index));


        Map<Integer, Integer> map = new HashMap<>();

        Map<Integer, Integer> sortedMap = new HashMap<>();

        map.put(1, 5);
        map.put(2, 4);
        map.put(3, 3);
        map.put(4, 2);
        map.put(5, 1);

        List<Integer> list = new ArrayList<>();

        final Map<Integer, Integer> collect = map.entrySet().stream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .sorted(Comparator.comparing(Map.Entry::getValue))

                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        // .forEachOrdered((x)->sortedMap.put(x.getKey(),x.getValue()));
        // .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        collect.entrySet().stream()
                .map((s) -> Integer.valueOf(s.getKey()))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList())

                .forEach((s) -> System.out.println(s));

        String s = "";
        for (int i = 0; i < 10_000; i++) {
            s += Integer.toString(i);
        }
    }

}

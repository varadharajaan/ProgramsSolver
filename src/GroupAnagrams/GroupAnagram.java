package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Varadharajan on 2019-09-11
 * @project name: GoldmansachsCoderPadQuestions
 */
public class GroupAnagram {

    private static void printAnagrams(String arr[]) {
        HashMap<String, List<String>> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {


            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);


            if (map.containsKey(newWord)) {

                map.get(newWord).add(word);
            } else {


                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        map.entrySet().stream()
                .forEach(s -> System.out.println(s.getValue()));
    }

    public static void main(String[] args) {


        String arr[] = {"cat", "dog", "tac", "god", "act", "check", "kcech"};
        printAnagrams(arr);
    }
}

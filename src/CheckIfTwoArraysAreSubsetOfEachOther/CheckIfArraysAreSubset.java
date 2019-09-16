package CheckIfTwoArraysAreSubsetOfEachOther;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckIfArraysAreSubset {

    public static List<String[]> readNumsFromCommandLine() {

        List<String[]> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        String[] input = new String[length];
        for (int i = 0; i < length; i++) {

            input[i] = sc.next();
        }

        int length2 = sc.nextInt();

        String[] input2 = new String[length2];

        for (int i = 0; i < length2; i++) {

            input2[i] = sc.next();
        }

        list.add(input);
        list.add(input2);

        return list;
    }

    public static void main(String[] args) {

        List<String[]> arrays = readNumsFromCommandLine();

        int val = calculateList2IsSubset(Arrays.asList(arrays.get(0)), Arrays.asList(arrays.get(1)));

        System.out.println(val);

    }

    private static int calculateList2IsSubset(List<String> asList1, List<String> asList2) {

        int count = 0;
        int startIndex = 0;

        for (int i = 0; i < asList1.size(); i++) {

            for (int j = 0; j < asList2.size(); j++) {

                String val1 = asList1.get(i);
                String val2 = asList2.get(j);

                if (val1.equals(val2)) {
                    count++;
                    startIndex = i;
                    if (count == asList2.size())
                        break;
                } else {
                    count = 0;
                    break;
                }

            }

        }

        //if ( startI

        return startIndex;

    }

}

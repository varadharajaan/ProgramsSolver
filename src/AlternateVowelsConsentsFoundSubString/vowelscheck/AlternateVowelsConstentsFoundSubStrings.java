package AlternateVowelsConsentsFoundSubString.vowelscheck;

import java.util.*;

class AlternateVowelsConstentsFoundSubStrings {

    public static void SubString(String str, int n) {
        List<String> list = new ArrayList<>();

        Set<String> finalValue = new HashSet<>();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++) {

                list.add(str.substring(i, j));
            }

        findWhtherValidAlternateString(list, finalValue);

        System.out.println(finalValue.size());


        list.clear();
        finalValue.clear();
    }

    private static void findWhtherValidAlternateString(List<String> list2, Set<String> finalValue) {
        int voCount = 0;
        int coCount = 0;
        int[] array = new int[2];

        boolean isValid = false;

        for (String str : list2) {
            char[] charArray = str.toCharArray();

            char ch = charArray[0];

            if (isVowel(ch)) {
                array[0] = voCount;
                array[1] = coCount;
                voCount++;
                coCount = 0;

            }

            if (isConstonent(ch)) {
                array[0] = voCount;
                array[1] = coCount;
                coCount++;
                voCount = 0;

            }

            loop:
            for (int i = 1; i < charArray.length; i++) {

                boolean v = isVowel(charArray[i]);

                boolean c = isConstonent(charArray[i]);

                if (v) {
                    if (coCount != 0 && voCount == 0) {
                        array[0] = voCount;
                        array[1] = coCount;
                        coCount = 0;
                        voCount++;

                    } else {
                        array[0] = 1;
                        array[1] = 0;
                        break loop;

                    }
                } else if (c) {
                    if (voCount != 0 && coCount == 0) {
                        array[0] = voCount;
                        array[1] = coCount;
                        voCount = 0;
                        coCount++;

                    } else {
                        array[0] = 0;
                        array[1] = 1;
                        break loop;

                    }

                }


                if (i + 1 == charArray.length) {
                    StringBuilder sb1 = new StringBuilder();
                    sb1.append(array[0]);
                    sb1.append(array[1]);
                    String str1 = sb1.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append(voCount);
                    sb.append(coCount);

                    String str2 = sb.reverse().toString();

                    if (str1.equals(str2)) {
                        isValid = true;
                    }
                }


            }

            if (isValid) {
                finalValue.add(str);
            }
            voCount = 0;
            coCount = 0;
            array[0] = 0;
            array[1] = 0;
            isValid = false;

        }


    }


    private static boolean isConstonent(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')
            return false;
        return true;

    }

    private static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')
            return true;
        return false;
    }

    public static void main(String[] args) {

        List<String> inputList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            sc.nextInt();
            inputList.add(sc.next());

        }

        for (String str : inputList) {

            SubString(str, str.length());
        }

    }
}

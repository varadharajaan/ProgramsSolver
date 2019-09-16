package SimpleJavaOOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class Zeroindexing {


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("value-->" + parseAndFind(Integer.parseInt(line)));
        }
    }

    public static String parseAndFind(int N) {
        String string = "0";
        StringBuilder sb = new StringBuilder(string);
        int num = 0;
        if (N < 5) {
            num = N;
        } else {
            num = N / 5;
        }
        outer:
        for (int j = 0; j < num; j++) {
            List<Character> listch = new LinkedList<Character>();
            List<Character> listchTemp = new LinkedList<Character>();
            for (int k = 0; k < sb.length(); k++) {
                listch.add(sb.charAt(k));
            }
            for (int l = 0; l < listch.size(); l++) {
                for (Character ch : listch) {
                    if (ch == '0') {
                        ch = '1';
                        listchTemp.add(ch);
                    } else if (ch == '1') {
                        ch = '2';
                        listchTemp.add(ch);
                    } else if (ch == '2') {
                        ch = '0';
                        listchTemp.add(ch);
                    }
                }
                List<Character> listchFinal = new LinkedList<Character>(listch);
                listchFinal.addAll(listchTemp);
                // Appends characters one by one
                sb.setLength(0);
                for (Character ch : listchFinal) {

                    sb.append(ch);
                }
                if (sb.length() > N) {
                    System.out.println("loop->" + j);
                    break outer;
                }

            }
        }

        return String.valueOf(sb.charAt(N));
    }
}

package GetListOfFileNames;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Varadharajan on 2019-09-11
 * @project name: GoldmansachsCoderPadQuestions
 */
public class ListOfFilenames {

    public static void main(String[] args) {
        List<String> results = new ArrayList<String>();


        File[] files = new File("/Users/vardamod/Downloads/CoderPad/Questions").listFiles();


        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }

        results.forEach(System.out::println);
    }


}

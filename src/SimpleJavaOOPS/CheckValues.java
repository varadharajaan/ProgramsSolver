package SimpleJavaOOPS;

import java.time.Instant;

public class CheckValues {

    public static void main(String[] args) {
        Instant now = Instant.now();
        long mms = now.toEpochMilli();
        System.out.println(mms);

    }

}

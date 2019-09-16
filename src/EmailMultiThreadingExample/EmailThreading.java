package EmailMultiThreadingExample;

import java.util.*;

public class EmailThreading extends Thread {

    public static void main(String[] args) {

        List<List<Integer>> val = getEmailThreads(Arrays.asList("sv@gmail.com, gf@gmail.com, hello x, how are you?",
                "wl@gmail.com, tk@gmail.com, did you take a look at the event?",
                "gf@gmail.com, sv@gmail.com, i am great. how are you?---hello x, how are you?",
                "sv@gmail.com, gf@gmail.com, hello x, how are you?",
                "tk@gmail.com, wl@gmail.com, did you take a look at the event?",
                "tk@gmail.com, wl@gmail.com, i am great. how are you?---hello x, how are you?",
                "tk@gmail.com, wl@gmail.com, hello x, how are you?",
                "sv@gmail.com, gf@gmail.com, did you take a look at the event?"));

        System.out.println(val.toString());

    }

    public static List<List<Integer>> getEmailThreads(List<String> emails) {
        // Write your code here

        List<Integer> thread = new ArrayList<Integer>();

        List<List<Integer>> listOfThreads = new ArrayList<>();

        String[] item = emails.toArray(new String[emails.size()]);

        String[] senders = new String[item.length];

        String[] receivers = new String[item.length];

        Map<Integer, Integer> map = new HashMap<>();

        int sender_count = 0;

        int receiver_count = 0;

        boolean flag = false;

        for (int i = 0; i < item.length; i++) {

            String[] arrays = item[i].split(",");
            String sender = arrays[0].trim();
            String rev = arrays[1].trim();


            //start


            if (sender_count == 0) {
                //thread.add(11);
                senders[sender_count] = sender;
                sender_count++;
                receivers[receiver_count] = rev;
                receiver_count++;
                flag = false;
                map.put(sender_count + 1, 1);

            } else {

                for (int s = 0; s < sender.length(); s++) {

                    if (senders[s] == null) {
                        break;
                    } else if (sender.equals(senders[s])) {
                        flag = true;
                        int temp = 0;
                        temp = s + 1;
                        map.put(temp, map.get(temp) + 1);
                        break;
                    } else if (sender.equals(receivers[s])) {
                        flag = true;
                        int temp = 0;
                        temp = s + 1;

                        map.put(temp, map.get(temp) + 1);

                    }
                }

                if (!flag) {
                    senders[sender_count] = sender;
                    sender_count++;
                    receivers[receiver_count] = rev;
                    receiver_count++;
                    flag = false;
                    map.put(map.size(), 1);

                }

            }


            //end


            flag = false;


        }

        Set<Integer> keys = map.keySet();

        for (int ch : keys) {
            if (map.get(ch) == 1) {
                String st = String.valueOf(ch) + String.valueOf(map.get(ch));
                thread.add(Integer.parseInt(st));
            } else {
                int val = map.get(ch);
                while (val >= 1) {

                    String st = String.valueOf(ch) + String.valueOf(val);
                    thread.add(Integer.parseInt(st));
                    val--;
                }

            }
        }

        listOfThreads.add(thread);

        return listOfThreads;
    }

    @Override
    public void run() {

    }

}

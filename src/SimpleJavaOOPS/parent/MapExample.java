package SimpleJavaOOPS.parent;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MapExample {

    public static void main(String[] args) {
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(3, 5);
        
        
        for(Entry<Integer,Integer> set: map.entrySet()) {
            
            System.out.println(set.getKey());
            System.out.println(set.getValue());
            System.out.println("-------------------------");
        }
        

    }

}

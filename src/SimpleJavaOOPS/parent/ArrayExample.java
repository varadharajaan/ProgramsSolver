package SimpleJavaOOPS.parent;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class ArrayExample {

    public static void main(String[] args) {
        
        /*
         * int[] arr = new int[100]; for ( int i=0; i<100;i++) { arr[i]=i; }
         * 
         * System.out.println(Arrays.toString(arr));
         */
       
        
        LinkedList<Object> list = new LinkedList<> ();
       TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
       
       list.add(1);
       list.add(4);
       list.add(3);
       list.add(2);
       list.add(4);
       System.out.println(list);
       
       int count=0;
       for (Integer integer : set) {
           
           if(integer==4) {
               count++;
           }
        
    }
       
list.forEach(s-> System.err.println(s));       
       
       
       System.out.println("occurence of 4-->"+count);
      
       list.add(5);
       System.out.println(list.size());
       
       set.add(1);
       set.add(4);
       set.add(3);
       set.add(2);
       set.add(4);
       System.out.println(set);
       
       set.add(5);
       
       System.out.println(set.size());
       
    }
    
    Map<Integer,Integer> map1 = new HashMap<>();
    
    
    

}

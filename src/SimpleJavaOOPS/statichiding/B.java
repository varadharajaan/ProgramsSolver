package SimpleJavaOOPS.statichiding;

import java.util.HashMap;

class B extends A {  
	   static void fun() {    
	      System.out.println("B.fun()"); 
	   } 
	   
	   public static void main(String[] args) {
		   
		   HashMap<Integer, Integer> map = new HashMap<>();
		   
		   map.put(1,2);
		   map.put(2, 3);
		   
		   map.remove(3);
		A a = new A();
		a.fun();
	}
} 
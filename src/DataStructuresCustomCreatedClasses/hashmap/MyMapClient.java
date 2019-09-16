package DataStructuresCustomCreatedClasses.hashmap;



public class MyMapClient {
	
	
	public static void main(String[] args) {
		// MyMap
        MyMap<String, Integer> map = new MyMap<String, Integer>();
        map.put("Lars", 1);
        map.put("Lars", 2);
        map.put("Lars", 1);
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), i);
        }
        for (String str : map.keySet()) {
        	System.out.println(str);
		}
	}
}

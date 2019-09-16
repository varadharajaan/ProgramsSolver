package SimpleJavaOOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StarcaiseClimb {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
          System.out.println(countWays(Integer.parseInt(line)));
        }
      }
    
    static int fib(int n) 
    { 
       if (n <= 1) 
          return n; 
       return fib(n-1) + fib(n-2); 
    } 
      
    // Returns number of ways to reach s'th stair 
    static int countWays(int s) 
    { 
        return fib(s + 1); 
    } 
    
    

}

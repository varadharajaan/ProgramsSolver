package SimpleJavaOOPS;

public class Multi extends Thread {
    
   private int i = 1;
        public void run(){  
        System.out.println("thread is running..."+this.getName());  
        if(this.getName().equalsIgnoreCase("Thread-0")) {
            i=i/0;
        }
        } 
        
        public static void main(String args[]){  
            Multi t1=new Multi();  
            Multi t2=new Multi();
            t1.start(); 
            System.out.println("completed");
             }  

}

package lab9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {  
	  
    public static void main(String[] args) {  
        ExecutorService executorService = Executors.newSingleThreadExecutor();  
        executorService.submit(new Runnable() {  
              
            @Override  
            public void run() {  
                System.out.println("ExecutorService");  
                  
            }  
        });  
    }  
}   
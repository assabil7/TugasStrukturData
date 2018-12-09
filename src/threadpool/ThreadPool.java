/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Assabil
 */
public class ThreadPool implements Runnable{
    private int dm;
    
    public ThreadPool(int id){
        this.dm=id;
    }
 @Override
    public void run() {
  
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      System.out.println("Mengitung bilangan ganjil = "+dm);
      
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
    }
}  
    

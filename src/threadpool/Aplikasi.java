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
public class Aplikasi {
     public static void main(String[] args){
        //method newFixedTreadPool digunakan untuk menentukan ukuran tetap thread yang bekerja
        ExecutorService service = Executors.newFixedThreadPool(4);
        
        for (int i=1; i<=100; i++){
            if(i%2==1)
            service.submit(new ThreadPool(i));
            
        }
        //mematikan semua service setelah semua task tersubmit
        service.shutdown();

        try{
            service.awaitTermination(1, TimeUnit.DAYS);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
         System.out.println("Mengitung bilangan ganjil dari 1-100 telah selesai");
         System.out.println("Assabil Nur Alfiansyah");
         System.out.println("5160311094");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.floodlert;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author johnm
 */
public class FloodLert {

    public static String username = null;
    public static boolean access = false;
    
    public static void LogInPrompt(){
        System.out.println("You are now logged in as: " + username); // for debug
    }
    
    public static void main(String[] args) {
        System.out.println("Thank you for using FloodLert!");
        System.out.println("Starting Program...");
        LogIn.main(null); // This will allow us to open the Jframe without opening it directly wity "SHIFT + F6."
        
        autoUpdateThread();
    }
    public static void autoUpdateThread() {

        //create a callable for each method
        Callable callable1 = () -> {
            WeatherAPI.autoUpdate();
            return null;
        };

        Callable callable2 = () -> {
            DateTime.autoUpdate();
            return null;
        };

        //add to a list
        ArrayList taskList = new ArrayList();
        taskList.add(callable1);
        taskList.add(callable2);

        //create a pool executor with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        try {
            //start the threads and wait for them to finish
            executor.invokeAll(taskList);
        } catch (InterruptedException ie) {
            //do something if you care about interruption;
            System.out.println("Interrupted Exception: " + ie);
        }

    }
}

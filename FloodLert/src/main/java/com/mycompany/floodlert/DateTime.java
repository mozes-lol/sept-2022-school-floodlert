/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.floodlert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    
    public static void autoUpdate() {
        System.out.println("DateTime AutoUpdate Initialized");
        
        while (true) {
            boolean access = FloodLert.access;
            
            try {
                Thread.sleep(100); // While loop time buffer, Default 0.1 second
            } catch (InterruptedException ie) {
                System.out.println("Interrupted Exception: " + ie);
            }

            while (access) {
                try {
                    Thread.sleep(100); // While loop time buffer, Default 0.1 second
                } catch (InterruptedException ie) {
                    System.out.println("Interrupted Exception: " + ie);
                }
                
                DateTime.setValues();

                // System.out.println("DateTime Updated");
            }
        }
    }
    
    public static String localTime() {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
        Date date = new Date();
        
        if (dateFormat.format(date).charAt(0) != '0') {
            return dateFormat.format(date);
        } else {
            return dateFormat.format(date).substring(1);
        }
    }
    
    public static String localDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        return dateFormat.format(date);
    }
    
    public static void setValues() {
        Dashboard.localdate.setText(localDate());
        Dashboard.localtime.setText(localTime());
    }
}

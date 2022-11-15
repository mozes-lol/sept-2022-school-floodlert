/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.floodlert;

/**
 *
 * @author johnm
 */
public class FloodLert {

    static String loggedInUsername;
    
    public static void LogInPrompt(){
        System.out.println("You are now logged in as: " + loggedInUsername);
    }
    
    public static void main(String[] args) {
        System.out.println("Thank you for using FloodLert!");
        System.out.println("Starting Program...");
        LogIn.main(null);
    }
}

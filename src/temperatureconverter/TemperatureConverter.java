/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 6
 * 
 * Write a program that converts degrees Fahrenheit to degrees Celsius.
 * 
 * @author skiroc
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double degreesCelsius, degreesFahrenheit; 
        
        // Creating Scanner object
        Scanner kb = new Scanner(System.in);
        
        // Prompting user to enter a temperature in degrees Fahrenheit
        System.out.println("Please enter a temperature in degrees Fahrenheit:");
        degreesFahrenheit = kb.nextDouble();
        
        // Converting degrees Fahrenheit to degrees Celsius
        degreesCelsius = (degreesFahrenheit - 32) * (0.5556);
        
        // Displaying converted temperature in degrees Celsius
        System.out.println(degreesFahrenheit + " degrees Fahrenheit equals "
        + degreesCelsius + " degrees Celsius.");
        
    } //end main 
    
} //end class

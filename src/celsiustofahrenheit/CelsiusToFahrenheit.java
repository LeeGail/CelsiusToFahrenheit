/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiustofahrenheit;

/**
 *
 * @author Gail Lee
 */
import java.util.Scanner;
public class CelsiusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    float Celsius;
    double Fahrenheit;
    Scanner scanner = new Scanner(System.in);
    
            
        System.out.print("Enter your Celsius Temperature:");
        Celsius = scanner.nextFloat();
        Fahrenheit = (9.0/5.0*Celsius)+32;
                
    System.out.print("Your Farenheight number:  "+Fahrenheit);
    
    }
}

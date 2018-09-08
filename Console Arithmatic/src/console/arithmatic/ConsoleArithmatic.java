/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.arithmatic;

/**
 *
 * @author Abdus Salam
 */
public class ConsoleArithmatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int a = 10;
       // int b = 15;
        double c = ((25+40) / 30 - 13/2) / 5;
        if(c>10)
        System.out.printf("Total is =  %.3f\n", c);
        else
            System.out.printf("TOTAL is =  %.3f\n", c);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debatereader;
        

/**
 *
 * @author kendall
 */

import java.util.Scanner;


public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fileName = new String();
        Scanner s = new Scanner(System.in);
        
        boolean valid = false;
        
        do {
            System.out.println("Debate Reader v0.1");
            System.out.println("Please input text file > ");
            fileName = s.next();
            
            
        } while(!valid);
        
        
        
        
    }
    
}

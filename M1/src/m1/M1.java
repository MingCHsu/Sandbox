/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1;

import java.util.Scanner;

/**
 *
 * @author Ming Hsu
 */
public class M1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                System.out.println("Hello World!");
        Scanner scan= new Scanner(System.in);

        //For string

        String text= scan.nextLine();

        System.out.println(text);

        //for int

        int num= scan.nextInt();

        System.out.println(num);
        
        String filename = scan.nextLine();
        
        System.out.println(filename);
    }
    
}

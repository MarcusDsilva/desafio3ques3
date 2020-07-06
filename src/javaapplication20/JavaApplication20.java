/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a, b;

       Scanner ler = new Scanner(System.in);

       System.out.println("Informe o A");
       a = ler.nextInt();
       System.out.println("Informe o b");
       b = ler.nextInt();

       if(a % b == 0){
       System.out.println("Os valores de A e B são multiplos");
       }else{
       System.out.println("Os valores de A e B não são multiplos");
       }
    }
}

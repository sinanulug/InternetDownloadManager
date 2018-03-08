/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

import java.util.Scanner;

/**
 *
 * @author sinanulug
 */
public class Cal2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        while (true) {
            System.out.println("1 -  +");
            System.out.println("2 - -");
            System.out.println("3 - *");
            System.out.println("4 - /");
            System.out.print("Secim : ");
            int secim=oku.nextInt();
            
            if (secim==1) {
                int s1=oku.nextInt();
                int s2=oku.nextInt();
                Calculator.topla(s1, s2);
                
            }
            
            if (secim==2) {
                int s1=oku.nextInt();
                int s2=oku.nextInt();
                Calculator.cikar(s1, s2);
                
            }
            
            if (secim==3) {
                int s1=oku.nextInt();
                int s2=oku.nextInt();
                Calculator.carp(s1, s2);
                
            }
            
            if (secim==4) {
                int s1=oku.nextInt();
                int s2=oku.nextInt();
                Calculator.bol(s1, s2);
                
            }
            
            if (secim==1) {
             break;
            }
            
        }
        
    }
    
}

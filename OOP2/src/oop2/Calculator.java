/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author sinanulug
 */
public class Calculator {
    public static void topla(int a,int b)
    {
        System.out.printf("%d + %d=%d/n ",a,b,(a+b));
    }
    public static void cikar(int a,int b)
    {
        System.out.printf("%d - %d=%d/n ",a,b,(a-b));
    }
    public static void carp(int a,int b)
    {
        System.out.printf("%d * %d=%d/n ",a,b,(a*b));
    }
    public static void bol(int a,int b)
    {
        if (b==0) {
            System.out.println("Hata");
            return;
        }
        System.out.printf("%d / %d=%d/n ",a,b,(a/b));
    }
    
    
}

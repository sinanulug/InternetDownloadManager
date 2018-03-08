/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author sinanulug
 */
public class Human {
    String name;
    Integer age;
    Integer heigt;
    String eyeColor;
    
    public Human () {
    }
    public void speak() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " +heigt);
        System.out.println("I am years old "+ age);
        System.out.println("my eye color is " + eyeColor);    
    }
    public void walking() {
        System.out.println("walking...");
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje1;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author sinanulug
 */
public class PROJE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object instance=new Constructor();
        Scanner oku=new Scanner(System.in);
       Kisi kisi=new Kisi();
       kisi.ad="Sinan";
       kisi.soyad="uluğ";
       kisi.yas=25;
        System.out.printf("%s %s %d",kisi.ad,kisi.soyad,kisi.yas);
        Kisi you=new Kisi("Efe", "Selim", 35);
        Kisi him=new Kisi("ahmet", "mehmet", 30);
        JFrame f=new JFrame();
        
       
        /*
        Kapsülleme : Bir nesnenin sahip olduğu özelliklerin
        private yapılarak diğer sınıflardan erişiminin kapatılıp 
        değişkenin değerini okumak/yazmak için get/set methodlarının kullanılması
        */
        
    }
    
}

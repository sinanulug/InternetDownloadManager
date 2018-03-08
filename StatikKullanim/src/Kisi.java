/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinanulug
 */
public class Kisi {
    public String ad,soyad;
    public static String ulke;

    public Kisi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        ulke="TR";
    }
    public static void main(String[] args) {
        Kisi k1=new Kisi("Sinan", "Uluğ");
        Kisi k2=new Kisi("Ahmet", "Mehmet");
        Kisi k3=new Kisi("Veli", "Deli");
        Kisi.ulke="JP";
        System.out.println(k1.ad+" "+ k1.soyad +" "+k1.ulke);
        System.out.println(k2.ad+" "+ k2.soyad +" "+k2.ulke);
        System.out.println(k3.ad+" "+ k3.soyad +" "+k3.ulke);
    }
   
}

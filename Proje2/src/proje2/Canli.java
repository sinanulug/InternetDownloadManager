/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

import java.util.Date;

/**
 *
 * @author sinanulug
 */
public class Canli 
{
    public  String ad;
    public  Integer yas,omur;
    public double boy,kilo;

    public Canli(String ad, Integer yas, Integer omur, double boy, double kilo) {
        this.ad = ad;
        this.yas = yas;
        this.omur = omur;
        this.boy = boy;
        this.kilo = kilo;
    }
    public Canli(long zaman){
        System.out.println("Canlı constructor ı çalıştı :"+new Date(zaman));
    }

    public Canli() 
    {
        System.out.println("Canlı constructor ı çalışacak");
    }
    public void uyu(){
        System.out.println("(-_-) oO {zZz}");
    }
}

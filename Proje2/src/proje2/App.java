/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

/**
 *
 * @author sinanulug
 */
public class App {
    
    public static void doOp(Canli c) 
    {
    String sinifAdi=c.getClass().getName();
        System.out.println("Gelen sınıf" +sinifAdi);
        //eğer gelen canlı insan ise
        if (c instanceof Insan) {
            System.out.println("Merhaba insan");
        }
        if (c instanceof Hayvan) {
            System.out.println("Merhaba Hayvan");
        }
        if (c instanceof  KaraHayvanlari) {
            System.out.println("merhaba kara hayvanları");
        }
    }
    public static void main(String[] args) {
        Insan i =new Insan();
        Hayvan h=new Hayvan();
        Bitki b=new Bitki();
        
        KaraHayvanlari kh=new KaraHayvanlari();
        doOp(i);
       // doOp(h);
        //doOp(b);
        doOp(kh);
    }
}

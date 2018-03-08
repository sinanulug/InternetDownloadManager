/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje1;

/**
 *
 * @author sinanulug
 */
public class Kisi 
{
    //Nesnenin özellikleri
    public String ad,soyad;
    public Integer yas;
   
    //constructor method
    public Kisi () 
    {
        System.out.println("null constructor çalıştı");
    }
    //Method overloading
    public Kisi(String Ad,String Soyad, Integer Yas) 
    {
       this.ad=Ad;
       this.soyad=Soyad;
       this.yas=Yas;
       //this in buradaki anlamı , bu instance a ait ad değeri ile
       //parametre olan ad değerine göre güncelleniyor.
    }
    //getter setter , değişkenin adına göre ne döndürmek istediğini seç
    public String getAd(){return this.ad;}
    public void setAd(){this.ad=ad;} // birşey döndürmek zorunda değil

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }
     
    
    
    
}

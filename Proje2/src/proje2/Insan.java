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
//İnsan sınıfı , canlı sınıfından türetilmiştir.
//Yani insan canlının sahip olduğu tüm özelliklere ve methodlara sahiptir.
/*
İnsan instance oluşturulmadan önce bir canlı instancı oluşturulur ve bu
gizli tutulur. bu gizli instance süper kelimesi ile oluşturulabilr.
Canlı burada super classken , insana ise subclass denir.
Özellikleri verene super class ,özellikleri alana subclass deniyor
*/
public class Insan extends Canli{

    public String soyad;
    public String email;
    public Insan() 
    {
        /*
        İnsan instance ı oluşturulurken gizli olarak
        oluşturulan canlı instance ının farklı bir constructorını çağırmak
        için buray İLK STATEMENT OLARAK super eklenebilir.
        */
        super(System.currentTimeMillis());
        System.out.println("Insan constructor ı çalışcak");
        
    }   
    public void uyu() {
        System.out.println("by");
    }
    public void ozUyu(){
    super.uyu();
    }

    public Insan(String soyad, String email) {
        this.soyad = soyad;
        this.email = email;
    }
    
    /*
    Üst sınıftan bu sınıfa geçen methodu
    burada tekrar tanımlarsak üst sınıftaki methodun üst sınıftaki haline bir daha
    erişemeyiz.Burada tanımlanan geçerli olur
    Buna da method overriding denir
    */
    public void kendiniTanit(){};
    public static void main(String[] args) {
        Insan i=new Insan();
        i.uyu();
        i.uyu();
       
    }
}

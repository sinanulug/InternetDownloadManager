
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinanulug
 */
public class ConsoleApp implements DLManager{
    Scanner oku=new Scanner(System.in);
    public ConsoleApp() {
        new Core(this);
    }
    public static void main(String[] args) {
        ConsoleApp ca=new ConsoleApp();
        
    
    }

    public String getDownloadURL() {
        System.out.println("İndirilecek dosyanın URLsi: ");
        String yol=oku.next();
        return yol;
    }

     public String getSavedFilePath() {
        System.out.println("Kaydedilecek Yer :");
        String yol=oku.next();
        return yol;
        
        //https://www.textnow.com/
        
    }

    public void showPercent(double percent, double total, double downloaded) {
        System.out.printf("%% %.2f [%f ∕ %f]\n",percent,downloaded,total);
       
    }

  
    public void showCompleted() {
            System.out.println("Dosya indirme tamamlandı.");
    }
    
    public void showError() {
        System.out.println("Dosya indirme işlemi tamamlanamadı.");
    }
    
}

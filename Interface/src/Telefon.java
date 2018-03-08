/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinanulug
 */
public class Telefon implements USB{
    public double ram;
    public double camPix;
    public int camCnt;

    public Telefon(double ram, double camPix, int camCnt) {
        this.ram = ram;
        this.camPix = camPix;
        this.camCnt = camCnt;
        
    }

    @Override
    public void tak() {
        System.out.println("usb algılandı bildirimi");
    }

    @Override
    public void cikar() {
        System.out.println("usb disk çıkartıldı bildirimi");
    }
    
}

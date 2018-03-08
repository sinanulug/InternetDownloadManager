/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinanulug
 */
public class Pc implements USB{
    public double ghz,ram;
    public int hdd;

    public Pc(double ghz, double ram, int hdd) {
        this.ghz = ghz;
        this.ram = ram;
        this.hdd = hdd;
        
    }

    @Override
    public void tak() {
        System.out.println("dı dıt");
    }

    @Override
    public void cikar() {
        
        System.out.println("dı dıt dıııı");
    }
    
}

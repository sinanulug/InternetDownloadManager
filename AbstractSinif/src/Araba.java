
 public abstract class Araba {

public String marka,model;

    public Araba() {
    }
    
    public Araba(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }
void dur() { System.out.println("araba durdu");}
   /*
    her çeşit araba olduğu için alttaki methodu kullanamaz. düz var otomatik araba var vs.
    */
    //public void vitesAt(int currVites){System.out.println(currVites+".Vitese Geçti");}
    
    // classı abstract yaptığım için aşağıdakine izin verdi
    //Sadece böyle bir method olacak ve bu methodun ne yaptığı bu sınıfı hiç ilgilendirmiyor
    //ama bu sınıfı extend eden sınıf vitesAt methodunu override etmek zorunda
    public abstract void vitesAt(int currVites);
    
    
}

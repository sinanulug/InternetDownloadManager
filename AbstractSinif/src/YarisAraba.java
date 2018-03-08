
public class YarisAraba extends Araba{

    public YarisAraba() {
        
    }
   
    public void YarisAraba(String marka, String model)
    {
        this.marka=marka;
        this.model=model;
        
    }
    
    @Override
    public void vitesAt(int currVites) {
     
    }

    @Override
    public String toString() {
    return marka+model;
    }
    
    
    
}

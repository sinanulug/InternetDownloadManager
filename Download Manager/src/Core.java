
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Core implements Runnable
{

    DLManager dlm;
    public Core(DLManager dlm) {
        this.dlm=dlm;
        new Thread(this).start();
    }
    public void run() 
    {
        try {
            URL indirilecekUrl=new URL(dlm.getDownloadURL());
            File saveFile=new File(dlm.getSavedFilePath());
           
          
            URLConnection uc=indirilecekUrl.openConnection();
            int total=uc.getContentLength();
            int saved=0;
            double percent=0;
            byte[] data=new byte[16384];
            int okunan=0;
            InputStream is=uc.getInputStream();
            FileOutputStream fos=new FileOutputStream(saveFile);
            while ((okunan=is.read(data)) !=-1) {                
                saved+=okunan;
                percent=(saved*100.0) /total;
                dlm.showPercent(percent, total, saved);
                fos.write(data,0,okunan);
            }
            fos.close();
   
        } catch (Exception e) {
            e.printStackTrace();
            dlm.showError();
      
        }
    }
    
}

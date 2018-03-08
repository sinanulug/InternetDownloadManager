public interface DLManager {
    public String getDownloadURL();
    public String getSavedFilePath();
    public void showPercent(double percent,double total,double downloaded);
    public void showCompleted();
    public void showError();
    
}

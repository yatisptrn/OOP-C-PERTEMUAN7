package pertemuan702;

/**
 *
 * @author Yati Sugiri 
 * tgl: 8 mei 2025
 */
public class Hewan {
    private String nama="";
    private String suara;
    
    protected void setNama (String nm){
        this.nama = nm;
    }
    public String getNama(){
        return this.nama;
    }
    public void setSuara (String su){
        this.suara = su;
    }
    public String getSuara(){
        return this.suara;
    }
}

package pertemuan703;

/**
 *
 * @author Yati Sugiri
 * tgl: 8 mei 2025
 */
public class segi3 extends BangunRuang {
    private int alas, tinggi;
    
    @Override
    public void hitungLuas (){
        this.luas = this.alas*this.tinggi/2;
    }
    
    public void setAlas(int nilai){
        this.alas = nilai;
    }
    public void setTinggi(int nilai){
        this.tinggi = nilai;
    }
    public void cetakLuas(){
        System.out.printf("Luas segitiga dengan nilai alas= d% dan tinggi= d% adalah %.2f", this.alas, this.tinggi,this.luas);
    }
}

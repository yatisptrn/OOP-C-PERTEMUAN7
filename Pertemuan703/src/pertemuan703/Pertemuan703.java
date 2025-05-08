package pertemuan703;

/**
 *
 * @author Yati Sugiri
 * tgl; 8 mei 2025
 */
public class Pertemuan703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        segi3 segiTiga = new segi3 ();
        segiTiga.setAlas(5);
        segiTiga.setTinggi(10);
        segiTiga.hitungLuas();
        segiTiga.cetakLuas();
        
        persegi kotak = new persegi();
        kotak.setPanjang(10);
        kotak.setLebar(5);
        kotak.hitungKeliling();
        kotak.hitungLuas();
    }
    
    
}

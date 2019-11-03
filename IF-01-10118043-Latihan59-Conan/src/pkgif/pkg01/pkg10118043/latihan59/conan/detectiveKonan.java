/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan59.conan;

/**
 *
 * @author user
 */
public class detectiveKonan {
    protected String nama, pekerjaan, bajuWarna, Keahlian, posisi;
    
    public detectiveKonan(String nama, String pekerjaan, String bajuWarna,String Keahlian,String posisi){
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.bajuWarna = bajuWarna;
        this.Keahlian = Keahlian;
        this.posisi = posisi;
        
    }
    public void displayAnggota(){
        System.out.println("Nama            = "+nama);
        System.out.println("Peran           = "+pekerjaan);
        System.out.println("Karakteristik   = "+bajuWarna);
        System.out.println("Keahlian        = "+Keahlian);
        System.out.println("Posisi          = "+posisi+"\n");
        
    }
}

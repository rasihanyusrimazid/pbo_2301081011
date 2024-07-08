/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_080624;

/**
 *
 * @author acer
 */
public class Buku {
    private String kodebuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunterbit;
    
    public Buku(){
    
    }
    public Buku(String kodebuku, String judul, String pengarang, String penerbit, int tahunterbit){
        this.kodebuku = kodebuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunterbit = tahunterbit;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(int tahunterbit) {
        this.tahunterbit = tahunterbit;
    }
    
    
}

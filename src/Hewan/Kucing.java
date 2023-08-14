/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author Windows 10
 */
class Hewan {
    private String nama;
    private String jenis;
    
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, String jenis, String ras) {
        super(nama, jenis);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public static void main(String[] args) {
        Kucing cat = new Kucing("Tom", "Persia", "Anggora");
        System.out.println("Nama kucing: " + cat.getNama());
        System.out.println("Jenis kucing: " + cat.getJenis());
        System.out.println("Ras kucing: " + cat.getRas());
    }
}



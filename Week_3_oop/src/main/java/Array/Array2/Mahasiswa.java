/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array.Array2;

/**
 *
 * @author angelica
 */
public class Mahasiswa {
    private String nrp;
    private String nama;
    private String kota;

    public Mahasiswa(String nrp, String nama, String kota) {
        this.nrp = nrp;
        this.nama = nama;
        this.kota = kota;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nrp='" + nrp + '\'' +
                ", nama='" + nama + '\'' +
                ", kota='" + kota + '\'' +
                '}';
    }
}

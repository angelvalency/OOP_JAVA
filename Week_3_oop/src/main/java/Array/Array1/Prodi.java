/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array.Array1;

/**
 *
 * @author angelica
 */

public class Prodi {
    private String namaProdi;
    private String kaProdi;
    private Kelas dataKelas[];
    private int index;

    public Prodi(String namaProdi, String kaProdi) {
        this.namaProdi = namaProdi;
        this.kaProdi = kaProdi;
        this.dataKelas = new Kelas[4];
        this.index = 0;
    }

    public boolean addData(Kelas k) {
        if(index < dataKelas.length) {
            dataKelas[index] = k;
            index = index + 1;
            return true;
        }
        else {
            return false;
        }
    }

    public Kelas getData(int index){
        return dataKelas[index];
    }

    public Kelas getData(String namaKelas){
        for(int i = 0; i < index; i++){
            if(dataKelas[i].getNamaKelas().equalsIgnoreCase(namaKelas)){
                return dataKelas[i];
            }
        }
        return dataKelas[index];
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    public String getKaProdi() {
        return kaProdi;
    }

    public void setKaProdi(String kaProdi) {
        this.kaProdi = kaProdi;
    }

    public Kelas[] getDataKelas() {
        return dataKelas;
    }

    public void setDataKelas(Kelas[] dataKelas) {
        this.dataKelas = dataKelas;
    }

    @Override
    public String toString() {
        String str = "Nama Prodi = " + namaProdi + "\n";
        str = str + "Nama Kaprodi = " + kaProdi + "\n";
        
        for (int i = 0; i < dataKelas.length; i++) {
            if(dataKelas[i] != null){
                str = str + dataKelas[i].toString() + "\n";
            }
            else{
                break;
            }
        }
        return str;
    }
}

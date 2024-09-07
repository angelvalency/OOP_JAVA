/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array.Array1;

import java.util.Arrays;

/**
 *
 * @author angelica
 */
public class Kelas {
    private String namaKelas;
    private String dosenWali;
    private Mahasiswa[] dataMhs;
    private int index;

    public Kelas(String namaKelas, String dosenWali, Mahasiswa[] dataMhs) {
        this.namaKelas = namaKelas;
        this.dosenWali = dosenWali;
        this.dataMhs = dataMhs;
        int N = 0;
        for(int i = 0; i<this.dataMhs.length; i++){
            if(this.dataMhs[i] != null){
                N++;
            }
            else{

                break;
            }
        }
        this.index = N;
    }

    public Kelas(String namaKelas, String dosenWali) {
        this.namaKelas = namaKelas;
        this.dosenWali = dosenWali;
        this.dataMhs = new Mahasiswa[10];
        index = 0;
    }

    public boolean addData(Mahasiswa m) {
        if(index < dataMhs.length) {
            dataMhs[index] = m;
            index = index + 1;
            return true;
        }
        else {
            return false;
        }
    }

    public Mahasiswa getData(int index){
        return dataMhs[index];
    }

    public Mahasiswa getData(String nrp){
        for(int i = 0; i < index; i++){
            if(dataMhs[i].getNrp().equalsIgnoreCase(nrp)){
                return dataMhs[i];
            }
        }
        return dataMhs[index];
    }

    public int getIndex() {
        return index;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(String dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Mahasiswa[] getDataMhs() {
        return dataMhs;
    }

    public void setDataMhs(Mahasiswa[] dataMhs) {
        this.dataMhs = dataMhs;
    }

    @Override
    public String toString() {
//        return "Kelas{" +
//                "namaKelas='" + namaKelas + '\'' +
//                ", dosenWali='" + dosenWali + '\'' +
//                ", dataMhs=" + Arrays.toString(dataMhs) +
//                '}';
        String str = "Nama Kelas = " + namaKelas + "\n";
        str = str + "Nama Wali = " + dosenWali + "\n";
        for (int i = 0; i < dataMhs.length; i++) {
            if(dataMhs[i] != null){
                str = str + dataMhs[i].toString() + "\n";
            }
            else{
                break;
            }
        }
//        for(int i = 0; i < index; i++){
//            str = str + dataMhs[i].toString() + "\n";
//        }
        return str;
    }
}


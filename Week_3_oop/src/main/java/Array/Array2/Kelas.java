/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array.Array2;

/**
 *
 * @author angelica
 */
    public class Kelas {
    private String namaKelas;
    private String dosenWali;
    private ArrData dataMhs;


    public Kelas(String namaKelas, String dosenWali) {
        this.namaKelas = namaKelas;
        this.dosenWali = dosenWali;
        this.dataMhs = new ArrData(10);
    }

    public Kelas(String namaKelas, String dosenWali, ArrData dataMhs) {
        this.namaKelas = namaKelas;
        this.dosenWali = dosenWali;
        this.dataMhs = dataMhs;
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

    public ArrData getDataMhs() {
        return dataMhs;
    }

    public void setDataMhs(ArrData dataMhs) {
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
        for (int i = 0; i < dataMhs.getData().length; i++) {
            if(dataMhs.getData()[i] != null){
                str = str + dataMhs.toString() + "\n";
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


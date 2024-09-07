/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angelica
 */
import Array.Array1.Kelas;
import Array.Array1.Mahasiswa;
import Array.Array1.Prodi;

public class Main3 {
       public static void main(String[] args) {
        Mahasiswa dataMhs[] = {new Mahasiswa("17" , "Vonda" , "Surabaya"),new Mahasiswa("18" , "Ghaly" , "Sidoarjo"), new Mahasiswa("29", "Angel", "Mojokerto")};
        Kelas A = new Kelas("2D3A", "Pak Fahrul", dataMhs);
        System.out.println("searching dengan Index = " + A.getData(1));
        System.out.println("searching dengan NRP = " + A.getData("02"));
        System.out.println(A);

        Kelas B = new Kelas("2D3B", "Pak Adam");
//        B.getDataMhs()[0] = new Mahasiswa("32" , "Ula" , "Malang");
        B.addData(new Mahasiswa("3123500031", "Alfian" , "Jombang"));
        System.out.println(B);

        Prodi D3 = new Prodi("D3" , "Pak Syauqi");
        D3.addData(A);
        D3.addData(B);
        System.out.println(D3);
    }
}



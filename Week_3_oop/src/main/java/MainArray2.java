/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angelica
 */

import Array.Array2.ArrData;
import Array.Array2.Kelas;
import Array.Array2.Mahasiswa;
import Array.Array2.Prodi;

public class MainArray2 {
    public static void main(String[] args) {
        Mahasiswa dataMhs[] = {new Mahasiswa("01" , "Ragil" , "Mojokerto"),new Mahasiswa("02" , "Nano" , "Sidoarjo")};
        Kelas A = new Kelas("2D3A","Pak Fahrul", new ArrData(dataMhs));
        System.out.println("index 1 = " + A.getDataMhs().getIndex());
        A.getDataMhs().addData(new Mahasiswa("11" , "Ojan" , "Bandung"));
        System.out.println("index 2 = " + A.getDataMhs().getIndex());
        System.out.println(A);
    }
}



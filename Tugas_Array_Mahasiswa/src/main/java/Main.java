/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author angelica
 */
import Array.Kelas;
import Array.Mahasiswa;
import Array.Prodi;

public class Main {

//    public static void main(String args[]) {
//        Mahasiswa arMhs[] = new Mahasiswa[10];
//        arMhs[0] = new Mahasiswa("01", "Angel", "Surabaya");
//        arMhs[1] = new Mahasiswa("02", "Firsty", "Surabaya");
//
//        // Printing the contents of the array using the overridden toString() method
//          for(int i = 0; i < arMhs.length; i++) {
//            if (arMhs[i] != null) {  // Check to avoid NullPointerException
//                System.out.println(arMhs[i].toString());
//            }
//        }
//    }
//}
    public static void main(String[] args) {
        Mahasiswa arrMhs[] = new Mahasiswa[10];
        arrMhs[0] = new Mahasiswa("17", "Vonda" , "Surabaya");
        arrMhs[1] = new Mahasiswa("18", "Ghaly" , "Surabaya");
        Kelas A = new Kelas("2D3A" , "Pak Fahrul");
        A.addData(arrMhs[0]);
        A.addData(arrMhs[1]);
        A.addData(new Mahasiswa("29", "Angel" , "Mojokerto"));
        System.out.println(A);

        Mahasiswa arrMhsB[] = new Mahasiswa[10];
        arrMhsB[0] = new Mahasiswa("01", "Yafi" , "Surabaya");
        arrMhsB[1] = new Mahasiswa("05", "Hana" , "Darjo");
        Kelas B = new Kelas("2 D3B" , "Pak Rosyid",arrMhsB);
        B.addData(new Mahasiswa("15", "Devi" , "Blitar"));
        System.out.println(B);

        Prodi prodiD3 = new Prodi("D3 Teknik Informatika","Pak Syauqi");
        prodiD3.addData(A);
        prodiD3.addData(B);
        System.out.println(prodiD3);
    }
}

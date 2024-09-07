package Array;
import Array.Array1.Mahasiswa;

/**
 *
 * @author angelica
 */
public class Main {

    public static void main(String[] args) {
        Mahasiswa arMhs[] = new Mahasiswa[10];
        arMhs[0] = new Mahasiswa("01", "Angel", "Surabaya");
        arMhs[1] = new Mahasiswa("02", "Firsty", "Surabaya");

        // Printing the contents of the array using the overridden toString() method
        for (Mahasiswa arMh : arMhs) {
            if (arMh != null) {
                // Check to avoid NullPointerException
                System.out.println(arMh.toString());
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array.Array2;
import java.util.Arrays;

/**
 *
 * @author angelica
 */

public class ArrData {
    private Object[] data;
    private int index;

    public ArrData(Object[] data) {
        this.data = data;
        int N = 0;
        for(int i = 0; i<this.data.length; i++){
            if(this.data[i] != null){
                N++;
            }
            else{

                break;
            }
        }
        this.index = N;
    }

    public ArrData(int size) {
        data = new Object[size];
        index = 0;
    }

    public Object[] getData() {
        return data;
    }

    public boolean addData(Object o) {
        if(index < data.length) {
            data[index] = o;
            index = index + 1;
            return true;
        }
        else {
            return false;
        }
    }

    public Object getData(int index){
        return data[index];
    }

    public Object getData(String nrp){
        for(int i = 0; i < index; i++){
            Mahasiswa m = (Mahasiswa) data[i];
            if(m.getNrp().equalsIgnoreCase(nrp)){
                return data[i];
            }
        }
        return null;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < data.length; i++) {
            if(data[i] != null){
                str = str + data[i] + "\n";
            }
            else{
                break;
            }
        }
        return str.toString();
    }
}

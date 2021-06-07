/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author MOKLET-01
 */
public class Induk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // overload
        //inisialisasi objek pemanggilan
        Anak objek = new Anak();
        objek.identitas();  //pemanggilan  method identitas ke 1
        objek.identitas("Syahra Zulya Shania Maghfiroh", 145720, "Blitar, 4 Juli 2004");    //pemanggilan method identitas ke 2 dengan pengisian parameternya
        objek.identitas("Ds. Jati Kec. Udanawu Kab. Blitar", "RPL");    //pemanggilan method identitas ke 3 dengan pengisian parameternya
    
    }
    
}

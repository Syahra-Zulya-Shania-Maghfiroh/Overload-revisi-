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
public class Anak {
    //method identitas ke 1
    void identitas(){
        System.out.println("\t KARTU PELAJAR");
        System.out.println("\tSMK Telkom Malang");
        System.out.println("-------------------------------------");
    }
    //method identitas ke 2
    void identitas(String nama, int NIS, String TTL){
        System.out.println("Nama    : "+nama);
        System.out.println("NIS     : "+NIS);
        System.out.println("TTL     : "+TTL);
    }
    //method identitas ke 3
    void identitas(String alamat, String jurusan){
        System.out.println("Alamat  : "+alamat);
        System.out.println("Jurusan : "+jurusan);
}
}
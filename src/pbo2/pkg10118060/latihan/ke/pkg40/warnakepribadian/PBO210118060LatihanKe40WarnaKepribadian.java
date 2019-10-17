/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg40.warnakepribadian;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Permai Ramadhan
 * NIM : 10118060
 */
public class PBO210118060LatihanKe40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User usr =new User();
        Warna W = new Warna();
        W.Awal();
        System.out.print("Pilih Warna Favoritmu :");
        Scanner rgb = new Scanner(System.in);
        W.setFav(rgb.nextLine().toLowerCase());
        System.out.print("Nama Kamu :");
        Scanner a = new Scanner(System.in);
        usr.setNama(a.nextLine());
        System.out.println("");
        
        System.out.println("=== Hasil Test Kepribadian "+usr.getNama().toUpperCase()+" ===");
        W.cek_kepribadian(W.getFav());
        W.dev();
    }
    
}

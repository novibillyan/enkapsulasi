/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author ASUS
 */
public class tessiswa {
    public static void main(String args[]) {
    encapsiswa siswa = new encapsiswa();
    siswa.setName ("Novi Billyan");
    siswa.setAge (29);
    siswa.getAddress ("Malang");
    
    System.out.println("Name :"+ siswa.getName() );
     System.out.println("Absen :"+ siswa.getAbsen());
      System.out.println("Address :"+ siswa.getAddress());
    }
}

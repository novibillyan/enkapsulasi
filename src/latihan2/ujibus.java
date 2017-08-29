/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;


/**
 *
 * @author ASUS
 */
public class ujibus {
public static void main(String[] arg){
//membut objek busmini dari kelas bus
bus busmini = new bus();
//memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek busmini
busmini.penumpang = 5;
busmini.maxPenumpang = 15;
//memanggil method cetak pada kelas bus
busmini.cetak ();
//menambahkan penumpang pada busmini
busmini.penumpang = busmini.penumpang + 5;
//memanggil method cetak pada kelas bus
busmini.cetak();
//mengurangi jumlah penumpang pada busmini
busmini.penumpang = busmini.penumpang - 2;
busmini.cetak();
//menambahkan jumlah penumpang pada busmini
busmini.penumpang = busmini.penumpang + 8;
busmini.cetak();

}    
}

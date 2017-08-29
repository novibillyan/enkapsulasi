/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author ASUS
 */
public class ujibus3 {
    public static void main(String[] abc)
    {
    bus3 bus = new bus3(5);
        bus.getpenumpang (17);
        bus.getpenumpang (24);
        bus.cetakpenumpang ();
        //penambahan penumpang
        bus.addpenumpang (2);
        bus.cetakpenumpang ();
        bus.addpenumpang (1);
        bus.cetakpenumpang ();
        bus.addpenumpang (2);
        bus.cetakpenumpang ();
        bus.addpenumpang (2);
        bus.cetakpenumpang ();   
    }
}

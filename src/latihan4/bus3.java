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
public class bus3 {
    public int penumpang;
    public int maxpenumpang;
    public bus3(int maxpenumpang)
    {
    this.maxpenumpang = maxpenumpang;
    penumpang = 0;
    }
    //method mutator
    public void addpenumpang (int penumpang)
    {
    int temp;
    temp  = this.penumpang+penumpang;
    if (temp > maxpenumpang)
    {
        System.out.println("Penumpang melebihi kuota");
    }else 
    {
    this.penumpang=temp;
    }
   }
  public void getpenumpang(int password)
  {
  if (password==24)
    {
        System.out.println("Password Benar");
    }else
    {
    System.out.println("Password salah");
    }
  }
  public void cetakpenumpang ()
  {
      System.out.println ("Penumpang Bus Sekarang =  "+penumpang);
      System.out.println ("Maxsimal penumpang yang seharusnya adalah = "+maxpenumpang);
  }
            
}

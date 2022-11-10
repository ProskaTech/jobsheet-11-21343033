//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js11;

/**
 *
 * @author User
 */
public class B extends A {
    private int b;
    
    public void setB(int nilai) {
        b = nilai;
    }
    
    public int getB() {
        return b;
    }
    //melakukan override terhadap method tampilkanNIlai()
    //yang terdapat pada kelas A
    public void tampilkanNilai() {
        super.tampilkanNilai(); //memanggil method dalam kelas A
        System.out.println("Nilai b = " +getB());
    }
}

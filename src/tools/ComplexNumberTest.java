/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.List;

/**
 *
 * @author TICS03
 */
public class ComplexNumberTest {
    public static void main(String[] args) {
        TP02_P5();
    }
    
    public static void TP02_P5() {
        
        System.out.println("TP02_P5_a)");
        ComplexNumber a = new ComplexNumber((float)( 2*Math.sqrt(3) ), -2 );
        List<ComplexNumber> list = a.rootN(2);
        printArrayList(list);
        
        System.out.println("TP02_P5_d)");
        ComplexNumber d = new ComplexNumber(0, -16 );
        list = d.rootN(4);
        printArrayList(list);
    }
    public static void printArrayList(List<ComplexNumber> list) {
        for ( ComplexNumber cn:list ) {
            System.out.println(cn.toCIS());
        }
    }
    public static void TP01_P1() {
    // TP01 P1
        ComplexNumber a0 = new ComplexNumber(-1, 2);
        System.out.println("a0: " + a0);
        
        ComplexNumber a1 = new ComplexNumber(4, 0);
        System.out.println("a1: " + a1);
       
        ComplexNumber a2 = new ComplexNumber(1, -1);
        System.out.println("a2: " + a2);
        
        ComplexNumber a3 = new ComplexNumber(2, -1);
        System.out.println("a3: " + a3);
        
        ComplexNumber a4 = new ComplexNumber(1, 1);
        System.out.println("a4: " + a4);
        
        ComplexNumber a0_2 = a0.toN(2);
        System.out.println("a0_2: " + a0_2);

        
        ComplexNumber div0 = a1.div(a2);
        System.out.println("div0: " + div0);
        
        ComplexNumber div1 = a3.div(a4);
        System.out.println("div1: " + div1);
        
        ComplexNumber suma = div0.add(div1);
        System.out.println("suma: " + suma);
        ComplexNumber TP01_P1 = a0_2.mult(suma);
        
        System.out.println("TP01_P1: " + TP01_P1.getA() + 
                " + " + TP01_P1.getB()+"i");
    }
}

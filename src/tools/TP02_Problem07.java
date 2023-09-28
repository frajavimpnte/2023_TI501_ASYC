/* ITESS-TICS
 * Semestre Agosto-Diciembre 2023 
 * ANSYSC
 * TP02 Funciones
 * By FJMP
 * 28/09/2023
 */
package tools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TICS03
 */
public class TP02_Problem07 {
    public List<ComplexNumber> z = new ArrayList<>();
    public List<ComplexNumber> w = new ArrayList<>();
    
    public static void main(String []args) {
        TP02_Problem07 p = new TP02_Problem07();
        p.initZ();
        p.computeW();
        
        System.out.println("Z:");
        printArrayList(p.z);
        System.out.println("W:");
        printArrayList(p.w);
    }
    public void initZ() {
        z.add(new ComplexNumber(1,1));
        z.add(new ComplexNumber(2,-2));
    }
    
    public void computeW() {
        for (ComplexNumber c:z){
            w.add( c.mult( (new ComplexNumber(2,0)).subs(c) ));
        }
    }
    
    public static void printArrayList(List<ComplexNumber> list) {
        for ( ComplexNumber cn:list ) {
            System.out.println(cn);
        }
    }
}

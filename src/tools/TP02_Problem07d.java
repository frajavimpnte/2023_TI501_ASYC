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
public class TP02_Problem07d {
    public List<ComplexNumber> z = new ArrayList<>();
    public List<ComplexNumber> w = new ArrayList<>();
    
    public static void main(String []args) {
        TP02_Problem07d p = new TP02_Problem07d();
        p.initZ();
        p.computeW();
        
        System.out.println("Z:");
        printArrayList(p.z);
        System.out.println("W:");
        printArrayList(p.w);
    }
    public void initZ() {
        int n = 100;
        
        float delta = 1.0f/n;
        for (float a = 0.0f; a <= 1.0f; a += delta)
            for (float b = 0.0f; b <= 1.0f; b += delta)
                z.add( new ComplexNumber(a,b));
                
    }
    
    public void computeW() {
        for (ComplexNumber c:z){
            w.add( c.toN(2) );
        }
    }
    
    public static void printArrayList(List<ComplexNumber> list) {
        for ( ComplexNumber cn:list ) {
            System.out.println(cn);
        }
    }
}

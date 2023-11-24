/* ITESS-TICS
 * Semestre Agosto-Diciembre 2023 
 * ANSYSC
 * Tema 3. Transformada de Fourier
 *    Test Sample1
 * By FJMP
 * 24/11/2023
 */
package fourier.transform;

import tools.ComplexNumber;

/**
 *
 * @author TICS03
 */
public class TFSample1Test {
    public static void main(String[] args) {
        TFSample1 tf1 = new TFSample1(5);
        
        tf1.computeW();
        tf1.computeFw();
        tf1.computeFwMod();
        tf1.computeFwPhase();
        
        System.out.println("Fw:----------------------");
        ComplexNumber[] Fw = tf1.getFw();
        for(int i = 0; i < Fw.length; i++) {
            System.out.println(Fw[i]);
        }
        
        System.out.println("|Fw|:----------------------");
        float[] FwMod = tf1.getFwMod();
        for(int i = 0; i < FwMod.length; i++) {
            System.out.println(FwMod[i]);
        }
    }
}

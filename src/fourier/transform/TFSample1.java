/* ITESS-TICS
 * Semestre Agosto-Diciembre 2023 
 * ANSYSC
 * Tema 3. Transformada de Fourier
 *    Sample1: f(t) = exp(-at)
 * By FJMP
 * 24/11/2023
 */
package fourier.transform;

import tools.ComplexNumber;

/**
 *
 * @author TICS03
 */
public class TFSample1 extends TFAbstract {
    public TFSample1(int wPoints) {
        super(wPoints);
    }
    public void computeFw() {
        float a = 1.0f;
        for (int i = 0; i < wPoints; i++) {
           
            Fw[i] = new ComplexNumber(
                     a/(a*a + w[i]*w[i]), 
                    -w[i]/(a*a+w[i]*w[i]));
        } 
    }
}

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
public class TFSample_TP01_P1 extends TFAbstract {
    public TFSample_TP01_P1(int wPoints) {
        super(wPoints);
    }
    public void computeFw() {
        float b = 2.0f;
        for (int i = 0; i < wPoints; i++) {
           
            Fw[i] = new ComplexNumber(
                     (float) (Math.sqrt(2/Math.PI) * Math.sin(b * w[i]) /w[i]), 
                      0);
        } 
    }
}

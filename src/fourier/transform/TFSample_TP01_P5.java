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

public class TFSample_TP01_P5 extends TFAbstract {
    public TFSample_TP01_P5(int wPoints) {
        super(wPoints);
    }
    public void computeFw() {
        float b = 2.0f;
        float a = 1.0f;
        for (int i = 0; i < wPoints; i++) {
            ComplexNumber cn1 = new ComplexNumber(1, 0);
            ComplexNumber cn2 = new ComplexNumber(
                         (float)(Math.sqrt(2*Math.PI)*a),
                     (float)(Math.sqrt(2*Math.PI)*w[i]));
            
            Fw[i] = cn1.div(cn2);
        } 
    }
}

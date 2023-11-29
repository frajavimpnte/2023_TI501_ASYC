/* ITESS-TICS
 * Semestre Agosto-Diciembre 2023 
 * ANSYSC
 * Tema 3. Transformada de Fourier
 *    Abstract template compute
 * By FJMP
 * 24/11/2023
 */
package fourier.transform;

import tools.ComplexNumber;

/**
 *
 * @author TICS03
 */
public abstract class  TFAbstract {
    protected int    wPoints;
    protected float w[];
    protected ComplexNumber Fw[];
    protected float FwMod[];
    protected float FwPhase[];
    
    protected float wMIN;
    protected float wMAX;
    
    protected float FwRealMIN;
    protected float FwRealMAX;
    protected float FwImagMIN;
    protected float FwImagMAX;
    
    protected float FwModMIN;
    protected float FwModMAX;
    
    protected float FwPhaseMIN;
//    protected float FwPhaseMAX;
    
    public TFAbstract(int wPoints) {
        this.wPoints = wPoints;
        w = new float[wPoints];
        Fw = new ComplexNumber[wPoints];
        FwMod = new float[wPoints];
        FwPhase = new float[wPoints];
    }
    
    public void computeW() {
        for (int i=0; i < wPoints; i++) {
            w[i] = i;
        }
    }
    
    public void computeFwMod() {
        for (int i=0; i < wPoints; i++) {
            FwMod[i] = Fw[i].mod();
        }
    }
    
    public void computeFwPhase() {
        for (int i=0; i < wPoints; i++) {
            FwPhase[i] = Fw[i].angle();
        }
    }
    
    public abstract void computeFw();

    public int getWPoints() {
        return wPoints;
    }

    public float[] getW() {
        return w;
    }

    public ComplexNumber[] getFw() {
        return Fw;
    }

    public float[] getFwMod() {
        return FwMod;
    }

    public float[] getFwPhase() {
        return FwPhase;
    }
}

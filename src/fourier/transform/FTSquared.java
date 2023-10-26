package fourier.transform;

import tools.ComplexNumber;

public class FTSquared {
    private float w[];
    private ComplexNumber[] Fw;
    private int nPoints;
    private float t[];
    private float ft[];
    private final float k = 1;
    private final float a = 1;
    
    public FTSquared(int nPoints) {
        this.nPoints = nPoints;
        this.w = new float[nPoints];
        this.Fw = new ComplexNumber[nPoints];
        this.t = new float[nPoints];
        this.ft = new float[nPoints];
    }
    
    public void computeT(float tMin, float tMax) {
        float dt = (tMax - tMin)/nPoints;
        
        for ( int i = 0; i < nPoints; i++) {
            t[i] = tMin + dt*i;
        }
    }
    
    public void computeFt() {
        for ( int i = 0; i < nPoints; i++) {
            if ( 0 <=  t[i]  && t[i] <= a) 
                ft[i] = k;
        }
    }
    public float[] getT() {
        return t;
    }
    
    public float[] getFt() {
        return ft;
    }
    public void computeW(float wMax) {
        float dw = wMax/nPoints;

        for (int i = 0; i < nPoints; i++) {
            w[i] = 0.01f + i*dw;
        }
    }
    
    public void computeFw() {
       
        for (int i = 0; i < nPoints; i++) {
            float fact = k / (w[i]*2.5066f);
            Fw[i] = new ComplexNumber(
                    (float) (-Math.sin(-w[i]*a)) * fact,
                    (float) (Math.cos(-w[i]*a) - 1) * fact
                );
        }
    }
}

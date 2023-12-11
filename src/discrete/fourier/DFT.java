package discrete.fourier;

import tools.ComplexNumber;

public  class  DFT {
    protected int nPoints;
    protected float[] signal;
    protected float ts;
    protected float[] ws;
    protected ComplexNumber[] fw;

    public DFT(int nPoints, float ts, float[] signal) {
        this.nPoints = nPoints;
        this.signal = signal;
        this.ts = ts;
        
        ws = new float[nPoints];
        fw = new ComplexNumber[nPoints];
    }
    
    public int getSamplesNumber() {
        return nPoints;
    }
    public float getSampleTime() {
        return ts;
    }
    
    public void compute() {
        for (int u=0; u < nPoints; u++) {
            float a = 0;
            float b = 0;
            ws[u] = (float)(2*Math.PI*u/(ts*nPoints));
            for (int k=0; k < nPoints; k++) {
                //f(k) * exp[ -i*2*pi*u*k/(ts*N) ]
                a += (float)(signal[k]*Math.cos(-ws[u]*k ));
                b += (float)(signal[k]*Math.sin(-ws[u]*k ));
            }
            fw[u] = new ComplexNumber(a,b);
        }
    }
    
    public float[] getFrequency() {
        return ws;
    }
    
    public ComplexNumber[] getFw() {
        return fw;
    }
}

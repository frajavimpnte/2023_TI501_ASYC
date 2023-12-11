package discrete.system;

public class DiscreteFunctionTP01a implements DiscreteFunction {
    private int nPoints;
    private float ts;
    private float[] time;
    private float[] signal;
    private float tMin;
    private float tMax;
    private float sMin;
    private float sMax;
    
    public DiscreteFunctionTP01a(float ts, int nPoints) {
        this.ts = ts;
        this.nPoints = nPoints;
    }
    @Override
    public float getSamplingTime() {
        return ts;
    }

    @Override
    public int getSamplesNumber() {
        return nPoints;
    }

    @Override
    public void compute() {
        time = new float[nPoints];
        signal = new float[nPoints];
        
        for (int i=0; i < nPoints; i++) {
            time[i] = i*ts;
            signal[i] = (float) ( Math.cos(2*Math.PI*time[i]) * Math.cos(2*Math.PI*time[i]));
        }
    }

     @Override
    public float[] getTime() {
        return time;
    } 
    
    @Override
    public float[] getSignal() {
        return signal;
    } 
}

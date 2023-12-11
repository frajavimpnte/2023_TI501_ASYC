package discrete.system;

public interface DiscreteFunction {
    public float getSamplingTime();
    public int   getSamplesNumber();     
    public void    compute();
    public float[] getTime();
    public float[] getSignal();
}

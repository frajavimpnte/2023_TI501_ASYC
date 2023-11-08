/* ITESS-TICS
 * Semestre Agosto-Diciembre 2023 
 * ANSYSC
 * Tema 2 Series de Fourier
 * By FJMP
 * 28/09/2023
 */
package fourier.series;

public class TP03_P2_func01 {
    private float T;
    private float f;
    private float[] s;
    private float a0;
    private float[] an;
    private float[] bn;
    
    private float[] t;
    private int nPoints;

    public TP03_P2_func01(float T, int nPoints) {
        this.T = T;
        this.f = 1/T;
        this.nPoints = nPoints; 
    }
    
    public void computeTime(){
        float dt = T/nPoints;
        
        t = new float[nPoints];
        for (int i=0;i<nPoints; i++){
            t[i] = i*dt;
        }          
    }
    
    public void computeSerie(int N){
       float a0 = (float) (2/Math.PI);
       float An[] = {
            0,
            (float)(-2/(3*Math.PI)),
            0,
            (float)(-2/(15*Math.PI)),
            0,
            (float)(-2/(35*Math.PI)),
            0,
            (float)(-2/(63*Math.PI)),
            0,
            (float)(-2/(80*Math.PI))
           };
       
       float Bn[] = {
            0.5f,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
       };
 
       if (N >= 10) N = 10;
       s = new float[nPoints];
       for (int i=0; i<nPoints; i++){
           s[i]= a0/2;
           for(int n=1; n<=N; n++){
               float an = An[n-1];
               float bn = Bn[n-1];
               s[i]+= (float)(an*Math.cos(2*Math.PI*f*n*t[i])+
                             bn*Math.sin(2*Math.PI*f*n*t[i]));
           }
       } 
    }
    
    float[] getTime() {
        return t;
    }
    float[] getSerie() {
        return s;
    }
}
/*
 * ITESS-TICS
 * ASYSC
 * Agosto-Diciembre 2023
 * Descripsión: Transforma coordenadas reales coordenadas SCREEN
 * Autor: FJMP & TI501
 * Fecha: 09/noviembre/2023
 * email: 
 */
package fourier.transform;

/**
 *
 * @author TICS03
 */
public class Coordinate {
    private float XMIN = -7.0f;
    private float XMAX = 7.0f;
    private float YMIN = -7.0f;
    private float YMAX = 7.0f;
    
    private float XSCREEN = 300;
    private float YSCREEN = 300; 
    
    public Coordinate() {
    }
    
    public Coordinate(float xmin, float xmax, float ymin, float ymax, 
            float xscreen, float yscreen) {
        this.XMIN = xmin;
        this.XMAX = xmax;
        this.YMIN = ymin;
        this.YMAX = ymax;
        this.XSCREEN = xscreen;
        this.YSCREEN = yscreen;
    }

    public float getXMIN() {
        return XMIN;
    }

    public float getXMAX() {
        return XMAX;
    }

    public float getYMIN() {
        return YMIN;
    }

    public float getYMAX() {
        return YMAX;
    }
    
    
    public int toScreenX(float x) {
        //return (int) ( x * XSCREEN / XMAX );
        return (int) (  (x - XMIN) * XSCREEN / (XMAX - XMIN)  );
    }
    
    public int toScreenY(float y) {
        //return (int) ( (YMAX - y ) * YSCREEN / YMAX );
        return (int) ( (y - YMAX ) * YSCREEN / (YMIN-YMAX) );
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discrete.system;

import fourier.series.*;

/**
 *
 * @author TICS03
 */
public class Coordinate {
    public static final float XMIN = -2.0f;
    public static final float XMAX = 2.0f;
    public static final float YMIN = -2.0f;
    public static final float YMAX = 2.0f;
    
    public static final float XSCREEN = 300;
    public static final float YSCREEN = 300; 
    
    public static int toScreenX(float x) {
        //return (int) ( x * XSCREEN / XMAX );
        return (int) (  (x - XMIN) * XSCREEN / (XMAX - XMIN)  );
    }
    
    public static int toScreenY(float y) {
        //return (int) ( (YMAX - y ) * YSCREEN / YMAX );
        return (int) ( (y - YMAX ) * YSCREEN / (YMIN-YMAX) );
    }
}

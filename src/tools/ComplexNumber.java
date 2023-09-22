/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author TICS03
 */
public class ComplexNumber {
    private float a;
    private float b;
    
    public ComplexNumber() {
    }

    public ComplexNumber(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    public ComplexNumber conj() {
        return new ComplexNumber(this.a, -this.b);
    }
    
    public static ComplexNumber conj(ComplexNumber z) {
        return new ComplexNumber(z.a, -z.b);
    }
    
    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber(this.a + z.a, this.b + z.b);
    }
    
    public ComplexNumber subs(ComplexNumber z) {
        return new ComplexNumber(this.a - z.a, this.b - z.b);
    }
    
    public ComplexNumber mult(ComplexNumber z) {
        return new ComplexNumber(
                this.a * z.a - this.b * z.b,
                this.a * z.b + z.a * this.b);
    }
    
    public ComplexNumber div(ComplexNumber z) {
        ComplexNumber aux = mult( conj(z) );
        float den = z.a*z.a  + z.b*z.b;
        return new ComplexNumber( aux.a/den, aux.b/den  );
    }
    
    public float mod() {
        return (float) Math.sqrt(this.a*this.a + this.b*this.b);
    }
    
    public static float mod(ComplexNumber z) {
        return (float) Math.sqrt(z.a*z.a + z.b*z.b);
    }
    
    public float angle() {
        return (float) Math.atan2(this.b, this.a);
    }
    
    public static float angle(ComplexNumber z) {
        return (float) Math.atan2(z.b, z.a);
    }
    
    public ComplexNumber toN(int n) {
        float m = mod();
        float angle = angle();
        
        return new ComplexNumber(
                (float) (Math.pow(m, n) * Math.cos(n*angle)),
                (float) (Math.pow(m, n) * Math.sin(n*angle))
        );
    }

    @Override
    public String toString() {
        return "ComplexNumber{" + "a=" + a + ", b=" + b + '}';
    }
    
    
}

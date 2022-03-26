package br.edu.uniaeso.q5;

import static java.lang.Math.sqrt;

public class Triangle {
    private float a, b, h;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        if(a > 0){
            this.a = a;
        }
        else{
            System.out.println("Must be higher than 0");
        }
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        if(b > 0){
            this.b = b;
        }
        else{
            System.out.println("Must be higher than 0");
        }
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public Triangle(float a, float b, float h) {
        setA(a);
        setB(b);
        setH(h);
    }
    public Triangle() {
        setA(0);
        setB(0);
        setH(0);
    }
    public float calculateHypotenuse(){
       return h = (float) (sqrt (a*a + b*b));
    }
}

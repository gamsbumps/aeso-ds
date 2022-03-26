package br.edu.uniaeso.q9;

public class Triangles {
    private int a, b, c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangles(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public Triangles() {
        setA(0);
        setB(0);
        setC(0);
    }
}

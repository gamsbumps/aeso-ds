package br.edu.uniaeso.q7;

public class Rhombus {
    private float diagonal1, diagonal2;

    public float getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(float diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public float getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(float diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public Rhombus(float diagonal1, float diagonal2) {
        setDiagonal1(diagonal1);
        setDiagonal2(diagonal2);
    }

    public Rhombus() {
        setDiagonal1(0);
        setDiagonal2(0);
    }
    public float calculateArea(){
        return (getDiagonal1() * getDiagonal2())/2;
    }

}

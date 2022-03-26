package br.edu.uniaeso.q7;

public class Rhombus {
    private int diagonal1, diagonal2;

    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public Rhombus(int diagonal1, int diagonal2) {
        setDiagonal1(diagonal1);
        setDiagonal2(diagonal2);
    }

    public Rhombus() {
        setDiagonal1(0);
        setDiagonal2(0);
    }
}

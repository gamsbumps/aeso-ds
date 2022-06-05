package br.edu.uniaeso.q25;

import br.edu.uniaeso.q8.DistancePoints;

public class DistanciaPontos extends DistancePoints {
    private float z1, z2;

    public DistanciaPontos() {
        super();
    }

    public DistanciaPontos(float x1, float x2, float y1, float y2, float z1, float z2) {
        super(x1, x2, y1, y2);
        this.z1 = z1;
        this.z2 = z2;
    }

    public float getZ1() {
        return z1;
    }

    public void setX3(float z1) {
        this.z1 = z1;
    }

    public float getZ2() {
        return z2;
    }

    public void setZ2(float z2) {
        this.z2 = z2;
    }

    @Override
    public float calculateDistance() {
        return (float) Math.sqrt(Math.pow(getZ2() - getZ1(), 2) + Math.pow(getY2() - getY1(), 2) + Math.pow(getX2() - getX1(), 2));
    }
}

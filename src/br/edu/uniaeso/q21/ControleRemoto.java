package br.edu.uniaeso.q21;

public class ControleRemoto {
    private int volumeMax = 100, canal;

    Televisao tv = new Televisao();

    public void aumentaVolume() {
        if(tv.getVolume() < volumeMax) {
            tv.setVolume(tv.getVolume() + 1);
        }
    }

    public void diminuiVolume() {
        if(tv.getVolume() > 0) {
            tv.setVolume(tv.getVolume() - 1);
        }
    }

    public void trocaCanal() {
        tv.setCanal(canal);
    }

    public void consulta() {
        System.out.println("Canal: " + tv.getCanal() + "Volume: " + tv.getVolume());
    }
}

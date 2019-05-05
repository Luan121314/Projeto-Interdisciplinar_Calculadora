package projetointerdisciplinar_interfacegrafica;

import java.io.Serializable;

public class Ponto implements Serializable {
    private float cordX;
    private float cordY;

    public Ponto() {
    }

    public Ponto(float cordX, float cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public float getCordX() {
        return cordX;
    }

    public void setCordX(float cordX) {
        this.cordX = cordX;
    }

    public float getCordY() {
        return cordY;
    }

    public void setCordY(float cordY) {
        this.cordY = cordY;
    }

    @Override
    public String toString() {
        return "Valores digitados  Coordenada X: " + getCordX() + " Coordenada: " + getCordY()+"\nResultado:  \n"
                + "Ponto " + "cordX: " + cordX + " | cordY: " + cordY+"\n";
    }
    
}

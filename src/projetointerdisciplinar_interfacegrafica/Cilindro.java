package projetointerdisciplinar_interfacegrafica;

import java.io.Serializable;

public class Cilindro extends Ponto implements Serializable{
    private float raio;
    private float alt;

    public Cilindro() {
    }
    public Cilindro(float raio, float alt) {
        this.raio = raio;
        this.alt = alt;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public float getAlt() {
        return alt;
    }
    public void setAlt(float alt) {
        this.alt = alt;
    }
    public float Calc_vol_cil(){
        float vol_cil = (float) (this.getAlt()*3.14*(Math.pow(this.getRaio(),2)));
        return vol_cil;
    }
    public float Calc_area_cil(){
       float Area_cil = (float) (2*(3.14*Math.pow(this.getRaio(),2))+2*(3.14*this.getRaio()*this.getAlt()));
        return Area_cil;
    }
    @Override
    public String toString() {
        return "Valores digitados  Raio: " + getRaio() + " Altura: " + getAlt() + "\nResultado: \n"
                + "Resultado do calculo do Cilindro:\n"+ "Volume: "+Calc_vol_cil()+" m³"+ "| Area: "+Calc_area_cil()+" m² \n\n";
    }
    
    
    
}

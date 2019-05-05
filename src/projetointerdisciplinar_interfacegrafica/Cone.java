package projetointerdisciplinar_interfacegrafica;

import java.io.Serializable;

public class Cone extends Ponto implements Serializable {
    private float alt;
    private float raio;

    public Cone() {
    }
    public Cone(float raio, float alt) {
        this.raio = raio;
        this.alt = alt;
    }
    public float getAlt() {
        return alt;
    }
    public void setAlt(float alt) {
        this.alt = alt;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public float Cal_area_cone(){
        float geratriz = (float) Math.sqrt((Math.pow(this.getRaio(),2)+Math.pow(this.getAlt(),2)));
        float area_cone = (float) (3.14*this.getRaio()*(geratriz*this.getRaio()));
        return area_cone;
    }
    public float Calc_vol_cone(){
        float vol_cone = (float) ((3.14* Math.pow(this.getRaio(),2)*this.getAlt())/3);
        return vol_cone;
    }
    

    @Override
    public String toString() {
        return "Valores digitados  Altura: " + getAlt() + " Raio: " + getRaio() + "\nResultado: \n"
                + "Resultado do calculo do Cone:\n"+ "Volume: "+Calc_vol_cone()+" m³"+ "| Area: "+Cal_area_cone()+" m² \n\n";
    }
    
    
}

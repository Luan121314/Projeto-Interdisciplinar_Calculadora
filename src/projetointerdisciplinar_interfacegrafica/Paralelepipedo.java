package projetointerdisciplinar_interfacegrafica;

import java.io.Serializable;

public class Paralelepipedo extends Ponto implements Serializable {
    private float alt;
    private float larg;
    private float comp;

    public Paralelepipedo(float alt, float larg, float comp) {
        this.alt = alt;
        this.larg = larg;
        this.comp = comp;
    }
    public Paralelepipedo() {
    }
    public float getAlt() {
        return alt;
    }
    public void setAlt(float alt) {
        this.alt = alt;
    }
    public float getLarg() {
        return larg;
    }
    public void setLarg(float larg) {
        this.larg = larg;
    }
    public float getComp() {
        return comp;
    }
    public void setComp(float comp) {
        this.comp = comp;
    }
    public float Calc_volume_Paralelepipedo(){
       float Vol_paralelepipedo = this.getAlt()*this.getComp()*this.getLarg();
       return Vol_paralelepipedo;
    }
    public float Calc_area_Paralelepipedo(){
        float Area_total_paralelepipedo = (this.getComp()*this.getLarg())+(this.getComp()*this.getAlt())+(this.getAlt()*this.getLarg());
        return Area_total_paralelepipedo;
    }
    
    @Override
    public String toString() {
        return "Valores digitados   Altura "+ getAlt() + " Largura: " + getLarg() + " Comprimento: " + getComp() + "\nResultado : \n"
                + "Resultado do calculo do paralelepipedo:\n"+ "Volume: "+Calc_volume_Paralelepipedo()+" m³"+ "| Area: "+Calc_area_Paralelepipedo()+" m² \n\n";
    }
}

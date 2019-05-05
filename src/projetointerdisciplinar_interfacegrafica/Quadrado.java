
package projetointerdisciplinar_interfacegrafica; 

import java.io.Serializable;

public class Quadrado extends Ponto implements Serializable{
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }
   // public Quadrado() {
    //}
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
   
    //Metodos especias
    public float Calc_Area_Quadrado(){
        float area_quadrado = (float) Math.pow(this.getLado(),2);
        return area_quadrado;
    }
    public float Calc_per_Quadrado(){
        float per_quadrado = this.getLado()*4;
        return per_quadrado;
    }
        @Override
    public String toString() {
        return "Valores digitados  Lado: " + getLado() + "\nResultado:\n"
                + "Perímero do quadrado: " +  Calc_per_Quadrado()+" m"+ " | Area do quadrado: "+ Calc_Area_Quadrado()+" m² \n\n";
    }
}

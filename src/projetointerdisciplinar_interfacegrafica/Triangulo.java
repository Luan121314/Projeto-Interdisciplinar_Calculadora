package projetointerdisciplinar_interfacegrafica;

import java.io.Serializable;

public class Triangulo extends Ponto implements Serializable {
   private float lado_A;
   private float lado_B;
   private float lado_C;

    public Triangulo() {
    }

    public Triangulo(float lado_A, float lado_B, float lado_C) {
        this.lado_A = lado_A;
        this.lado_B = lado_B;
        this.lado_C = lado_C;
    }

    public float getLado_A() {
        return lado_A;
    }
    public void setLado_A(float lado_A) {
        this.lado_A = lado_A;
    }
    public float getLado_B() {
        return lado_B;
    }
    public void setLado_B(float lado_B) {
        this.lado_B = lado_B;
    }
    public float getLado_C() {
        return lado_C;
    }
    public void setLado_C(float lado_C) {
        this.lado_C = lado_C;
    }
//metodos especias
    public float Calc_per_trian(){
        float per_trian = this.getLado_A()+this.getLado_B()+this.getLado_C();
        return per_trian;
    }
    public float Calc_area_trian(){
        float p = Calc_per_trian();  
       float area_trian = (float) Math.sqrt(p*(p-this.getLado_A())*(p-this.getLado_B())*(p-this.getLado_C()));
       //formula de Heron para calcula perímetro
        return (float) area_trian;
    }
    @Override
    public String toString() {
        return "Valores digitados  LadoA: " + getLado_A() + " Lado B: " + getLado_B()+ " Lado C: "+ getLado_C()+"\n"
                + "Perimetro do triângulo: "+ Calc_per_trian()+" m "+" | Area do triângulo: "+ Calc_area_trian() + " m²\n\n";
    }
   
   
    
    
}

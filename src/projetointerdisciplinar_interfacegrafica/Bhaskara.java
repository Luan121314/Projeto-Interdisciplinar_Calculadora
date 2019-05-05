/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinar_interfacegrafica;

import java.io.Serializable;


public class Bhaskara implements Serializable{
    private float valor_a;
    private float valor_b;
    private float valor_c;

    public Bhaskara() {
    }

   

    public Bhaskara(float valor_a, float valor_b, float valor_c) {
        this.valor_a = valor_a;
        this.valor_b = valor_b;
        this.valor_c = valor_c;
    }

    public float getValor_a() {
        return valor_a;
    }
    public void setValor_a(float valor_a) {
        this.valor_a = valor_a;
    }
    public float getValor_b() {
        return valor_b;
    }
    public void setValor_b(float valor_b) {
        this.valor_b = valor_b;
    }
    public float getValor_c() {
        return valor_c;
    }
    public void setValor_c(float valor_c) {
        this.valor_c = valor_c;
    }
    public String Calc_bhaskara(){
        float delta = (float) (Math.pow(this.getValor_b(),2)-4*this.getValor_a()*this.getValor_c());
        String str;
        if(delta > 0){
            float x1 = (-this.getValor_b()+delta)/2*this.getValor_a();
            float x2 = (-this.getValor_b()-delta)/2*this.getValor_a();
            str = "Valor de X1: "+ x1 + " | Valor de X2: " + x2+"\n";
        }else{
            str = "Operação não possui raiz real\n";
        }
        return str;
    }
    @Override
    public String toString() {
        return "Valores digitados  Valor A :" + getValor_a() + " | Valor B: " + getValor_b()+ " | Valor C: "+ getValor_c()+"\nResultado: \n"
                + "Equação de segundo grau :\n" + Calc_bhaskara()+"\n\n"; 
    }

}

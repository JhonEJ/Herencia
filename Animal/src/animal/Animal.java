/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Raul Escobar
 */
public class Animal {
    public static void main(String[] args) {
        
        private String tipoAnimal;
        private int numeroDePatas;
        private String hablar;

    public Animal() {
    }

    public Animal(String tipoAnimal, int numeroDePatas, String hablar) {
        this.tipoAnimal = tipoAnimal;
        this.numeroDePatas = numeroDePatas;
        this.hablar = hablar;
    }

    public String getHablar() {
        return hablar;
    }

    public void setHablar(String hablar) {
        this.hablar = hablar;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipoAnimal=" + tipoAnimal + ", numeroDePatas=" + numeroDePatas + ", hablar=" + hablar + '}';
    }
        
    }
    
}

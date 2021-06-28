/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

public class Herencia {
    public static void main(String[] args) {
        
        private String Animal;
        private int numeroDePatas;
        private String hablar;

    public Herencia() {
    }

    public Herencia(String Animal, int numeroDePatas, String hablar) {
        this.Animal = Animal;
        this.numeroDePatas = numeroDePatas;
        this.hablar = hablar;
    }

    public String getHablar() {
        return hablar;
    }

    public void setHablar(String hablar) {
        this.hablar = hablar;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    @Override
    public String toString() {
        return "Herencia{" + "Animal=" + Animal + ", numeroDePatas=" + numeroDePatas + ", hablar=" + hablar + '}';
    }
        
    }

}



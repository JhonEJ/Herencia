/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.mamifero;

import java.awt.Color;

/**
 *
 * @author Jonathan Escobar
 */
public class Gato extends Animal{
    private String Raza;

    public Gato() {
    }

    public Gato(String Raza) {
        this.Raza = Raza;
    }

    public Gato(int numeroDePatas, String hablar, Color color,String Raza ) {
        super(numeroDePatas, hablar, color);
        this.Raza = Raza;
    }

    
    
    public void mostrarGato (){
    
    System.out.println("Numero de patas: " +getNumeroDePatas() + " Sonido que emite: "+getHablar() +" Color de Animal: "+getColor() +" Raza del animal: "+Raza);
    }
}

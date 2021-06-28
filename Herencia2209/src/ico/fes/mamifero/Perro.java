/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.mamifero;

import java.awt.Color;

/**
 *
 * @author Jonthan Escobar
 */
public class Perro extends Animal{
    
    private String Raza;

    public Perro() {
    }

    public Perro(String Raza) {
        this.Raza = Raza;
    }

    public Perro(int numeroDePatas, String hablar, Color color,String Raza) {
        super(numeroDePatas, hablar, color);
        this.Raza = Raza;
    }


    
    public void mostrarPerro(){
    
        System.out.println("Numero de patas: " +getNumeroDePatas() + " Sonido que emite: "+getHablar() +" Color de animal: "+getColor() +" Raza del animal: "+ Raza);
    
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2209;
import ico.fes.mamifero.Perro;
import ico.fes.mamifero.Gato;
import java.awt.Color;
/**
 *
 * @author Jonathan Escobar
 */
public class Herencia2209 { 

    public static void main(String[] args){
       Perro animal1 = new Perro(4 ,"Ladra" ,Color.GREEN, "Husky");
       animal1.mostrarPerro();
       
       
       Gato animal2 = new Gato(4,"Maulla",Color.GRAY,"gatito miau");
       animal2.mostrarGato();
     
    }
    
}

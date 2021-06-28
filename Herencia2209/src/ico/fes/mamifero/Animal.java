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
public class Animal {
    
    private int numeroDePatas;
    private String hablar;
    private Color color;

    public Animal() {
    }

    public Animal(int numeroDePatas, String hablar, Color color) {
        this.numeroDePatas = numeroDePatas;
        this.hablar = hablar;
        this.color = color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getHablar() {
        return hablar;
    }

    public void setHablar(String hablar) {
        this.hablar = hablar;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroDePatas=" + numeroDePatas + ", hablar=" + hablar + ", color=" + color + '}';
    }

   
    
}

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
public class Perro extends Animal{
    
    private String Raza;

    public Perro() {
    }

    public Perro(String Raza, String tipoAnimal, int numeroDePatas, String hablar) {
        super(tipoAnimal, numeroDePatas, hablar);
        this.Raza = Raza;
    }
    
    public void mostrarPerro(){
        
        System.out.println("Raza" +getTipoAnimal()+getNumeroDePatas()+getHablar()+Raza);
    }
    
}

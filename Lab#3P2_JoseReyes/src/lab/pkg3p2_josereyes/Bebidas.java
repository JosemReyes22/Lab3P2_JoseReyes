/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_josereyes;

/**
 *
 * @author josem
 */
public class Bebidas extends Productos{
    private double tamMil;
    
    
    public Bebidas(double tamMil, String Nombre, double precio) {
        super(Nombre, precio);
        this.tamMil = tamMil;
    }
    public double getTamMil() {
        return tamMil;
    }

    public void setTamMil(double tamMil) {
        this.tamMil = tamMil;
    }
    
    @Override
    public String toString() {
        return "\n"+super.toString()+ ", bebida de " + tamMil + "ml" + '}';
    }
}

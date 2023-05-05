/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_josereyes;

/**
 *
 * @author josem
 */
public class Comidas extends Productos{
    private String Vencido;

    public Comidas(String Vencido, String Nombre, double precio) {
        super(Nombre, precio);
        this.Vencido = Vencido;
    }

    public String getVencido() {
        return Vencido;
    }

    public void setVencido(String Vencido) {
        this.Vencido = Vencido;
    }
    
    
}

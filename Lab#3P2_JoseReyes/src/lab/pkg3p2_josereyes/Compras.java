/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_josereyes;

import java.util.ArrayList;

/**
 *
 * @author josem
 */
public class Compras {
   private ArrayList<Productos> productos;
    private double total;
    
    public Compras(){
        productos = new ArrayList<Productos>();
        total = 0.0;
    }
    
    public void agregarProducto(Productos producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }
    
    public void mostrarCompras() {
        System.out.println("Compras realizadas:");
        for (Productos producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
        System.out.println("Total: $" + total);
    }
    
}

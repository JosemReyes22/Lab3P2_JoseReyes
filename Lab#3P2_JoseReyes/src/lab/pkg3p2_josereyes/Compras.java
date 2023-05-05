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
    private ArrayList <Productos> productos;
    private double total;

    public Compras(Productos producto) {
        this.productos.add(producto);
        total+=producto.getPrecio();
    }
        public void Factura() {
        System.out.println("Productos comprados:");
        for (Productos producto : productos) {
            System.out.println("- " + producto);
        }
        System.out.println("Total: $" + total);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg3p2_josereyes;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Lab3P2_JoseReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner r=new Scanner(System.in);
        int menu=1;
        while(menu==1){
            System.out.println("~~~Menu principal~~~");
            System.out.println("1.Agregar comida\n2.Agregar bebidas\n3.Modificar productos\n4.Eliminar producto\n5.Mostrar Producto\n6.Generar compra\n7.Registro Compras\n8.Salir");
            System.out.print("Elija su opcion: ");
            int op=r.nextInt();
            
            switch(op){
                case 1:{
                    System.out.print("Ingrese el Nombre de la comida: ");
                    r.nextLine();
                    String comidas=r.nextLine();
                    System.out.print("Ingrese el precio de la bebida: ");
                    double precios=r.nextDouble();
                    System.out.print("Ingrese el estado del producto(Vencido/Buen Estado): ");
                    r.nextLine();
                    String Estados=r.nextLine();
                    
                }break;
                case 2:{
                    
                }break;
                case 3:{
                    
                }break;
                case 4:{
                    
                }break;
                case 5:{
                    
                }break;
                case 6:{
                    
                }break;
                case 7:{
                    
                }break;
                case 8:{
                    menu=0;
                    System.out.println("\n~~~~Programa finalizado~~~~");
                }break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}

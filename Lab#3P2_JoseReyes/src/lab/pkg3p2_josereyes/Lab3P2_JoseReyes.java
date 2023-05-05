/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg3p2_josereyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Lab3P2_JoseReyes {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Productos> COMIDAS = new ArrayList<>();
    static ArrayList<Productos> BEBIDAS = new ArrayList<>();
   
    public static void main(String[] args) {
        Compras compraste=new Compras();
        
        Scanner r=new Scanner(System.in);
        int menu=1;
        while(menu==1){
            System.out.println("\n~~~Menu principal~~~");
            System.out.println("1.Agregar comida\n2.Agregar bebidas\n3.Modificar productos\n4.Eliminar producto\n5.Mostrar Producto\n6.Generar compra\n7.Registro Compras\n8.Salir");
            System.out.print("Elija su opcion: ");
            int op=r.nextInt();
            
            switch(op){
                case 1:{
                    
                    System.out.print("Ingrese el Nombre de la comida: ");
                    r.nextLine();
                    String comidas=r.nextLine();
                    System.out.print("Ingrese el precio de la comida: ");
                    double precios=r.nextDouble();
                    System.out.print("Ingrese el estado del producto(Vencido/Buen Estado): ");
                    r.nextLine();
                    String Estados=r.nextLine();
                    COMIDAS.add(new Comidas(Estados,comidas,precios));
                }break;
                case 2:{
                    System.out.print("Ingrese el Nombre de la bebida: ");
                    r.nextLine();
                    String bebidas=r.nextLine();
                    System.out.print("Ingrese el precio de la bebida: ");
                    double precios=r.nextDouble();
                    System.out.print("Ingrese tamano de ML de la bebida: ");
                    double tam=r.nextDouble();
                    BEBIDAS.add(new Bebidas(tam,bebidas,precios));
                }break;
                case 3:{
                    if(COMIDAS.isEmpty() && BEBIDAS.isEmpty()){
                        System.out.println("Listas vacias");
                    }else{
                        Listado();
                        System.out.println("Desea modifica bebidas o comida?");
                        r.nextLine();
                        String mod=r.nextLine().toLowerCase();
                        
                        if(mod.equals("bebidas")){
                            if(BEBIDAS.isEmpty()){
                                System.out.println("Inventario de bebidas vacia");
                            }else{
                                System.out.print("Ingrese el numero de la bebida a modificar:");
                                int num=r.nextInt();
                                num--;
                                System.out.print("Ingrese el nombre nuevo: ");
                                r.nextLine();
                                String new1=r.nextLine();
                                BEBIDAS.get(num).setNombre(new1);
                                System.out.print("Ingrese el precio nuevo: ");
                                double new2=r.nextDouble();
                                BEBIDAS.get(num).setPrecio(new2);
                                System.out.println("Bebida modificada");
                            }
                        }else if(mod.equals("comida")){
                            if(COMIDAS.isEmpty()){
                                System.out.println("Lista de comidas vacia");
                            }else{
                                System.out.print("Ingrese el numero de la comidas a modificar:");
                                int num=r.nextInt();
                                num--;
                                System.out.print("Ingrese el nombre nuevo: ");
                                r.nextLine();
                                String new1=r.nextLine();
                                COMIDAS.get(num).setNombre(new1);
                                System.out.print("Ingrese el precio nuevo: ");
                                double new2=r.nextDouble();
                                COMIDAS.get(num).setPrecio(new2);
                                System.out.println("Comida  modificada");
                            }
                        }else{
                            System.out.println("Error...");
                        }
                    }
                }break;
                case 4:{
                    if(COMIDAS.isEmpty() && BEBIDAS.isEmpty()){
                        System.out.println("Listas vacias");
                    }else{
                        Listado();
                        System.out.println("Desea eliminar bebidas o comida?");
                        r.nextLine();
                        String elim=r.nextLine().toLowerCase();
                        
                        if(elim.equals("bebidas")){
                            if(BEBIDAS.isEmpty()){
                                System.out.println("Inventario de bebidas vacia");
                            }else{
                                System.out.print("Ingrese el numero de la bebida a eliminar:");
                                int num=r.nextInt();
                                BEBIDAS.remove(num-1);
                                System.out.println("Bebida eliminada");
                            }
                        }else if(elim.equals("comida")){
                            if(COMIDAS.isEmpty()){
                                System.out.println("Lista de comidas vacia");
                            }else{
                                System.out.print("Ingrese el numero de la comdia a eliminar:");
                                int num=r.nextInt();
                                COMIDAS.remove(num-1); 
                                System.out.println("Comida eliminada");
                            }
                        }else{
                            System.out.println("Error...");
                        }
                    }
                }break;
                case 5:{
                    System.out.println("Productos\n");
                    if(COMIDAS.isEmpty() && BEBIDAS.isEmpty()){
                        System.out.println("Listas vacias");
                    }else{
                    Listado();
                    }
                }break;
                case 6:{
                    System.out.println("Dese agrega comida o bebida?");
                        r.nextLine();
                        String coms=r.nextLine();
                        if(coms.equals("bebida")){
                            System.out.println("Ingres el numero de la bebida");
                            int coms1=r.nextInt();
                            coms1=coms1-1;
                            Productos producto = BEBIDAS.get(coms1);
                            compraste.agregarProducto(producto);
                        }else if(coms.equals("comida")){
                            System.out.println("Ingres el numero de la comida");
                            int coms1=r.nextInt();
                            coms1=coms1-1;
                            Productos producto = COMIDAS.get(coms1);
                            compraste.agregarProducto(producto);
                        }
                }break;
                case 7:{
                    compraste.mostrarCompras();
                }
                case 8:{
                    menu=0;
                    System.out.println("\n~~~~Programa finalizado~~~~");
                }break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
    public static void Listado(){
        int i=1;
        System.out.println("\nListado de bebidas");
        for (Productos productos : BEBIDAS) {
            System.out.print("Bebida "+i);
            System.out.println(productos);
            i++;
        }
        System.out.println("-------------------");
        int j=1;
        System.out.println("\nListado de comidas");
        for (Productos productos : COMIDAS) {
            System.out.print("Comida "+j);
            System.out.println(productos);
            j++;
        }
        System.out.println("-------------------");
    }
}

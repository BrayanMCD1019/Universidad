package EJERCICIO1;

import java.util.Scanner;

public class VENTAS {
    
    
    public static void main(String[] args){
        
       Scanner deliver = new Scanner(System.in);
       System.out.print("Anote la cantidad de productos: ");
       int cantidadProducto;
       cantidadProducto = deliver.nextInt();
       int totalVendido = 0, mayorVendido = 0 , POS, POSC; 
       double totalIngreso = 0, mayorCosto = 0;
       int[] A = new int[cantidadProducto];
       double[] B = new double[cantidadProducto];     
       int[] C = new int[cantidadProducto];
        
        for (int j = 0; j < cantidadProducto; j++) {
          
           System.out.print("Anote el codigo del producto: ");
           A[j] = deliver.nextInt();
           System.out.print("Anote el valor de este producto: ");
           B[j] = deliver.nextDouble();
           System.out.print("Anote la cantidad vendida de este producto: ");
           C[j] = deliver.nextInt();
        }
        
        for (int i = 0; i < cantidadProducto; i++) {
            totalVendido = totalVendido + C[i];
            totalIngreso = totalIngreso + (B[i]*C[i]);
        }
        
        if (cantidadProducto < 0)
          System.out.println("No existe ningun producto");
            else
              mayorVendido = C[1]; POS = 1;
              for (int k = 0; k < cantidadProducto; k++) {
                 if (mayorVendido < C[k])
                     mayorVendido = C[k];
                     POS = k;
              }
              
        if (cantidadProducto < 0)
          System.out.println("Ingrese informacion de los productos al programa");
            else
              mayorCosto = B[1]; POSC = 1;
              for (int f = 0; f < cantidadProducto; f++) {
                 if (mayorCosto < B[f])
                     mayorCosto = B[f];
                     POSC = f;
              }

        System.out.println("El total de productos vendidos del dia es: " + totalVendido);
        System.out.println("El total de ingresos por ventas del dias es: " + totalIngreso);
        System.out.println("El producto mas vendido es: " + A[POS]);
        System.out.println("El producto mas costoso vendido es: " + A[POSC]);
        
    }  
} 


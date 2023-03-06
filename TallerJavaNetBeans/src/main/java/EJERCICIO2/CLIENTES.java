package EJERCICIO2;
 
import java.util.Scanner;

public class CLIENTES {
    
    public static void main(String[] args){
      char OP = 'S';   
      while (OP == 'S'){
        Scanner deliver = new Scanner(System.in);
        System.out.print("Anote el salario inicial del mes: ");
        int saldoInicial;
        saldoInicial = deliver.nextInt();
        System.out.print("Anote el total de abonos en el mes: ");
        int totalAbono;
        totalAbono = deliver.nextInt();
        System.out.print("Anote el total de deducciones aplicadas a su cuenta en el mes: ");
        int totalDeduccion;
        totalDeduccion = deliver.nextInt();
        System.out.print("Anote el límite de crédito permitido: ");
        int limiteCredito;
        limiteCredito = deliver.nextInt();
        
        int nuevoSaldo;
        nuevoSaldo = (saldoInicial + totalAbono - totalDeduccion);
        
        if (nuevoSaldo > limiteCredito){
            System.out.println("Su nuevo saldo es de: " + nuevoSaldo);
            System.out.println("Se excedio el limite de su credito");
            }
        else 
            System.out.println("Su nuevo saldo es de: " + nuevoSaldo);
            System.out.println("Este esta dentro del limite de credito");
      
        do{
           System.out.print("Desea ingresar las clientes? [S/N]: ");
           OP = deliver.next().charAt(0);
           OP = Character.toUpperCase(OP);
        }while ((OP != 'S') && (OP != 'N' ));
      }           
    }
}

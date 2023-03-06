
package vista;
import modelo.claseCoche;
import java.util.Scanner;

public class pruebaCoches {
    
    public static void main(String[] args) {
       
        claseCoche Coche1 = new claseCoche();
        Scanner deliver = new Scanner(System.in);
        System.out.print("Anote el color del coche: ");
        Coche1.setColor(deliver.nextLine());
        System.out.print("Anote la marca del coche: ");
        Coche1.setMarca(deliver.nextLine());
        System.out.print("Anote el modelo del coche: ");
        Coche1.setModelo(deliver.nextLine());
        System.out.print("Anote la matricula del coche: ");
        Coche1.setMatricula(deliver.nextLine());
        System.out.print("Anote los caballos de fuerza del coche: ");
        Coche1.setNumCaballos(deliver.nextInt());
        System.out.print("Anote el numero de puertas del coche: ");
        Coche1.setNumPuertas(deliver.nextInt());
        
        System.out.println(Coche1.toString());
    }
    
}

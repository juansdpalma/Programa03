
package programa03;
import java.util.Scanner;

public class Programa03 {


    public static void main(String[] args) {
        String nombre, apellido;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?  ");
        nombre = entrada.nextLine();
        System.out.println("¿Cual es tu apellido?  ");
        apellido = entrada.nextLine();
        System.out.println("Hola "+nombre+" "+apellido);
    }
    
}

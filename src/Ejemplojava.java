import java.util.Scanner;

public class Ejemplojava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Ingresa su nombre ¡¡¡");  
    String nombre = input .nextLine();
    System.out.println("Ingrese su edad ");
    int edad = input.nextInt();
    
    System.out.println("hola "+ nombre + "tienes " + edad + " años " );
    System.out.println("vaya a domrir");
    }
}

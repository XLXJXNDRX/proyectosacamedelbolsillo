import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la primera nota");
        int nota = input.nextInt();
        System.out.println("ingrese la segunda nota");
        int nota2 = input.nextInt();
        System.out.println("ingrese la tercera nota");
        int nota3 = input.nextInt();
        double promedio= (nota+nota2+nota3)/3;
        System.out.println("el promedio es de " + promedio);
        if ( promedio>=7); {
            System.out.println("usted ha sido promocionado");
            
        }
        input.close();
    }
    
}

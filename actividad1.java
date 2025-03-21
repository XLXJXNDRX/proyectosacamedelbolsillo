import java.util.Scanner;

public class actividad1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println(" Ingrese el primer numero ");
      int numero = input.nextInt();
      System.out.println(" Ingrese el segundo numero ");
      int numero2 = input.nextInt();
      if (numero > numero2) {
         int totalSuma = numero + numero2;
         int totalDiferencia = numero - numero2;
         System.out.println("el numero si es mayor y el resultado es de " + totalSuma);
         System.out.println("Y la diferencia de su resta es de " + totalDiferencia);
      } else {
         int totalMultiplicacion = numero * numero2;
         int totalDivision = numero / numero2;
         System.out.println("el segundo numero si es mayor y el resultado es de " + totalMultiplicacion);
         System.out.println("Y la diferencia de su resta es de " + totalDivision);
      }

      input.close();
   }

}

import java.util.Scanner;

public class horaejer {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Igrese el primer numero ");
    String entrada = input.nextLine();
    input.close();
   if (entrada.length() != 5 || entrada.charAt(2) !=':'){
      System.out.println("formato no valido ");
      return;
   }
   char h1 = entrada.charAt(0);
   char h2 = entrada.charAt(1);
   char m1 = entrada.charAt(3);
   char m2 = entrada.charAt(4);
   int horas= (h1-'0')*10 + (h2-'0');
   int minutos= (m1-'0')*10+(m2-'0');
   System.out.println("horas "+horas + " minutos "+ minutos );
    if (horas <0 || horas>23 || minutos<0 || minutos>59){
    System.out.println("formato no valido");  
    }; 
    if (minutos == 0) {
      System.out.println(" son las " + " en punto ");
    }
    int horas12 = (horas%12==0)?12:horas%12;
    System.out.println(" la horas es " + horas12 + "   "+ minutos );
    {
      
    } 
   }
 

}
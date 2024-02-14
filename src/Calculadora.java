import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int numeroUno;
    int numeroDos;
    
    try {
      System.out.print("Introduce el primer número: ");
      numeroUno = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el segurndo número: ");
      numeroDos = Integer.parseInt(sc.nextLine());
      
      System.out.print("¿Qué operación quieres realizar? (s --> suma, r --> resta, m --> multiplicación, d --> división): ");
      String operacion = sc.nextLine();
      
      if(operacion.equals("s")) {
        int suma = numeroUno + numeroDos;
        System.out.println("La suma es " + suma);
      }else if(operacion.equals("r")) {
        int resta = numeroUno - numeroDos;
        System.out.println("La resta es " + resta);
      }else if(operacion.equals("m")) {
        int multiplicacion = numeroUno * numeroDos;
        System.out.println("La multiplicacion es " + multiplicacion);
      }else if(operacion.equals("d")) {
        int division = numeroUno / numeroDos;
        System.out.println("La division es " + division);
      }else {
        System.out.println("Elije una opción correcta");
      }
      
      
    } catch (NumberFormatException e) {
      System.out.println("Error. Introduce un número");
    }
    
  }

}

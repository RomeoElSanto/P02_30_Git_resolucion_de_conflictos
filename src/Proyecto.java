import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = sc.nextInt();
        if ((num1 > 0) && (num2 > 0)) {
            System.out.println("Introduce la operación que quieres realizar: (+, -, , /)");
            String operacion = sc.next();
            switch (operacion) {
                case "+":
                    int suma = num1 + num2;
                    System.out.println(suma);
                    break;
                case "-":
                    int resta = num1 - num2;
                    System.out.println(resta);
                    break;
                case "":
                    int multiplicacion = num1 * num2;
                    System.out.println(multiplicacion);
                    break;
                case "/":
                    int division = num1 / num2;
                    System.out.println(division);
                    break;
                default:
                    System.out.println("Operación incorrecta");
                    break;
            }
        } else {
            System.out.println("Los números no son positivos");
        }
    }
}
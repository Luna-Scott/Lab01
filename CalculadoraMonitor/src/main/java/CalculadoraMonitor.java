import java.util.Scanner;

public class CalculadoraMonitor {
    
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        boolean continuar = true; 
        
         while (continuar) {
            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Seno");
            System.out.println("6. Coseno");
            System.out.println("7. Tangente");
            System.out.println("8. Raíz enésima");
            System.out.println("9. Potencia enésima");
            System.out.println("10. Calcular porcentaje de IVA");
            System.out.println("11. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                }
                case 2 -> {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                }
                case 3 -> {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                }
                case 4 -> {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                }
                case 5 -> {
                    System.out.print("Ingrese el ángulo en grados: ");
                    double angulo = Math.toRadians(scanner.nextDouble());
                    System.out.println("Resultado: " + Math.sin(angulo));
                }
                case 6 -> {
                    System.out.print("Ingrese el ángulo en grados: ");
                    double angulo = Math.toRadians(scanner.nextDouble());
                    System.out.println("Resultado: " + Math.cos(angulo));
                }
                case 7 -> {
                    System.out.print("Ingrese el ángulo en grados: ");
                    double angulo = Math.toRadians(scanner.nextDouble());
                    System.out.println("Resultado: " + Math.tan(angulo));
                }
                case 8 -> {
                    System.out.print("Ingrese el número base: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el índice de la raíz: ");
                    double indice = scanner.nextDouble();
                    if (indice != 0) {
                        System.out.println("Resultado: " + Math.pow(num1, 1 / indice));
                    } else {
                        System.out.println("El índice no puede ser cero.");
                    }
                }
                case 9 -> {
                    System.out.print("Ingrese la base: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.pow(num1, num2));
                }
                case 10 -> {
                    System.out.print("Ingrese el valor base: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el porcentaje de IVA: ");
                    double iva = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * (iva / 100)));
                }
                case 11 -> continuar = false;
                default -> System.out.println("Opción no válida.");
            }
            System.out.println();
        }
        scanner.close();
    }
}   
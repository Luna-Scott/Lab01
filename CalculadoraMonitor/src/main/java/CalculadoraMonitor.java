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

        }
    }
}
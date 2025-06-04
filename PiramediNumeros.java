import java.util.Scanner;

public class PiramediNumeros {

   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int n = entrada.nextInt();
        imprimirPiramide(n);
    }

    public static void imprimirPiramide(int n) {
        int limite = Math.min(n, 10); // Garante que o máximo será 10
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        
    }
}
   
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro entre 1 e 10: ");
        int n = entrada.nextInt();
        entrada.close(); // Fecha o Scanner

        // Verificação da entrada
        if (n < 1 || n > 10) {
            System.out.println("Número inválido! O valor deve estar entre 1 e 10.");
            System.exit(0); // Encerra o programa
        }

        imprimirSequencia(n);
    }

    public static void imprimirSequencia(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
    


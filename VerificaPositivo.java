import java.util.Scanner;

public class VerificaPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        entrada.close(); // Fecha o Scanner

        char resultado = verificarNumero(numero);
        System.out.println("Resultado: " + resultado);
    }

    // Função que verifica se o número é positivo ou não
    public static char verificarNumero(int n) {
        if (n > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}




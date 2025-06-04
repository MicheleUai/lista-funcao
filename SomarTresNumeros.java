import java.util.Scanner;

public class SomarTresNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = entrada.nextInt();

        entrada.close(); // Fecha o Scanner

        int resultado = somar(a, b, c);
        System.out.println("A soma dos três números é: " + resultado);
    }

    // Função que recebe 3 argumentos e retorna a soma
    public static int somar(int x, int y, int z) {
        return x + y + z;
    }
}
    


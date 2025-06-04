import java.util.Scanner;

public class CalduradoraImposto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do custo do produto: ");
        double custo = entrada.nextDouble();

        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = entrada.nextDouble();

        entrada.close(); // Fecha o Scanner

        double custoFinal = somaImposto(taxaImposto, custo);
        System.out.println("Custo final com imposto: R$ " + custoFinal);
    }

    // Função que calcula o custo com imposto
    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100);
        return custo + imposto;
    }
}
    


import java.util.Scanner;

public class ConversorHora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Digite a hora (0 a 24): ");
            int hora24 = entrada.nextInt();
            System.out.print("Digite os minutos (0 a 60): ");
            int minuto = entrada.nextInt();

            int hora12 = converterHora(hora24);
            char amPm = (hora24 < 12) ? 'A' : 'P';

            exibirHora(hora12, minuto, amPm);

            System.out.print("Deseja converter outra hora? (S/N): ");
            repetir = entrada.next().toUpperCase().charAt(0);

        } while (repetir == 'S');

        entrada.close();
    }

    // Função para converter hora de 24h para 12h
    public static int converterHora(int hora24) {
        if (hora24 == 0 || hora24 == 12)
            return 12;
        else
            return hora24 % 12;
    }

    // Função para exibir a hora convertida com A.M. ou P.M.
    public static void exibirHora(int hora, int minuto, char amPm) {
        String periodo = (amPm == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %d:%02d %s\n", hora, minuto, periodo);
    }
}
    


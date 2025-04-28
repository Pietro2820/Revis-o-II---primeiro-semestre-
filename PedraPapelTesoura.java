import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.println("Escolha uma opção: 0 - Pedra, 1 - Papel, 2 - Tesoura");
            int jogador = entrada.nextInt();

            if (jogador < 0 || jogador > 2) {
                System.out.println("Opção inválida. Escolha 0, 1 ou 2.");
            } else {
                int computador = random.nextInt(3);

                System.out.println("Você escolheu: " + escolha(jogador));
                System.out.println("Computador escolheu: " + escolha(computador));

                if (jogador == computador) {
                    System.out.println("Empate!");
                } else if ((jogador == 0 && computador == 2) ||
                        (jogador == 1 && computador == 0) ||
                        (jogador == 2 && computador == 1)) {
                    System.out.println("Você venceu!");
                } else {
                    System.out.println("Você perdeu!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite 0, 1 ou 2.");
        } finally {
            entrada.close();
        }
    }

    public static String escolha(int opcao) {
        if (opcao == 0) return "Pedra";
        if (opcao == 1) return "Papel";
        return "Tesoura";
    }
}

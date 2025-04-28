import java.util.Scanner;
import java.util.InputMismatchException;

public class CalcularDesconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite o valor original do produto: ");
            double valorOriginal = entrada.nextDouble();

            System.out.print("Digite a porcentagem de desconto: ");
            double desconto = entrada.nextDouble();

            double valorFinal = valorOriginal - (valorOriginal * desconto / 100);
            System.out.println("O valor com desconto é: R$ " + valorFinal);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite apenas números.");
        } finally {
            entrada.close();
        }
    }
}

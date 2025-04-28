import java.util.Scanner;
import java.util.InputMismatchException;

public class MaiorDeTresNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = entrada.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = entrada.nextInt();

            System.out.print("Digite o terceiro número: ");
            int num3 = entrada.nextInt();

            int maior = num1;

            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }

            System.out.println("O maior número é: " + maior);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite apenas números inteiros.");
        } finally {
            entrada.close();
        }
    }
}

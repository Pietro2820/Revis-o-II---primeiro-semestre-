import java.util.Scanner;
import java.util.InputMismatchException;

public class VerificarParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
        } finally {
            entrada.close();
        }
    }
}

import java.util.Scanner;
import java.util.InputMismatchException;

public class VerificarMaioridade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = entrada.nextInt();

            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
        } finally {
            entrada.close();
        }
    }
}

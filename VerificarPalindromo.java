import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite uma palavra ou frase: ");
            String texto = entrada.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();

            String invertido = new StringBuilder(texto).reverse().toString();

            if (texto.equals(invertido)) {
                System.out.println("É um palíndromo.");
            } else {
                System.out.println("Não é um palíndromo.");
            }
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            entrada.close();
        }
    }
}

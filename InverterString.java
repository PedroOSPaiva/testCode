import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        scanner.close();

        String invertida = "";
        for (int i = entrada.length() - 1; i >= 0; i--) {
            invertida += entrada.charAt(i);
        }

        System.out.println("String invertida: " + invertida);
    }
}


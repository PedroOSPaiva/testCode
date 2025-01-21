import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }

    private static boolean isFibonacci(int num) {
        int a = 0, b = 1, soma = 0;
        while (soma < num) {
            soma = a + b;
            a = b;
            b = soma;
        }
        return soma == num || num == 0;
    }
}


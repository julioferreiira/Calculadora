import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        Calculadora calculadora = new Calculadora();

        double resultado = 0;

        try {
            switch (operacao) {
                case '+':
                    resultado = calculadora.somar(numero1, numero2);
                    break;
                case '-':
                    resultado = calculadora.subtrair(numero1, numero2);
                    break;
                case '*':
                    resultado = calculadora.multiplicar(numero1, numero2);
                    break;
                case '/':
                    resultado = calculadora.dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Operação inválida");
                    return;
            }

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Operação concluída!");
        }
    }
}

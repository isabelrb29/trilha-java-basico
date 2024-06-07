import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha a operação desejada:");
            System.out.println("1. Depositar " + "\n2. Sacar " + "\n3. Consultar Saldo " + "\n4. Encerrar ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Qual o valor que deseja depositar? ");
                    double deposito = scanner.nextDouble();

                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f", saldo);
                    break;

                case 2:
                    System.out.print("Qual o valor que deseja sacar? ");
                    double saque = scanner.nextDouble();
                    if (saque < saldo) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f", saldo);
                    }
                    else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: %.1f", saldo);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
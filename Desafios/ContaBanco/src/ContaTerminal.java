import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número do conta: ");
        int numConta = sc.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = sc.next();

        System.out.print("Digite o saldo da sua conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = sc.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. " +
                "Sua agência é %s, conta %d e seu saldo %.2f já está disponível " +
                "para saque.", nomeCliente, agencia, numConta, saldo);

    }
}
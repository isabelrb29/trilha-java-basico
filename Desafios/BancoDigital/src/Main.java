//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente jose = new Cliente();
        jose.setNome("Jose Carlos");

        Conta cc = new ContaCorrente(jose);
        Conta poupanca = new ContaPoupanca(jose);

        cc.depositar(100);
        poupanca.depositar(100);
        cc.sacar(30);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Digital");

        Conta cc = new ContaCorrente(123, "0001", "Lucas");
        Conta cp = new ContaPoupanca(456, "0001", "Maria");

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(1000);
        cc.sacar(200);
        cc.transferir(300, cp);

        cc.imprimirExtrato();
        System.out.println();
        cp.imprimirExtrato();
    }
}
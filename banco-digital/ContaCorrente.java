public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String agencia, String titular) {
        super(numero, agencia, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}
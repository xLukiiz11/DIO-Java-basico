public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String agencia, String titular) {
        super(numero, agencia, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}
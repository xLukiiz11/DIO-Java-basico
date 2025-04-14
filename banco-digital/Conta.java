public abstract class Conta {
    protected int numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    public Conta(int numero, String agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    public void imprimirExtrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
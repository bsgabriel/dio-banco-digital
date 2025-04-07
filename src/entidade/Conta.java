package entidade;

public abstract class Conta {
    private static int SEQUENCIAL = 1;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public abstract void transferir(double valor, Conta destino);

    public void imprimirExtrato() {
        System.out.println(getTipoConta() + " - Cliente: " + cliente.nome());
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------------");
    }

    protected abstract String getTipoConta();
}
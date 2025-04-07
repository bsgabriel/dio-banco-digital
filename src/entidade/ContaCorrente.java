package entidade;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (saldo >= valor && destino != null) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    @Override
    protected String getTipoConta() {
        return "Conta Corrente";
    }
}
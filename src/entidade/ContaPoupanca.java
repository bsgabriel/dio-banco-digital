package entidade;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        System.out.println("Transferência não permitida em Conta Poupança.");
    }

    @Override
    protected String getTipoConta() {
        return "Conta Poupança";
    }
}
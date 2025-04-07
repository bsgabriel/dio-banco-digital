import entidade.Cliente;
import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        var cliente1 = new Cliente("Alice");
        var cliente2 = new Cliente("Bob");

        var conta1 = new ContaCorrente(cliente1);
        var conta2 = new ContaPoupanca(cliente1);
        var conta3 = new ContaCorrente(cliente2);

        conta1.depositar(1000);
        conta2.depositar(500);
        conta3.depositar(300);

        // Transferência válida (corrente -> outra conta)
        conta1.transferir(200, conta3);

        // Transferência inválida (poupança -> outra conta)
        conta2.transferir(100, conta3); // Não faz nada, pois só conta corrente pode transferir

        // Imprimindo saldos finais
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        conta3.imprimirExtrato();
    }
}

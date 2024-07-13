import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco(); 

        List<Conta> contas = new ArrayList<>();

        Cliente fulano = new Cliente();
        fulano.setNome("Fulano");
        Cliente ciclano = new Cliente();
        ciclano.setNome("Ciclano");

        Conta ccFulano = new ContaCorrente(fulano);
        Conta poupancaFulano = new ContaPoupanca(fulano);
        Conta ccCiclano = new ContaCorrente(ciclano);
        Conta poupancaCiclano = new ContaPoupanca(ciclano);

        contas.add(ccFulano);
        contas.add(poupancaFulano);
        contas.add(ccCiclano);
        contas.add(poupancaCiclano);

        banco.setContas(contas); 

        ccFulano.depositar(500);
        ccFulano.transferir(400, poupancaFulano);

        ccFulano.Extrato();
        poupancaFulano.Extrato();

        
        List<Cliente> clientes = banco.listarClientes();
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNome());
        }
    }
}
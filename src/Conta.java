public class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    private static final int AgenciaPadrao = 1;
    private static final int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AgenciaPadrao;
        this.numero = Conta.SEQUENCIAL + 1;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    
    public void imprimirInfos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %2f", this.saldo));
    }

    public void Extrato() {
        imprimirInfos();
    }
}
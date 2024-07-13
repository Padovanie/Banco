public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    public void Extrato(){
        System.out.println("Extrato da Conta Corrente ");
        super.imprimirInfos();
    }

}

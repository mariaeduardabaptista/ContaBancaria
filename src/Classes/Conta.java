public class Conta {

    private TipoOperacao operacao;
    private double valorOperacao;
    private double saldo;
    private Cliente cliente;





    //#region
    public TipoOperacao getOperacao() {
        return operacao;
    }
   
    

    public Cliente getCliente() {
        return cliente;
    }



    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public double getValorOperacao() {
        return valorOperacao;
    }
    
    


    public double getSaldo() {
        return saldo;
    }
    
    //#endregion

    public void realizaOperacao(TipoOperacao operacao, double valor) {
        this.operacao = operacao;
        this.valorOperacao = valor;

        if (operacao == TipoOperacao.SAQUE) {
                this.saldo = this.saldo - valor;
                System.out.println("Saque realizado com sucesso");
            }
                System.out.println("Não há saldo suficiente para realizar o saque");

        
          if (operacao == TipoOperacao.DEPOSITO) {
              this.saldo = this.saldo + valor;
              System.out.println("Deposisto realizado com sucesso.");

          }

    System.out.println("O saldo atual é: R$" + this.saldo);
 }
 public Conta(Cliente cliente){
     this.setCliente(cliente);
     cliente.setConta(this);
     
 }
}
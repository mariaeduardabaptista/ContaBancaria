package Classes;

public class Conta {

    private TipoOperacao operacao;
    private double valorOperacao;
    private double saldo;
    private double limitCretido;



    //#region
    public TipoOperacao getOperacao() {
        return operacao;
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
            if (valor <=(saldo + limiteCredito))  {
                this.saldo = this.saldo - valor;
                System.out.println("Saque realizado com sucesso");
                if (saldo <0){

                }
            }else
                System.out.println("Não há saldo suficiente para realizar o saque");

        } else
          if (operacao == TipoOperacao.DEPOSITO) {
              if (valor)
              this.saldo = this.saldo + valor;
              System.out.println("Deposisto realizado com sucesso.");

          }

    System.out.println("O saldo atual é: R$" + this.saldo);
 }
}
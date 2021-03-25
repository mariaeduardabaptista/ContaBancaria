public class ClientePremium extends Cliente {
    
    public ClientePremium(String nome, Conta conta) {
        super(nome, conta);
    }

    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
        this.conta.setLimiteCretido(limiteCredito);
        }
}

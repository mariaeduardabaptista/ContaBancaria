
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        int opcao = -1;


        while (opcao != 0) {
        exibeMenu();
        opcao = ler.nextInt();

            switch(opcao){
            
                case 0:
                  System.out.println("Encerrando a aplicaçao");
                  return;
                default:
                  System.out.println("Operaçao invalida.Verifique");
                case 1:
                  exibeSaque(ler, conta);
                  break;
                case 2:
                  exibeDeposito(ler, conta);
                  break;
                case 3:
                  extracted(conta);
                  break;

            }

        }
        ler.close();
        
    }

    private static void extracted(Conta conta) {
        conta.realizaOperacao(TipoOperacao.SALDO,0);
    }

    private static void exibeDeposito(Scanner ler, Conta conta) {
        double valor;
        System.out.println("Digite o valor do deposito:");
          valor = ler.nextDouble();
          conta.realizaOperacao(TipoOperacao.DEPOSITO, valor);
    }

    private static void exibeSaque(Scanner ler, Conta conta) {
        double valor;
        System.out.println("Digite o valor a sacar:");
          valor = ler.nextDouble();
          conta.realizaOperacao(TipoOperacao.SAQUE, valor);
    }

    private static void exibeMenu() {
        System.out.println("\n*****************");
        System.out.println("1- Saque");
        System.out.println("2 - Deposito");
        System.out.println("3 - Saldo");
        System.out.println("0 - Sair");
        System.out.println("Digite a opçao desejada");
    }

}



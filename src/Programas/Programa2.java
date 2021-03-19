package Programas;

import java.util.Scanner;

import Classes.Cliente;
import Classes.Conta;

public class Programa2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente("maria", conta);
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
                  exibeSaque(ler, cliente);
                  break;
                case 2:
                  exibeDeposito(ler, cliente);
                  break;
                case 3:
                  exibeSaldo(cliente);
                  break;

            }

        }
        ler.close();
        
    }
   //#region
    private static void exibeSaldo(Cliente cliente) {
       cliente.exibirSaldo();
    }

    private static void exibeDeposito(Scanner ler, Cliente cliente) {
        double valor;
        System.out.println("Digite o valor do deposito:");
          valor = ler.nextDouble();
          cliente.depositar(valor);
    }

    private static void exibeSaque(Scanner ler, Cliente cliente) {
        double valor;
        System.out.println("Digite o valor a sacar:");
          valor = ler.nextDouble();
         cliente.sacar(valor);
    }

    private static void exibeMenu() {
        System.out.println("\n*****************");
        System.out.println("1- Saque");
        System.out.println("2 - Deposito");
        System.out.println("3 - Saldo");
        System.out.println("0 - Sair");
        System.out.println("Digite a opçao desejada");
    }
  //#endregion
}

package com.matheus.gerenciabanco;

/**
 *
 * @author Matheus
 * 
 */

import java.util.Scanner;


public class GerenciaBanco {
    
    private static String nome = "Matheus";
    private static String sobrenome = "Leidow";
    private static String cpf = "111.111.111-11";
    private static Integer Option = -1;
    private static Double saldoEmConta = 100.00;
    private static Double saldo = 0.0;
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Muito bem vindo ao Sistema bancário! O que deseja?");
        while(Option != 0){
            if(Option == 5){
                break;
            }
            System.out.println("Opções: \n 1 - Exibir informações do usuário.\n 2 - Exibir saldo em conta.\n 3 - Depositar um valor\n 4 - Retirar um valor.\n 5 - Sair");
            Option = scanner.nextInt();
            if (null != Option)switch (Option) {
                case 1:
                    System.out.println("Aqui estão as informações!\n Nome: "+ nome +".\n Sobrenome: "+sobrenome+".\n CPF: "+cpf);
                    break;
                case 2:
                    System.out.println("O saldo em conta é R$"+saldoEmConta);
                    break;
                case 3:
                    System.out.println("Quanto que você gostaria que fosse depositado?");
                    saldo = scanner.nextDouble();
                    saldoEmConta = saldoEmConta+saldo;
                    break;
                case 4:
                    System.out.println("Quanto que você gostaria que fosse retirar?");
                    saldo = scanner.nextDouble();
                    saldoEmConta = saldoEmConta-saldo;
                    break;
                case 5:
                    System.out.println("Sistema sendo fechado, muito obrigado por utilizá-lo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }   
}

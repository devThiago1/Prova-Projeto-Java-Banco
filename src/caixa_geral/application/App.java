package caixa_geral.application;
import java.util.Scanner;

import caixa_geral.notas.account_operations;
import caixa_geral.notas.atm_operations;


public class App {
    public static int password_admin[] = new int[1]; 
    public static int password_filho[] = new int[6];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

        atm_operations caixa_operacao = new atm_operations();
        account_operations conta_operacao = new account_operations();
        // Inicialização de senhas para identificação dos filhos e do ADM
        int p_admin = 1010;
        int p_user = 1111;
            for(int i=0; i <= 4; i++){
                password_filho[i] = p_user; 
                p_user = p_user + 1111;
            }
        password_admin[0] = p_admin;


        do{
            System.out.println("            CAIXA ELETRÔNICO");
            System.out.println("Para utilização da conta, você precisa escolher o tipo de conta*");
            System.out.println("DESEJA ACESSAR COMO:");
            System.out.println("    1 -- TITULAR");
            System.out.println("    2 -- DEPENDENTE");
            System.out.println("    0 -- ENCERRAR");
                option = sc.nextInt();
        
            if(option == 1){
                int senha_digitada;
                int libera_acesso_admin = 1;  
                int opcao_movimentacao_admin;
      
                    while(libera_acesso_admin != 0){
                        System.out.println("DIGITE SUA SENHA:");
                            senha_digitada = sc.nextInt();
        
                        if(senha_digitada != password_admin[0]){
                            System.out.println("Senha incorreta");
                            System.out.printf("NOVAMENTE ");
                            libera_acesso_admin = 0;
                        }else{
                            libera_acesso_admin = 1;
                            System.out.println("Acesso liberado, bem vindo cliente " + password_admin[0]);
                            System.out.println("GERENCIAMENTO");
                            System.out.println("1 -- CONTA BLOQUEADAS");
                            System.out.println("2 -- REPOR NOTAS");
                            System.out.println("0 -- ENCERRAR");
                                opcao_movimentacao_admin = sc.nextInt();

                            if(opcao_movimentacao_admin == 1){
                               // System.out.println(getContas_bloqueadas());
                            }
                            if(opcao_movimentacao_admin == 2){
                               libera_acesso_admin = caixa_operacao.repor_notas(caixa_operacao.getNotas_dois(), caixa_operacao.getNotas_dez(), caixa_operacao.getNotas_vinte(), caixa_operacao.getNotas_cinquenta(), caixa_operacao.getSaldo_atual());
                            }   
                            if(opcao_movimentacao_admin == 0){
                                libera_acesso_admin = 0;
                            }
                        }
                    }
            }if(option == 2){
                int k =0;
                int libera_acesso_user = 0;
                int senha_digitada;
                int contador = 0;
                int opcao_encerrar = 1;
                int opcao_movimentacao;
                    while(k!=5){
                        System.out.println(password_filho[k]);
                        k++;
                    }
                    while(libera_acesso_user != 1 && contador != 3){
                        System.out.println("DIGITE SUA SENHA:");
                            senha_digitada = sc.nextInt();
                        k = 0;
                        while(senha_digitada != password_filho[k] && k != 5){
                            k++;
                        }
                        if(senha_digitada != password_filho[k]){
                            System.out.println("Senha incorreta");
                            System.out.printf("NOVAMENTE ");
                            contador++;
                        }
                        if(senha_digitada == password_filho[k]){
                            libera_acesso_user = 1;
                            System.out.println("Acesso liberado, bem vindo cliente \n" + password_filho[k]);
                            while(opcao_encerrar != 0){
                                System.out.println("1 -- SAQUE");
                                System.out.println("2 -- SALDO");
                                System.out.println("3 -- DEPOSITO");
                                System.out.println("0 -- ENCERRAR");
                                    opcao_movimentacao = sc.nextInt();
                                if(opcao_movimentacao == 1){
                                    caixa_operacao.saque();
                                }
                                if(opcao_movimentacao == 2){
                                    System.out.println(conta_operacao.getSaldo_user());
                                }
                                if(opcao_movimentacao == 3){
                                    conta_operacao.deposito(password_filho[k]);
                                }
                                if(opcao_movimentacao == 4){
                                    caixa_operacao.repor_notas(caixa_operacao.getNotas_dois(), caixa_operacao.getNotas_dez(), caixa_operacao.getNotas_vinte(), caixa_operacao.getNotas_cinquenta(), caixa_operacao.getSaldo_atual());
                                }
                                if(opcao_movimentacao == 0){
                                    opcao_encerrar = 0;
                                    libera_acesso_user = 1;
                                }
                            }
                        }
                    }
                }else if(option == 0){
                sc.close();
            }else{
            System.out.println("Opção incorreta");
            }
        }while(option != 0);
    }

}

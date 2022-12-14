package caixa_geral.application;
import caixa_geral.options.Permissions;
import java.util.ArrayList;
import java.util.Scanner;

import caixa_geral.options.Account_operations;
import caixa_geral.options.Atm_operations;



public class App {
    public static int password_admin[] = new int[1]; 
    public static int password_filho[] = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bloqueado = 0;
        int option;
        int contador = 0;   

        Atm_operations caixa_operacao = new Atm_operations();
        Account_operations conta_operacao = new Account_operations();
        Permissions permissao = new Permissions();
        // Inicialização de senhas para identificação dos filhos e do ADM
        int p_admin = 1010;
        int p_user = 1111;
            for(int i=0; i <= 4; i++){
                password_filho[i] = p_user; 
                p_user = p_user + 1111;
            }
        password_admin[0] = p_admin;

        //INICIO DA OPERAÇÃO
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
                int opcao_movimentacao_admin = 1;
      
                    while(libera_acesso_admin != 0){
                        System.out.println(password_admin[0]);
                        System.out.println("DIGITE SUA SENHA:");
                            senha_digitada = sc.nextInt();
        
                        if(senha_digitada != password_admin[0]){
                            System.out.println("Senha incorreta");
                            System.out.printf("NOVAMENTE ");
                            libera_acesso_admin = 0;
                        }else{
                            System.out.println("Acesso liberado, bem vindo cliente " + password_admin[0]);
                            while(opcao_movimentacao_admin != 0){
                                libera_acesso_admin = 1;
                                System.out.println("GERENCIAMENTO");
                                System.out.println("1 -- CONTA BLOQUEADAS");
                                System.out.println("2 -- REPOR NOTAS");
                                System.out.println("0 -- ENCERRAR");
                                    opcao_movimentacao_admin = sc.nextInt();
                                if(opcao_movimentacao_admin == 1){
                                    bloqueado = permissao.blockages();
                                    if(bloqueado == 0){
                                        contador = 0;
                                    }
                                }
                                if(opcao_movimentacao_admin == 2){
                                    libera_acesso_admin = caixa_operacao.repor_notas(caixa_operacao.getNotas_dois(), caixa_operacao.getNotas_dez(), caixa_operacao.getNotas_vinte(), caixa_operacao.getNotas_cinquenta(), caixa_operacao.getSaldo_atual());
                                }   
                                if(opcao_movimentacao_admin == 0){
                                    libera_acesso_admin = 0;
                                }
                            }
                        }
                    }
            }if(option == 2){
                int k =0;
                int libera_acesso_user = 0;
                int senha_digitada;
                int opcao_encerrar = 1;
                int opcao_movimentacao;
                    while(libera_acesso_user != 1 && contador != 3 && bloqueado != 1){
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
                                    System.out.println("SALDO ATUAL DO CLIENTE" + password_filho[k]);
                                    System.out.println("R$" + conta_operacao.getSaldo_user(password_filho[k]));
                                }
                                if(opcao_movimentacao == 3){
                                    conta_operacao.deposito(password_filho[k]);
                                }
                                if(opcao_movimentacao == 0){
                                    opcao_encerrar = 0;
                                    libera_acesso_user = 1;
                                }
                            }
                        }
                    }
                    if(contador == 3){
                        System.out.println("ACESSO DE CONTAS DOS DEPENDENTE BLOQUEADO. Contate-o o titular para que libere o acesso*");
                        bloqueado = 1;
                    }
                }else if(option == 0){
                sc.close();
            }else{
            System.out.println("Opção incorreta");
            }
        }while(option != 0);
    }

}

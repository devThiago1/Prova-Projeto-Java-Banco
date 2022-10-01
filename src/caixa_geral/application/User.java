/*package caixa_geral.application;
import java.util.Scanner;

import caixa_geral.notas.account_operations;

import caixa_geral.notas.atm_operations;

 
public class User {
    public int password_filho[] = new int[6];
    public int k =0;
    public int libera_acesso_user;
    public int opcao_encerrar = 1;
    public int opcao_movimentacao;
    public int saque;

    Admin adm = new Admin();
    atm_operations saque_user = new atm_operations();
    App app = new App();
    account_operations deposito = new account_operations();


    public int menu_user(){
        Scanner sc = new Scanner(System.in);        
        libera_acesso_user = 0;
        k = 0;


        while(k!=5){
            System.out.println(password_filho[k]);
            k++;
        }
        
        libera_acesso_user = login_filho();
        if(libera_acesso_user == 1){
                while(opcao_encerrar != 0){
                System.out.println("1 -- SAQUE");
                System.out.println("2 -- SALDO");
                System.out.println("3 -- DEPOSITO");
                System.out.println("0 -- ENCERRAR");
                    opcao_movimentacao = sc.nextInt();
                if(opcao_movimentacao == 1){
                    saque_user.main();
                }
                if(opcao_movimentacao == 2){
                    System.out.println(deposito.getSaldo_user());
                }
                if(opcao_movimentacao == 3){
                    deposito.main(password_filho[k]);
                }
                if(opcao_movimentacao == 4){
                    saque_user.repor_notas(saque_user.getNotas_dois(), saque_user.getNotas_dez(), saque_user.getNotas_vinte(), saque_user.getNotas_cinquenta());
                }
                if(opcao_movimentacao == 0){
                    opcao_encerrar = 0;
                }
            }
        }
        if(libera_acesso_user == 0){
            adm.setContas_bloqueadas(password_filho);
        }
    
        opcao_encerrar = 1;
    return opcao_encerrar;
    }

 
 
 
 
    public int login_filho(){
        Scanner sc = new Scanner(System.in);
        int senha_digitada;
        int contador = 0;
        libera_acesso_user = 0;
        k = 0;
        //  int opcao_encerrar_login = 0;
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
                System.out.println("Acesso liberado, bem vindo cliente \n" + password_filho[k]);
                libera_acesso_user = 1;
            }
        }
        if(contador == 3){
            System.out.println("SUA CONTA FOI BLOQUEADA. Contate o ADM do caixa eletrônico ou seu banco");
            libera_acesso_user = 0;
        }
    return libera_acesso_user;
    }
}
*/
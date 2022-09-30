package telas;
import java.util.Scanner;

import caixa_geral.application.App;
import caixa_geral.notas.Contagem;
import caixa_geral.notas.Deposito;
import caixa_geral.notas.Saldo;
import caixa_geral.notas.Saque;

 
public class User {
    public int password_filho[] = new int[6];
    public int k =0;
    public int libera_acesso_user;
    public int opcao_encerrar;
    public int opcao_movimentacao;
    public int saque;
 
    Saque saque_user = new Saque();
    Contagem contagem = new Contagem();
    Saldo saldo = new Saldo();
    App app = new App();
    Deposito deposito = new Deposito();


    public int main(){
        Scanner sc = new Scanner(System.in);        //conferindo se as senhas foram inicializadas
        libera_acesso_user = 0;
        k = 0;


        while(k!=5){
            System.out.println(password_filho[k]);
            k++;
        }
        
        libera_acesso_user = login_filho();
        
        if(libera_acesso_user == 1){
            System.out.println("1 -- SAQUE");
            System.out.println("2 -- SALDO");
            System.out.println("3 -- DEPOSITO");
                opcao_movimentacao = sc.nextInt();
            if(opcao_movimentacao == 1){
               saque_user.main();
            }
            if(opcao_movimentacao == 2){
                System.out.println(saque_user.getSaldo_atual());
            }
            if(opcao_movimentacao == 3){
                contagem.main();
            }
        }
        if(libera_acesso_user == 0){
            //
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

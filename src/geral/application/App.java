package geral.application;
import java.util.Scanner;

import geral.telas.Admin;
import geral.telas.User;


public class App {
        public static int var_aux_dois;
        public static int var_aux_dez;
        public static int var_aux_vinte;
        public static int var_aux_cinquenta;

        /* 
        private int notas_dois = 40;
        private int notas_dez = 200;
        private int notas_vinte = 400;
        private int notas_cinquenta = 1000;
        
            public int getNotas_dois() {
                return notas_dois;
            }
            public void setNotas_dois(int notas_dois) {
                this.notas_dois -= notas_dois;
            }
            public int getNotas_dez() {
                return notas_dez;
            }
            public void setNotas_dez(int notas_dez) {
                this.notas_dez -= notas_dez;
            }
            public int getNotas_vinte() {
                return notas_vinte;
            }
            public void setNotas_vinte(int notas_vinte) {
                this.notas_vinte -= notas_vinte;
            }
            public int getNotas_cinquenta() {
                return notas_cinquenta;
            }
            public void setNotas_cinquenta(int notas_cinquenta) {
                this.notas_cinquenta -= notas_cinquenta;
            }

        
            public int saldo_caixa(App nota){
                    int saldo_total_caixa=0;
                
                    saldo_total_caixa += nota.getNotas_dois();
                    saldo_total_caixa += nota.getNotas_dez();
                    saldo_total_caixa += nota.getNotas_vinte();
                    saldo_total_caixa += nota.getNotas_cinquenta();
            
                    return saldo_total_caixa;
                    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao_admin; 
        int opcao_user;
        int opcao; 
        int option;

        User filhos = new User();
        Admin titular = new Admin();
        // Inicialização de senhas para identificação dos filhos e do ADM
        int p_admin = 1010;
        int p_user = 1111;
            for(int i=0; i <= 4; i++){
                filhos.password_filho[i] = p_user; 
                p_user = p_user + 1111;
            }
            titular.password_admin[0] = p_admin;

            


        opcao = 1;
        do{
            System.out.println("            CAIXA ELETRÔNICO");
            System.out.println("Para utilização da conta, você precisa escolher o tipo de conta*");
            System.out.println("DESEJA ACESSAR COMO:");
            System.out.println("    1 -- TITULAR");
            System.out.println("    2 -- DEPENDENTE");
            System.out.println("    0 -- ENCERRAR");
                option = sc.nextInt();
        
            if(option == 1){
                opcao_admin = titular.main();
                    if(opcao_admin != 1){
                        opcao = 0;
                        }
            }else if(option == 2){
                opcao_user = filhos.main();
                    if(opcao_user != 1){
                        opcao = 0;
                    }    
            }else if(option == 0){
                sc.close();
                opcao = 0;
            }else{
            System.out.println("Opção incorreta");
            }
        opcao = 1;
        }while(opcao != 0);
    }

}

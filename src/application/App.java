package application;
import java.util.Scanner;
import telas.Admin;
import telas.User;


public class App {
 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao_admin; 
        int opcao_user;
        int opcao; 
        int option;
        
        Admin titular = new Admin();
        User filhos = new User();
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
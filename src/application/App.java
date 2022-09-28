package application;
import java.util.Scanner;

import notas.Contagem;
import telas.Admin;
import telas.User;



public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao_admin; 
        int opcao_user;
        int opcao; 
        int option;



        User filhos = new User();
        Admin titular = new Admin();
        Contagem contagem = new Contagem();

        // Inicialização de senhas para identificação dos filhos e do ADM
        int p_admin = 1010;
        int p_user = 1111;
            for(int i=0; i <= 4; i++){
                filhos.password_filho[i] = p_user; 
                p_user = p_user + 1111;
            }
            titular.password_admin[0] = p_admin;

            
<<<<<<< HEAD
          /*   //inicializador de notas
            int nota_dois = 2;
=======
            //inicializador de notas
          /*   int nota_dois = 2;
>>>>>>> d6421b97cc7424e05814ab2ea84fb646eea6ac94
            int nota_dez = 10;
            int nota_vinte = 20;
            int nota_cinquenta = 50;
            for(int k=0;k<=4; k++){
                for(int n=0; n<=20;n++){
                    if(k == 0){
                        contagem.notas[k][n] = nota_dois;
                    }
                    if(k == 1){
                        contagem.notas[k][n] = nota_dez;
                    }
                    if(k == 2){
                        contagem.notas[k][n] = nota_vinte;
                    }
                    if(k == 3){
                        contagem.notas[k][n] = nota_cinquenta;
                    }
                }
            }
<<<<<<< HEAD
*/
=======
            */
>>>>>>> d6421b97cc7424e05814ab2ea84fb646eea6ac94

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

package application;
import java.util.Scanner;
import telas.Admin;
import telas.User;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1; 

        User filhos = new User();
        Admin titular = new Admin();

        // Inicialização de senhas para identificação dos filhos
        int p = 1111;
            for(int i=0; i <= 4; i++){
                filhos.password_filho[i] = p; 
                p = p + 1111;
            }

         
        while(opcao != 0){
            System.out.println("            CAIXA ELETRÔNICO");
            System.out.println("Para utilização da conta, você precisa escolher o tipo de conta*");
            System.out.println("DESEJA ACESSAR COMO:");
            System.out.println("    1 -- TITULAR");
            System.out.println("    2 -- DEPENDENTE");
                opcao = sc.nextInt();
        
            if(opcao == 1){
               opcao = titular.main();
            }
            else if(opcao == 2){
                opcao = filhos.main();
                    if(opcao == 1){
                        sc.close();
                        opcao = 1;
                    }    
            }else{
            System.out.println("Opção incorreta");
            }
        }
        sc.close();
    }
}

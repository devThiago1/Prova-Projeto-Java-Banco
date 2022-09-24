package application;
import java.util.Scanner;
import person.Admin;
import person.User;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao; 
                
        do{
        System.out.println("            CAIXA ELETRÔNICO");
        System.out.println("Para utilização da conta, você precisa escolher o tipo de conta*");
        System.out.println("DESEJA ACESSAR COMO:");
        System.out.println("    1 -- TITULAR");
        System.out.println("    2 -- DEPENDENTE");
                opcao = sc.nextInt();
        
        Admin titular = new Admin();
        if(opcao == 1){
            titular.main();
        }
        User filhos = new User();
        if(opcao == 2){
            filhos.main();
        }

    }while(opcao != 0);
        
        sc.close();
    }
}

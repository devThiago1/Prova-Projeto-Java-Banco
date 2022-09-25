package telas;
import java.util.Scanner;

public class User {
    public int password_filho[] = new int[5];


    public void main(){
        Scanner sc = new Scanner(System.in);
      
        //conferindo se as senhas foram inicializadas
            int k =0;
            while(k!=4){
                System.out.println(password_filho[k]);
                k++;
            }


        //Inicio
        int senha_digitada;
        int opcao_encerrar = 0;
        
        do{
            System.out.println("DIGITE SUA SENHA:");
                senha_digitada = sc.nextInt();
        k = 0;
        while(senha_digitada != password_filho[k]){
            k++;
        }
        if(senha_digitada != password_filho[k]){
            System.out.println("Senha incorreta");
            opcao_encerrar = 1;
        }
        if(senha_digitada == password_filho[k]){
            System.out.println("Seja bem vindo, cliente " + password_filho[k]);
        }
        sc.close();
        }while(opcao_encerrar != 1);
    } 
}


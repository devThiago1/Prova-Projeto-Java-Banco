package telas;
import java.util.Scanner;

public class User {
    public int password_filho[] = new int[6];
    public int k =0;
    public int libera_acesso;
    public int opcao_encerrar = 0;

    public int main(){
        Scanner sc = new Scanner(System.in);
        //conferindo se as senhas foram inicializadas
        while(k!=5){
            System.out.println(password_filho[k]);
            k++;
            }
       
        libera_acesso = login_filho();
        
        if(libera_acesso == 1){
            System.out.println("Acesso liberado, bem vindo cliente " + password_filho[k]);
        }
        if(libera_acesso == 0){
            //
        }
    sc.close();
    return opcao_encerrar;
    }




    public int login_filho(){
        Scanner sc = new Scanner(System.in);
        int senha_digitada;
        int contador = 0;
        //  int opcao_encerrar_login = 0;
        while(libera_acesso != 1 && contador != 3){
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
            libera_acesso = 1;
        }
    }
    if(contador == 3){
        System.out.println("SUA CONTA FOI BLOQUEADA. Contate o ADM do caixa eletrônico ou seu banco");
        libera_acesso = 0;
}
        sc.close();
        return libera_acesso;
}



}


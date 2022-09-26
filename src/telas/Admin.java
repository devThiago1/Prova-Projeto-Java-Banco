package telas;
import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);
    public int password_admin[] = new int[1]; 
    public int libera_acesso_admin;
    public int opcao_encerrar;

    public int main(){
      System.out.println(password_admin[0]);

      libera_acesso_admin = login_admin();
      
      if(libera_acesso_admin == 1){
        System.out.println("Acesso liberado, bem vindo cliente " + password_admin[0]);
        opcao_encerrar = 1;

      }
      if(libera_acesso_admin == 0){
        //
      }
    return opcao_encerrar;
    }

    public int login_admin(){
      
      int senha_digitada;
      libera_acesso_admin = 0;
      
      while(libera_acesso_admin != 1){
        System.out.println("DIGITE SUA SENHA:");
          senha_digitada = sc.nextInt();
        
        if(senha_digitada != password_admin[0]){
          System.out.println("Senha incorreta");
          System.out.printf("NOVAMENTE ");
        }else{
          libera_acesso_admin = 1;
        }
      }
     
      return libera_acesso_admin;
    }
}

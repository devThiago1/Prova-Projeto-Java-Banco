package caixa_geral.application;
import java.util.Scanner;
import caixa_geral.notas.Saque;




public class Admin {
    Scanner sc = new Scanner(System.in);
    public int password_admin[] = new int[1]; 
    public int libera_acesso_admin;
    public int opcao_encerrar;
    public int acesso;
    public int i;
    private int Contas_bloqueadas[] = new int[6];

    public int[] getContas_bloqueadas() {
      return Contas_bloqueadas;
    }

    public void setContas_bloqueadas(int[] contas_bloqueadas) {
      Contas_bloqueadas = contas_bloqueadas;
    }


    Saque saque = new Saque();



    public int main(){
      int opcao_movimentacao_admin;

      System.out.println(password_admin[0]);

      libera_acesso_admin = login_admin();
      
      if(libera_acesso_admin == 1){
        System.out.println("GERENCIAMENTO");
        System.out.println("1 -- CONTA BLOQUEADAS");
        System.out.println("2 -- REPOR NOTAS");
        System.out.println("0 -- ENCERRAR");
          opcao_movimentacao_admin = sc.nextInt();

        if(opcao_movimentacao_admin == 1){
          System.out.println(getContas_bloqueadas());
        }

        if(opcao_movimentacao_admin == 2){
          saque.repor_notas();
        }
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
          System.out.println("Acesso liberado, bem vindo cliente " + password_admin[0]);
          libera_acesso_admin = 1;
        }
      }
     
      return libera_acesso_admin;
    }

  }





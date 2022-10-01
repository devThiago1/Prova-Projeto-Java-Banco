package caixa_geral.options;
import java.util.Scanner;


public class Account_operations {
    public int i;
    private int saldo_user[] = new int[6];
    private int saldo;


    public int getSaldo_user(int password) {
        if(password == 1111)
            saldo = saldo_user[0];
        if(password == 2222)
            saldo = saldo_user[1];
        if(password == 3333)
            saldo = saldo_user[2];
        if(password == 4444)
            saldo = saldo_user[3];
        if(password == 5555)
           saldo = saldo_user[4];

        return saldo;
    }


    public void setSaldo_user(int saldo_user, int password_filho) {
        if(password_filho == 1111){
            this.saldo_user[0] += saldo_user;
        }
        if(password_filho == 2222){
            this.saldo_user[1] += saldo_user;
        }
        if(password_filho == 3333){
            this.saldo_user[2] += saldo_user;
        }
        if(password_filho == 4444){
            this.saldo_user[3] += saldo_user;
        }
        if(password_filho == 5555){
            this.saldo_user[4] += saldo_user;
        }
    }


    public int deposito(int password_filho){
        Scanner sc = new Scanner(System.in);
        int valor_deposito;
            System.out.println(password_filho);
            System.out.println("        DEPÓSITO");
            System.out.println("    Digite o valor que você deseja depositar:");
                valor_deposito = sc.nextInt();
            System.out.println("O valor de R$ " + valor_deposito + " foi depositado com sucesso");
            setSaldo_user(valor_deposito, password_filho);
    return 1;
    }
    
}

package caixa_geral.notas;
import java.util.Scanner;


public class Deposito {
    public int i;
    private int saldo_user = 0;


    public int getSaldo_user() {
        return saldo_user;
    }


    public void setSaldo_user(int saldo_user) {
        this.saldo_user += saldo_user;
    }


    public int main(int password_filho){
        Scanner sc = new Scanner(System.in);
        int valor_deposito;
            System.out.println(password_filho);
            System.out.println("        DEPÓSITO");
            System.out.println("    Digite o valor que você deseja depositar:");
                valor_deposito = sc.nextInt();
            System.out.println("O valor de R$" + valor_deposito + "foi depositado com sucesso");
            setSaldo_user(valor_deposito);
    return 1;
    }
    
}

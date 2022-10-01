package caixa_geral.options;

import java.util.Scanner;

public class Permissions {
    public int blockages(){
        Scanner sc = new Scanner(System.in);
        int acesso = 0;
            System.out.println("O ACESSO DA CONTA DE SEUS DEPENDENTES FOI BLOQUEADO PELO EXCESSO DE TENTATIVAS. OPÇÕES DE SOLUÇÕES");
            System.out.println("1 -- MANTER BLOQUEADO");
            System.out.println("0 -- DESBLOQUEAR");
                acesso = sc.nextInt();
    return acesso;
    }
}

package geral.notas;
import java.util.Scanner;

import geral.application.App;
 

public class Saque{
    App app = new App();
    Saldo saldo = new Saldo();
    Contagem contagem = new Contagem();
    public int valor_saque;
    private int saldo_atual;
    
    public int getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(int saldo_atual) {
        this.saldo_atual = saldo_atual;
    }

    public int main(){
        Scanner sc = new Scanner(System.in);  
        int q_notaDois = 0, q_notaDez = 0, q_notaVinte = 0, q_notaCinquenta = 0; 
        int valor_dois = 0, valor_dez =0, valor_vinte = 0, valor_cinquenta =0; 
        int valida_valor = 0;
        int valida_saque = 0;

        do{
        System.out.println("        SAQUE");
        System.out.println("Saldo disponível para saque:");
        System.out.println(saldo.saldo_caixa());
        System.out.println("Digite o valor do saque: ACEITAMOS APENAS SAQUE DE VALORES PARES*");
            valor_saque = sc.nextInt();
        System.out.println("Notas disponíveis:");
            if(contagem.getNotas_dois() != 0){
                System.out.println("2");
            }
            if(contagem.getNotas_dez() != 0){
                System.out.println("10");
            }
            if(contagem.getNotas_vinte() != 0){
                System.out.println("20");
            }
            if(contagem.getNotas_cinquenta() != 0){
                System.out.println("50");
            }
        System.out.println("Digite em quantas notas você deseja receber o valor do saque");
            if(valor_saque >= 2){
                System.out.printf("2: ");
                q_notaDois = sc.nextInt();
                valor_dois = q_notaDois * 2;
                valida_valor += (valor_dois);
            }
            if(valor_saque >= 10){
                System.out.printf("10: ");
                q_notaDez = sc.nextInt();
                valor_dez = q_notaDez * 10;
                valida_valor += (valor_dez);
            }
            if(valor_saque >= 20){
                System.out.printf("20: ");
                q_notaVinte = sc.nextInt();
                valor_vinte = q_notaVinte *20;
                valida_valor += (valor_vinte);
            }
            if(valor_saque >= 50){
                System.out.printf("50: ");
                q_notaCinquenta = sc.nextInt();
                valor_cinquenta = q_notaCinquenta * 50;
                valida_valor += (valor_cinquenta);
            }


            if(valida_valor != valor_saque || contagem.getNotas_dois() < (q_notaDois * 2) || contagem.getNotas_dez() < (q_notaDez *10) || contagem.getNotas_vinte() < (q_notaVinte * 20) || contagem.getNotas_cinquenta() < (q_notaCinquenta * 50)){
                valida_saque = 0;
                System.out.println("ERRO* saque inválido");
            }else{
                contagem.setNotas_dois(valor_dois);
                contagem.setNotas_dez(valor_dez);
                contagem.setNotas_vinte(valor_vinte);
                contagem.setNotas_cinquenta(valor_cinquenta);
                System.out.println("Saque efetuado com sucesso");
                valida_saque = 1;
                saldo_atual += contagem.getNotas_dois();
                saldo_atual += contagem.getNotas_dez();
                saldo_atual += contagem.getNotas_vinte();
                saldo_atual += contagem.getNotas_cinquenta();
            }
        }while(valida_saque != 1);
      
            
 
 
        return valida_saque;
    }
}
 

package caixa_geral.notas;
import java.util.Scanner;

 

public class atm_operations{
    public int valor_saque;
    private int saldo_atual = 1640;
    private int notas_dois = 40;
    private int notas_dez = 200;
    private int notas_vinte = 400 ;
    private int notas_cinquenta = 1000 ;
    
    public int getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(int saldo_atual) {
        this.saldo_atual -= saldo_atual;
    }

    public int getNotas_dois() {
        return notas_dois;
    }
    public void setNotas_dois(int notas_dois) {
        this.notas_dois -= notas_dois;
    }
    public int getNotas_dez() {
        return notas_dez;
    }
    public void setNotas_dez(int notas_dez) {
        this.notas_dez -= notas_dez;
    }
    public int getNotas_vinte() {
        return notas_vinte;
    }
    public void setNotas_vinte(int notas_vinte) {
        this.notas_vinte -= notas_vinte;
    }
    public int getNotas_cinquenta() {
        return notas_cinquenta;
    }
    public void setNotas_cinquenta(int notas_cinquenta) {
        this.notas_cinquenta -= notas_cinquenta;
    }


    public int repor_notas(int q_notaDois, int q_notaDez, int q_notaVinte, int q_notaCinquenta, int saldo){
        Scanner sc = new Scanner(System.in);
        int repor;
        int notas_dois_repor;
        int notas_dez_repor;
        int notas_vinte_repor;
        int notas_cinquenta_repor;

        notas_dois_repor = 20 - q_notaDois / 2;
        notas_dez_repor = 20 - q_notaDez / 10;
        notas_vinte_repor = 20 - q_notaVinte / 20;
        notas_cinquenta_repor =  20 - q_notaCinquenta / 50;
        

          System.out.println("QUANTIDADE DE NOTAS UTILIZADAS");
          System.out.println("R$2: " + notas_dois_repor);
          System.out.println("R$10: " + notas_dez_repor);
          System.out.println("R$20: " + notas_vinte_repor);
          System.out.println("R$50: " + notas_cinquenta_repor);
          System.out.println(saldo);
          System.out.println("PARA REPOR TODAS AUTOMATICAMENTE, DIGITE 1");
            repor = sc.nextInt();
          if(repor == 1){
            this.notas_dois = 40;
            this.notas_dez = 200;
            this.notas_vinte = 400;
            this.notas_cinquenta = 1000; 
            this.saldo_atual = 1640;   
        return 1;
          }
    return 1;
    }

    public int saque(){
        atm_operations saque = new atm_operations();
        Scanner sc = new Scanner(System.in);  
        int valida_saque = 0;

        do{
        int q_notaDois = 0, q_notaDez = 0, q_notaVinte = 0, q_notaCinquenta = 0; 
        int valor_dois = 0, valor_dez =0, valor_vinte = 0, valor_cinquenta =0, valida_valor =0; 
        System.out.println("        SAQUE");
        System.out.println("Saldo disponível para saque:");
        System.out.println(getSaldo_atual());
        System.out.println("Digite o valor do saque: ACEITAMOS APENAS SAQUE DE VALORES PARES*");
            valor_saque = sc.nextInt();
        System.out.println("Notas disponíveis:");
            if(saque.getNotas_dois() != 0){
                System.out.println("2");
            }
            if(saque.getNotas_dez() != 0){
                System.out.println("10");
            }
            if(saque.getNotas_vinte() != 0){
                System.out.println("20");
            }
            if(saque.getNotas_cinquenta() != 0){
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

            //validador de saque
            if(valida_valor != valor_saque ||  saque.getNotas_dois() < (q_notaDois * 2) || saque.getNotas_dez() < (q_notaDez *10) || saque.getNotas_vinte() < (q_notaVinte * 20) || saque.getNotas_cinquenta() < (q_notaCinquenta * 50)){
                valida_saque = 0;
                System.out.println("ERRO* saque inválido");
            }else{
                setNotas_dois(valor_dois);
                setNotas_dez(valor_dez);
                setNotas_vinte(valor_vinte);
                setNotas_cinquenta(valor_cinquenta);
                System.out.println("Saque efetuado com sucesso");
                valida_saque = 1;
                setSaldo_atual(valor_saque);
            }
        }while(valida_saque != 1);
      
            
 
 
        return valida_saque;
    }
}
 

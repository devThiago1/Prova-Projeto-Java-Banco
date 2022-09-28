package notas;
import notas.Saque;


public class Contagem{
    Saque saque = new Saque();
    public int notas[][] = new int[4][21];
    private int k;
    private int n;
    public int init_notas(){
        int nota_dois = 2;
        int nota_dez = 10;
        int nota_vinte = 20;
        int nota_cinquenta = 50;
        for(k=0;k<=3; k++){
            for( n=0; n<=20;n++){
                if(k == 0){
                    notas[k][n] = nota_dois;
                    saque.notas_disponiveis[k][n] = notas[k][n];
                }
                if(k == 1){
                    notas[k][n] = nota_dez;
                    saque.notas_disponiveis[k][n] = notas[k][n];

                }
                if(k == 2){
                    notas[k][n] = nota_vinte;
                    saque.notas_disponiveis[k][n] = notas[k][n];

                }
                if(k == 3){
                    notas[k][n] = nota_cinquenta;
                    saque.notas_disponiveis[k][n] = notas[k][n];
                }
            }
        }
        for( k=0;k<=3; k++){
            for( n=0; n<=20;n++){
                System.out.println(notas[k][n]);
            }
        }
        
        return 1;
    }
}

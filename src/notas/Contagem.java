package notas;


public class Contagem{
    public int notas[][] = new int[5][21];

    public int inicializador_notas(){
        int nota_dois = 2;
        int nota_dez = 10;
        int nota_vinte = 20;
        int nota_cinquenta = 50;
            for(int k=0;k<=4; k++){
                for(int n=0; n<=20;n++){
                    if(k == 0){
                        notas[k][n] = nota_dois;
                    }
                    if(k == 1){
                        notas[k][n] = nota_dez;
                    }
                    if(k == 2){
                        notas[k][n] = nota_vinte;
                    }
                    if(k == 3){
                        notas[k][n] = nota_cinquenta;
                    }
                }
            }
    for(int i=0; i<=3; i++){
        for(int n=0; n<=20;n++){
            System.out.println(notas[i][n]);
            }
        }
        return 1;
    }
}

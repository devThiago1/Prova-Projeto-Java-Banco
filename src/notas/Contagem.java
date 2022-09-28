package notas;


public class Contagem{
   /*  public int notas[][] = new int[5][21];

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
*/

public int notas_dois = 40;
public int notas_dez = 200;
public int notas_vinte = 400;
public int notas_cinquenta = 1000;

    public int getNotas_dois() {
        return notas_dois;
    }
    public void setNotas_dois(int notas_dois) {
        this.notas_dois = notas_dois;
    }
    public int getNotas_dez() {
        return notas_dez;
    }
    public void setNotas_dez(int notas_dez) {
        this.notas_dez = notas_dez;
    }
    public int getNotas_vinte() {
        return notas_vinte;
    }
    public void setNotas_vinte(int notas_vinte) {
        this.notas_vinte = notas_vinte;
    }
    public int getNotas_cinquenta() {
        return notas_cinquenta;
    }
    public void setNotas_cinquenta(int notas_cinquenta) {
        this.notas_cinquenta = notas_cinquenta;
    }
}


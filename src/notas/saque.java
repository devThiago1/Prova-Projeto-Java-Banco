package notas;
import notas.Saldo;
import notas.Contagem;
 

public class Saque {
    Contagem contagem = new Contagem();
    public int notas_disponiveis[][] = new int[4][21];
    
    public int main(){
    int k;
    int n;
        for(k=0;k<=3; k++){
            for(n=0; n<=20;n++){
                System.out.println(notas_disponiveis[k][n]);
            }
        }
        System.out.println("        SAQUE");
        System.out.println("Notas disponiveis:");
        System.out.println("Digite o valor do saque. ACEITAMOS APENAS SAQUE DE NÚMEROS PARES*");

 
 
 
        return 1;
    }
   
}
 

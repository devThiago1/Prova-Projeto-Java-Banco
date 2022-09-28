package notas;
<<<<<<< HEAD
import notas.Saldo;
import notas.Contagem;
 
=======

public class Saque {
    Contagem contagem = new Contagem();
>>>>>>> d6421b97cc7424e05814ab2ea84fb646eea6ac94

public class Saque {
    Contagem contagem = new Contagem();
    public int notas_disponiveis[][] = new int[4][21];
    
    public int main(){
<<<<<<< HEAD
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
=======
            System.out.println("            SAQUE");
            System.out.println("Notas disponiveis:");
            if(contagem.getNotas_dois() != 0){
                System.out.println("2");
            }
>>>>>>> d6421b97cc7424e05814ab2ea84fb646eea6ac94

 
 
 
        return 1;
    }
   
}
 

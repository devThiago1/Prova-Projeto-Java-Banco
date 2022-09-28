package notas;
import notas.Saldo;
import notas.Contagem;
 

public class Saque{
    Contagem contagem = new Contagem();
    
    public int main(){
        System.out.println("        SAQUE");
        System.out.println("Notas disponiveis:");
        System.out.println("Digite o valor do saque. ACEITAMOS APENAS SAQUE DE NÚMEROS PARES*");
        System.out.println("            SAQUE");
        System.out.println("Notas disponiveis:");
            if(contagem.getNotas_dois() != 0){
                System.out.println("2");
            }
 
 
 
        return 1;
    }
   
}
 

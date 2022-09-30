package caixa_geral.notas;


 public class Saldo{
    Contagem contagem = new Contagem();        
        public int saldo_caixa(){
            int saldo_total_caixa=0;

            saldo_total_caixa += contagem.getNotas_dois();
            saldo_total_caixa += contagem.getNotas_dez();
            saldo_total_caixa += contagem.getNotas_vinte();
            saldo_total_caixa += contagem.getNotas_cinquenta();

           return saldo_total_caixa;
        }
}

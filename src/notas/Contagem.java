package notas;

public class Contagem{

private int notas_dois ;
private int notas_dez ;
private int notas_vinte ;
private int notas_cinquenta ;
    public Contagem(){
        this.notas_dois = 40;
        this.notas_dez = 200;
        this.notas_vinte = 400;
        this.notas_cinquenta = 1000;
    }
    public void repor_notas_totais(){
        this.notas_dois = 40;
        this.notas_dez = 200;
        this.notas_vinte = 400;
        this.notas_cinquenta = 1000;
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
}
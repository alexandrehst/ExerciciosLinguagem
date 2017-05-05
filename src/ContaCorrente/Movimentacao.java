package ContaCorrente;
public class Movimentacao {
    private String historico;
    private double valor;
    
    public Movimentacao(String historico, double valor){
        this.historico = historico;
        this.valor = valor;
    }  
    
    public String toString(){
        return historico + "\t\t" + "R$ "+ valor;
    }
}
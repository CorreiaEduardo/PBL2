package org.fieb;

/**
 * @author Eduardo C.
 */
public class Liquidificador extends Eletrodomestico{
    private Tampa tampa;
    private double litrosPorSegundo;
    private double quantidade;
    private double capacidade;
    public Liquidificador(double p, double v, String m) {
            super(p, v, m);
            tampa = new Tampa();
    }
    public Liquidificador(double v, String m) {
            super(m, v);
            tampa = new Tampa();
    }
    @Override
    public double calculoDesconto(String mes){
        if (mes.equalsIgnoreCase("Agosto")) {
                this.preco -= this.preco*0.10;
                return this.getPreco()*0.10;
        }
        else {
                return 1;
        }
    }
    
    public double calculaLitrosPorSegundo(){
       return this.litrosPorSegundo = this.quantidade/this.capacidade;
    }

    public Tampa getTampa() {
        return tampa;
    }

    public void setTampa(Tampa tampa) {
        this.tampa = tampa;
    }

    public double getLitrosPorSegundo() {
        return litrosPorSegundo;
    }

    public void setLitrosPorSegundo(double litrosPorSegundo) {
        this.litrosPorSegundo = litrosPorSegundo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}

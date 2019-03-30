package org.fieb;

/**
 * @author Eduardo C.
 */
public class Liquidificador extends Eletrodomestico implements Helicoidal{
    private Tampa tampa;
    private double litrosPorSegundo;
    private double quantidade;
    private double capacidade;
    public Liquidificador(double p, String m) {
            super(p, m);
            tampa = new Tampa();
    }
    public Liquidificador(String m) {
            super(m);
            tampa = new Tampa();
    }
    @Override
    public double calculoDesconto(String mes){
        if (mes.equalsIgnoreCase("Agosto")) {
            return this.getPreco()*0.10;
        }
        else {
            return 1;
        }
    }
    
    @Override
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

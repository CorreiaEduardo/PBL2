package org.fieb;

/**
 * @author Eduardo C.
 */
public class Batedeira extends Eletrodomestico implements Helicoidal{
    
    private int quantidadeHelices;
    private double litrosPorSegundo;
    private double quantidade;
    private double capacidade;
    public Batedeira(double p, String m) {
        super(p, m);
    }
    
    public Batedeira(String m) {
            super(m);
    }

    @Override
    public double calculoDesconto(String mes) {
        if (mes.equalsIgnoreCase("Dezembro")) {
            return this.getPreco()*0.20;
        }
        else {
            return 1;
        }
    }
    
    @Override
    public double calculaLitrosPorSegundo(){
       return this.litrosPorSegundo = this.quantidade/(this.capacidade*this.getQuantidadeHelices());
    }

    public int getQuantidadeHelices() {
        return quantidadeHelices;
    }

    public void setQuantidadeHelices(int quantidadeHelices) {
        this.quantidadeHelices = quantidadeHelices;
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

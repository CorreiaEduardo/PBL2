package org.fieb;

/**
 * @author Eduardo C.
 */
public class Batedeira extends Eletrodomestico {
    
    private int quantidadeHelices;
    private double litrosPorSegundo;
    private double quantidade;
    private double capacidade;
    public Batedeira(double p, double v, String m) {
        super(p, v, m);
    }
    
    public Batedeira(double v, String m) {
            super(m, v);
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

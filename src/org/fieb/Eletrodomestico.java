package org.fieb;

/**
 * @author Eduardo C.
 */
public abstract class Eletrodomestico {
    protected String marca;
    protected double preco;
    protected double voltagem;

    public Eletrodomestico(double p,double v,String m) {
        this.preco = p;
        this.voltagem = v;
        this.marca = m;
    }

    public Eletrodomestico(String m,double v) {
        this.marca = m;
        this.voltagem = v;
    }

    public void setMarca(String m){
        this.marca = m;
    }
    public void setPreco(double p){
        this.preco = p;
    }
    public boolean setVoltagem(double v){
        if (v == 110 || v == 220) {
            this.voltagem = v;
            return true;
        }else{
            return false;
        }
    }
    public String getMarca(){
        return this.marca;
    }
    public double getPreco(){
        return this.preco;
    }
    public double getVoltagem(){
        return this.voltagem;
    }

    public abstract double calculoDesconto(String mes);
}
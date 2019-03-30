/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fieb;

/**
 *
 * @author Edu
 */
public class FerroDePassar extends Eletrodomestico{

    public FerroDePassar(double p, String m) {
        super(p, m);
    }

        public FerroDePassar(String m) {
            super(m);
    }
    
    @Override
    public double calculoDesconto(String mes) {
        if (mes.equalsIgnoreCase("Maio")) {
            return this.getPreco()*0.15;
        }
        else {
            return 1;
        }
    }
    
    @Override
    public boolean setVoltagem(double v){
        if (v == 110 || v == 220 || v == 5) {
            this.voltagem = v;
            return true;
        }else{
            return false;
        }
    }
}

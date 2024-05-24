package br.com.alura.scrennmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}

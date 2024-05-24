package br.com.alura.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.scrennmatch.calculos.CalculadoraDeTempo;
import br.com.alura.scrennmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão",1970,180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(5);
        meuFilme.avalia(6);
        meuFilme.avalia(10);

        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        System.out.println();

        Serie lost = new Serie("Lost",2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("O Poderoso Chefão2",1975,210);

        Filme filmeDoPaulo = new Filme("Dogville",2003,200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da Lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        System.out.println(filmeDoPaulo.toString());
    }
}
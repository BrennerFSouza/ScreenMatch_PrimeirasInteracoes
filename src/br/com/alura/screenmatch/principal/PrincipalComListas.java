package br.com.alura.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("1 Poderoso Chefão",1970,180);
        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("O Poderoso Chefão2",1975,210);
        Filme filmeDoPaulo = new Filme("Dogville",2003,200);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> listaDeFilmesESeries = new ArrayList<>();
        listaDeFilmesESeries.add(filmeDoPaulo);
        listaDeFilmesESeries.add(meuFilme);
        listaDeFilmesESeries.add(outroFilme);
        listaDeFilmesESeries.add(lost);

        for (Titulo item: listaDeFilmesESeries){
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Vincent van Gogh");
        buscaPorArtista.add("Leonardo da Vinci");
        buscaPorArtista.add("Pablo Picasso");
        buscaPorArtista.add("Claude Monet");
        buscaPorArtista.add("Michelangelo Buonarroti");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println(listaDeFilmesESeries);
        Collections.sort(listaDeFilmesESeries);
        System.out.println(listaDeFilmesESeries);

        listaDeFilmesESeries.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeFilmesESeries);



    }
}

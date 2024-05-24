package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TrabalharJson {
    static Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public static TituloOmdb buscarDaAPI(String json){
        return  gson.fromJson(json, TituloOmdb.class);
    }

    public static void salvarJson(List<Titulo> titulos) throws IOException {
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("Salvo com sucesso!");
    }







}

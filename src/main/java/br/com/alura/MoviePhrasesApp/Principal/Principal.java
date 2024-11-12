package br.com.alura.MoviePhrasesApp.Principal;

import br.com.alura.MoviePhrasesApp.Model.Frase;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public void exibeMenu(){
        System.out.println("Projeto Spring Sem WEB");
        Frase frase1 = new Frase(1, "Toy Story", "Ao Infinito e além", "Buzz", "Poster 1");
        Frase frase2 = new Frase(2, "Toy Story", "Tem uma cobra na minha bota", "Woddy", "Poster 1");
        List<Frase> listaFrases = new ArrayList<>();
        listaFrases.add(frase1);
        listaFrases.add(frase2);
        System.out.println(listaFrases);
    }

}

package br.com.alura.MoviePhrasesApp.Principal;

import br.com.alura.MoviePhrasesApp.Model.Frase;
import br.com.alura.MoviePhrasesApp.repository.FraseRepository;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    private FraseRepository repositorio;

    public Principal(FraseRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu(){
        List<Frase> listaFrases = repositorio.findAll();
        listaFrases.stream().forEach(System.out::println);
    }

}

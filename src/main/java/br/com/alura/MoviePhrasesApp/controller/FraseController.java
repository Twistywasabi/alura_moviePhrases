package br.com.alura.MoviePhrasesApp.controller;

import br.com.alura.MoviePhrasesApp.Model.Frase;
import br.com.alura.MoviePhrasesApp.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseRepository repositorio;

    @GetMapping("/series/frases")
    public Frase obterFrases() {
        return repositorio.fraseAleatoria();
    }

}

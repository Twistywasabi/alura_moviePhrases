package br.com.alura.MoviePhrasesApp.controller;

import br.com.alura.MoviePhrasesApp.Model.Frase;
import br.com.alura.MoviePhrasesApp.Service.FraseService;
import br.com.alura.MoviePhrasesApp.dto.FraseDto;
import br.com.alura.MoviePhrasesApp.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDto obterFrases() {
        return servico.obterFraseAleatoria();
    }

}

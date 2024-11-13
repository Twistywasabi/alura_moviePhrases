package br.com.alura.MoviePhrasesApp.controller;

import br.com.alura.MoviePhrasesApp.Model.Frase;
import br.com.alura.MoviePhrasesApp.dto.FraseDto;
import br.com.alura.MoviePhrasesApp.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseRepository repositorio;

    @GetMapping("/series/frases")
    public FraseDto obterFrases() {
        Frase fraseAleatoria = repositorio.fraseAleatoria();
        return new FraseDto(
                fraseAleatoria.getTitulo(),
                fraseAleatoria.getFrase(),
                fraseAleatoria.getPersonagem(),
                fraseAleatoria.getPoster() );
    }

}

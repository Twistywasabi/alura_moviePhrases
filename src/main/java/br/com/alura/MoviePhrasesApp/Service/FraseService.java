package br.com.alura.MoviePhrasesApp.Service;

import br.com.alura.MoviePhrasesApp.Model.Frase;
import br.com.alura.MoviePhrasesApp.dto.FraseDto;
import br.com.alura.MoviePhrasesApp.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDto obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDto(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());

    }
}

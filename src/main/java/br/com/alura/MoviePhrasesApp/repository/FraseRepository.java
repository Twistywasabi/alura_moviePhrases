package br.com.alura.MoviePhrasesApp.repository;

import br.com.alura.MoviePhrasesApp.Model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {



}

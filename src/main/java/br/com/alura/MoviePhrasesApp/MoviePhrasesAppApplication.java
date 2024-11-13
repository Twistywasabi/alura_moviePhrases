package br.com.alura.MoviePhrasesApp;

import br.com.alura.MoviePhrasesApp.Principal.Principal;
import br.com.alura.MoviePhrasesApp.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviePhrasesAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviePhrasesAppApplication.class, args);
	}

	@Autowired
	private FraseRepository repositorio;

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal(repositorio);
		principal.exibeMenu();

	}
}

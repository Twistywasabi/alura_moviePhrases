package br.com.alura.MoviePhrasesApp.Principal;

import br.com.alura.MoviePhrasesApp.Model.Frase;
import br.com.alura.MoviePhrasesApp.repository.FraseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private FraseRepository repositorio;
    private Scanner leitura = new Scanner(System.in);

    public Principal(FraseRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu(){
        var option = -1;
        while (option != 1) {

        Frase fraseAleatoria = repositorio.fraseAleatoria();
        System.out.println(fraseAleatoria);
            System.out.println("Quer continuar ? (Digite 1 para sair)");
        option = leitura.nextInt();
        leitura.nextLine();

        }

    }

}

# Movies Phrases Web App 🚩

A Movies Phrase app based on mini Challenge of Alura in "Java: Criando sua primeira API e conectando ao frontend" course

## Objective 📜

Create a fullstack application where the user click in a button and a new poster and phrase shows in the screen.

The Website Repository can be found in this link: https://github.com/jacqueline-oliveira/3356-java-desafio-front

The frontend ("http://127.0.0.1:5501") makes a GET requisition to the endpoint "http://localhost:8080/series/frases" that returns a JSON with this structure:

- titulo: String ("Star Wars")
- Frase: String ("May The Force Be With You")
- Personagem: String ("Obi Wan Kenobi")
- Poster: String (	"https://m.media-amazon.com/images/M/MV5BOTA5NjhiOTAtZWM0ZC00MWNhLThiMzEtZDFkOTk2OTU1ZDJkXkEyXkFqcGdeQXVyMTA4NDI1NTQx._V1_SX300.jpg")

PostgreSQL was used to store the movies data

## Technologies and Tools 👨‍💻

- JAVA 17
- Spring Initializr
  - Spring WEB
  - Spring Data JPA
  - PostgreSQL Driver
  - Springboot Dev Tools
- PostgreSQL

## Result 🎁

![Alt text](/src/img/result.PNG)

## References 📚

- https://github.com/alura-cursos/3356-java-desafio-web/tree/main?tab=readme-ov-file#readme
- https://github.com/jacqueline-oliveira/3356-java-desafio-front

## Updates 🕐

2024/11/13 - First version

## Pending issues 🚨

- Add DevTools for Hot Reload
- A function to add a movie to database
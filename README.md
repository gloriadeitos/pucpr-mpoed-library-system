# Sistema de Biblioteca Virtual com Recomendação de Livros

Este projeto consiste no desenvolvimento de um sistema de biblioteca virtual em Java, usando diversas estruturas de dados, como `LinkedList`, `Queue`, `Stack` e `HashMap`, para gerenciar livros, recomendações e histórico de navegação de usuários.

## Descrição do Projeto

A Atividade Somativa 1 é uma junção dos conceitos abordados nas atividades formativas das semanas 2 e 3 da disciplina **MPOED**. O objetivo final do projeto é criar um sistema de recomendação de livros baseado em um grafo, no qual cada livro é um nó e as relações entre eles (como livros recomendados) são representadas por arestas.

### Estruturas de Dados Utilizadas

1. **LinkedList**: Usada para armazenar a coleção de livros da biblioteca virtual.
2. **Queue**: Implementada para gerenciar a fila de espera de livros emprestados.
3. **Stack**: Usada para armazenar o histórico de navegação dos usuários.
4. **HashMap**: Usado para criar o grafo de livros, onde cada nó representa um livro e as arestas representam as relações de recomendação.

## Objetivos da Atividade

### Semana 2 (Atividade Formativa)
Na segunda semana, o projeto envolveu a criação de um **sistema de gerenciamento de biblioteca** usando a estrutura de dados `LinkedList`. O foco estava em organizar a coleção de livros, armazenando informações como título, autor e ano de publicação.

### Semana 3 (Atividade Formativa)
A terceira semana adicionou duas novas funcionalidades:
- **Fila de espera** para livros emprestados, permitindo que os usuários se inscrevam para receber notificações quando um livro estiver disponível.
- **Histórico de navegação** usando uma pilha para registrar os livros consultados recentemente.

### Semana 4 (Atividade Somativa)
Nesta fase do projeto, a tarefa foi criar um **grafo** que representasse a recomendação de livros. Cada livro é um nó e as relações entre eles (como similaridade ou recomendações) são representadas por arestas. A estrutura `HashMap<Livro, Set<Livro>>` foi utilizada para modelar essas relações.

## Enunciados

Dentro da pasta **Enunciados**, estão os enunciados detalhados de cada uma das atividades que compõem este projeto (semana 2, semana 3 e a atividade somativa 1).

package com.trybe.consultafilmes;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Consultas {

  private final Collection<Filme> filmes;

  public Consultas(Collection<Filme> filmes) {
    this.filmes = filmes;
  }

  /**
   * Consulta 1: a partir da coleção de filmes desta classe, este método retorna o conjunto de
   * atores que interpretaram a si próprios em pelo menos um desses filmes.
   *
   * <p>
   * Considera-se "atores que interpretaram a si próprios" aqueles que têm o seu nome como uma das
   * chaves do Map `atoresPorPersonagem` e também como um dos itens pertencentes ao conjunto
   * associado a esta mesma chave.
   * </p>
   */
  public Set<String> atoresQueInterpretaramSiProprios() {
    Set<String> filmesStream = filmes.stream()
        .flatMap(filme -> filme.personagens.stream().filter(ator -> filme.atores.contains(ator)))
        .collect(Collectors.toSet());
    return filmesStream;
  }

  /**
   * Consulta 2: a partir da coleção de filmes desta classe, este método retorna a lista de atores
   * que atuaram em pelo menos um filme de um determinado diretor. A lista retornada está disposta
   * em ordem alfabética.
   *
   * <p>
   * Considera-se que um ator tenha atuado em um filme de um determinado diretor se ele tem o seu
   * nome como um dos itens do campo `atores`, ao mesmo tempo em que o diretor em questão tem o seu
   * nome como um dos itens do campo `diretores` do mesmo filme.
   * </p>
   */
  public List<String> atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica(String diretor) {
    return filmes.stream().filter(filme -> filme.diretores.contains(diretor))
        .flatMap(filme -> filme.atores.stream()).sorted().distinct().collect(Collectors.toList());
  }

  /**
   * Consulta 3: a partir da coleção de filmes desta classe, este método retorna a lista de filmes
   * em que pelo menos um dos diretores tenha atuado. A lista retornada está disposta em ordem de
   * lançamento, com os filmes mais recentes no início.
   *
   * <p>
   * Considera-se "filmes em que pelo menos um dos diretores tenha atuado" aqueles em que pelo menos
   * um dos itens do campo `diretores` também é um item do campo `atores`.
   * </p>
   */
  public List<Filme> filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro() {
    Set<Filme> filmesUnicos = new HashSet<>();

    filmes.stream()
        .filter(
            filme -> filme.diretores.stream().anyMatch(diretor -> filme.atores.contains(diretor)))
        .forEach(filmesUnicos::add);

    return filmesUnicos.stream().sorted(Comparator.comparingInt(filme -> -filme.anoDeLancamento))
        .collect(Collectors.toList());
  }

  /**
   * Consulta 4: a partir da coleção de filmes desta classe, este método retorna um Map contendo
   * todos os filmes lançados em um determinado ano agrupados por categoria.
   *
   * <p>
   * Cada chave do Map representa uma categoria, enquanto cada valor representa o conjunto de filmes
   * que se encaixam na categoria da chave correspondente.
   * </p>
   */
  public Map<String, Set<Filme>> filmesLancadosNoAnoAgrupadosPorCategoria(int ano) {
    return filmes.stream().filter(e -> e.anoDeLancamento == ano)
        .flatMap(e -> e.categorias.stream().map(a -> Map.entry(a, e)))
        .collect(Collectors.groupingBy(Map.Entry::getKey,
            Collectors.mapping(Map.Entry::getValue, Collectors.toSet())));
  }
}


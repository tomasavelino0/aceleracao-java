package com.trybe.consultafilmes;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   */
  public static void main(String[] args) {
    Consultas consultas = new Consultas(Filmes.todos());
    Set<String> resultados = consultas.atoresQueInterpretaramSiProprios();
    // List<String> resultado2 =
    // consultas.atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica("Malcolm D. Lee");
    // List<Filme> resultado3 = consultas.filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro();
    //
    Map<String, Set<Filme>> resultado4 = consultas.filmesLancadosNoAnoAgrupadosPorCategoria(1940);
    System.out.println(resultado4);

  }
}

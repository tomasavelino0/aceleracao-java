package com.trybe.acc.java.planejamentodeviagem;

public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo = new Voo();

  /**
   * Método construtor da classe.
   * 
   */
  public Viagem(String embarque, String origem, String destino, double distanciaKm) {
    this.distanciaKm = distanciaKm;
    this.embarque = embarque;
    this.origem = origem;
    this.destino = destino;
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    return voo.retornarTempoVoo(distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());

    return voo.retornarInformacaoVoo(embarque, origem,
        tempoViagem.retonarDesembarqueHorarioLocalDestino(), destino);
  }
}

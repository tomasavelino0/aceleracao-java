package com.trybe.acc.java.planejamentodeviagem;

public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;
    int duracaoInt = duracaoDouble.intValue();
    return duracaoInt;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    return "Embarque na cidade de origem:" + origem + "Hora e data:" + embarque
        + "\nDesembarque no destino: " + destino + "Hora e Data" + desembarque;
  }
}

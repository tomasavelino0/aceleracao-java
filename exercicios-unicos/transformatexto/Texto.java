package com.trybe.acc.java.transformatexto;

/**
 * Classe formatadora de string.
 */
public class Texto {

  /**
   * Retorna string formatada.
   */
  public String transformaTexto(String frase) {
    String fraseFormatada = frase.replace("+", " ");
    int indexFrase = fraseFormatada.indexOf("a");
    if (indexFrase % 2 == 0) {
      return fraseFormatada.toUpperCase();
    } else {
      String[] primeiraPalavra = fraseFormatada.split(" ");
      return primeiraPalavra[0];
    }
  }
}


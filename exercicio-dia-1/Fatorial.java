package com.trybe.acc.java;

/**
 * Calcula o fatorial de um numero.
 *
 */
public class Fatorial {
  /**
   * Retorna o fatorial de um numero.
   */
  public static void main(String[] args) {
    // Seu código aqui
    long fatorial18 = 18;
    for (long i = fatorial18 - 1; i > 0; i--) {
      fatorial18 = fatorial18 * i;
    }
    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("O fatorial de 18 é igual a " + fatorial18);

  }

}

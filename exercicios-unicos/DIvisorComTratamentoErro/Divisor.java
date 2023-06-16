package com.trybe.acc.java;

/**
 * Classe responsavel por dividir 2 numeros.
 */
public class Divisor {

  /**
   * Retorna a divisao de 2 numeros.
   */
  public int dividir(int num1, int num2) {
    try {
      int result = num1 / num2;
      return result;

    } catch (ArithmeticException e) {
      return 0;
    }
  }
}

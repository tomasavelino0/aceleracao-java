package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe converte os bytes.
 *
 */
public class ConverteBytes {

  /**
   * Retonar a quantidade de bytes.
   */
  public static void main(String[] args) {
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite um número:");
    byte valor = scan.nextByte();

    // Seu código aqui
    int qtdBits = valor * 8;

    scan.close();

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println(valor + " bytes correspondem a " + qtdBits + " bits");

  }
}

package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Esta classe Calcula a area de um qudrado.
 */

public class Area {
  /**
  * Retorna a area do quadrado.
  */
  public static void main(String[] args) {
    
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite a medida do lado do quadrado:");
    double lado = scan.nextDouble();
    double area = lado * lado;

    scan.close();

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("A area do quadrado de lado " + lado + " é igual a " + area);
  }
}
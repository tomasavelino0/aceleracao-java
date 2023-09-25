package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  private static final ArrayList<Short> minor = new ArrayList<Short>();
  private static final ArrayList<Short> adult = new ArrayList<Short>();
  private static final ArrayList<Short> greaterThan50 = new ArrayList<Short>();

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Principal programa = new Principal();
    programa.start();
  }

  /**
   * Programa de relatorio de entradas em um estabelecimento.
   */

  public void start() {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o  estabelecimento");
      System.out.println("2 - Finalizar o sistema e mostrar o relatório");

      short userChoice = scanner.nextShort();

      if (userChoice == 1) {

        System.out.println("Entre com a idade:");
        short userAge = scanner.nextShort();

        if (userAge < 18) {
          minor.add(userAge);
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
        } else if (userAge >= 18 && userAge <= 49) {
          adult.add(userAge);
          System.out.println("Pessoa adulta, catraca liberada!");
        } else {
          greaterThan50.add(userAge);
          System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
        }
      } else if (userChoice == 2) {
        getRelatoryUsers();
        running = false;
      } else {
        System.out.println("Entre com uma opção válida!");
      }

    }

    scanner.close();
  }

  /**
   * Metodo que gera o relatorio referente as pessoas que entraram .
   */

  private static void getRelatoryUsers() {
    int totalUsers = minor.size() + adult.size() + greaterThan50.size();
    int minorAge = minor.size();
    int adults = adult.size();
    int over50 = greaterThan50.size();
    String minorPorcentage = getPorcentage(minorAge, totalUsers);
    String adultsPorcentage = getPorcentage(adults, totalUsers);
    String over50Porcentage = getPorcentage(over50, totalUsers);

    System.out.println("----- Quantidade -----\n" + "menores: " + minorAge + "\nadultas: " + adults
        + "\na partir de 50: " + over50);

    System.out.println("----- Percentual -----\n" + "menores: " + minorPorcentage + "%");
    System.out.println("adultas: " + adultsPorcentage + "%");
    System.out.println("a partir de 50: " + over50Porcentage + "%");
    System.out.println("TOTAL: " + totalUsers);
  }

  /**
   * Metodo que gera a porcentagem de pessoas q entraram referente ao total de pessoas.
   */
  private static String getPorcentage(double numAge, double allAges) {
    DecimalFormat numberFormat = new DecimalFormat("0.0#");
    double porcentage = (numAge * 100) / allAges;
    String formatedPorcentage = numberFormat.format(porcentage);
    return formatedPorcentage;
  }
}



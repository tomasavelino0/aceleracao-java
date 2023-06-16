package com.trybe.acc.java.jogodasfazendas;

public class Circle implements Farm {
  static double PI = 3.14;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return PI * (this.radius * this.radius);
  }

}

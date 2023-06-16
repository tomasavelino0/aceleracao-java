package com.trybe.acc.java.jogodasfazendas;

public class Triangle extends Polygon {

  public Triangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    return (this.base * this.height) / 2;
  }

}

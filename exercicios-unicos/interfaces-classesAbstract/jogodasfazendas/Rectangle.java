package com.trybe.acc.java.jogodasfazendas;

public class Rectangle extends Polygon {

  public Rectangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    return this.base * this.height;
  }

}

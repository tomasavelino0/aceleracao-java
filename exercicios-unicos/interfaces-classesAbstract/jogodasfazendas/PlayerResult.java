package com.trybe.acc.java.jogodasfazendas;


public class PlayerResult {
  private String playerName;
  private Object[] farms;

  public PlayerResult(String name, Farm[] farms) {
    this.playerName = name;
    this.farms = farms;
  }

  /**
   * Retorna o totalScore do jogador.
   *
   */

  public double score() {
    double totalScore = 0;
    for (Object farm : this.farms) {
      double area = ((Farm) farm).area();
      totalScore += area;
    }
    return totalScore;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

}

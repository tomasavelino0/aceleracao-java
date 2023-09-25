package com.trybe.gestaotime.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Documento.
 */

@Entity
public class Documento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String cpf;

  private String numeroCarteiraTrabalho;

  private String numeroCbf;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNumeroCarteiraTrabalho() {
    return numeroCarteiraTrabalho;
  }

  public void setNumeroCarteiraTrabalho(String carteiraDeTrabalho) {
    this.numeroCarteiraTrabalho = carteiraDeTrabalho;
  }

  public String getNumeroCbf() {
    return numeroCbf;
  }

  public void setNumeroCbf(String numeroCbf) {
    this.numeroCbf = numeroCbf;
  }


  public long getId() {
    return id;
  }

  /**
   * Métodos.
   */



}

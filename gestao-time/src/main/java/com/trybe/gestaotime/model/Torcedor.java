package com.trybe.gestaotime.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Classe Torcedor.
 **/
@Entity
public class Torcedor {

  /**
   * Atributos.
   **/
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String nome;

  @ManyToMany(mappedBy = "torcedores")
  private List<Time> times = new ArrayList<Time>();

  /**
   * Métodos.
   **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Time> getTimes() {
    return times;
  }

  public void setTimes(List<Time> times) {
    this.times = times;
  }
}

package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Jogador;
import java.util.List;


public class JogadorDao extends GenericDao<Jogador, Integer> {

  public void salvar(Jogador jogador) {
    super.salvar(jogador);
  }

  public List<Jogador> listar() {
    return super.listar("Jogador");
  }

  public void deletar(Long id) {
    super.deletar(id, getEntityClass());
  }

  public void editar(Jogador jogador) {
    super.editar(jogador);
  }

  @Override
  protected Class<Jogador> getEntityClass() {
    return Jogador.class;
  }

}

package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Time;
import java.util.List;

public class TimeDao extends GenericDao<Time, Integer> {

  public void salvar(Time time) {
    super.salvar(time);
  }

  public List<Time> listar() {
    return super.listar("Time");
  }

  public void deletar(Long id) {
    super.deletar(id, getEntityClass());
  }

  public void editar(Time time) {
    super.editar(time);
  }

  @Override
  protected Class<Time> getEntityClass() {
    // TODO Auto-generated method stub
    return Time.class;
  }

}

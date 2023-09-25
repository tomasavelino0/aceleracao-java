package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Torcedor;
import java.util.List;

public class TorcedorDao extends GenericDao<Torcedor, Integer> {

  public void salvar(Torcedor torcedor) {
    super.salvar(torcedor);
  }

  public List<Torcedor> listar() {
    return super.listar("Torcedor");
  }

  public void editar(Torcedor torcedor) {
    super.editar(torcedor);
  }

  public void deletar(long id) {
    super.deletar(id, getEntityClass());
  }

  @Override
  protected Class<Torcedor> getEntityClass() {
    return Torcedor.class;
  }

}

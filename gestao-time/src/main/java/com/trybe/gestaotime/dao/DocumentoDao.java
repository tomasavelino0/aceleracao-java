package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Documento;
import java.util.List;

public class DocumentoDao extends GenericDao<Documento, Integer> {

  public void salvar(Documento documento) {
    super.salvar(documento);
  }

  public List<Documento> listar() {
    return super.listar("Documento");
  }

  public void editar(Documento documento) {
    super.editar(documento);
  }

  public void deletar(long id) {
    super.deletar(id, getEntityClass());
  }

  @Override
  protected Class<Documento> getEntityClass() {
    return Documento.class;
  }

}

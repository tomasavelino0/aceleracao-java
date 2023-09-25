package com.trybe.gestaotime.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 * Classe abstrata GenericDao.
 **/

public abstract class GenericDao<T, I extends Serializable> {

  public static final EntityManager em =
      Persistence.createEntityManagerFactory("crudHibernatePU").createEntityManager();

  /**
   * Cria uma nova entidade no banco de dados.
   *
   * @param entity A entidade a ser criada.
   */
  public void salvar(T entity) {
    try {
      em.getTransaction().begin();
      em.persist(entity);
      em.getTransaction().commit();
    } catch (Exception e) {
      em.getTransaction().rollback();
      e.printStackTrace();
    }
  }

  /**
   * Retorna a lista da entity.
   */
  public List<T> listar(String entity) {
    Query q = em.createQuery("from " + entity);
    return q.getResultList();
  }

  /**
   * Atualiza uma entidade no banco de dados.
   *
   * @param entity A entidade a ser atualizada.
   */
  public void editar(T entity) {
    try {
      em.getTransaction().begin();
      em.merge(entity); // Atualiza o objeto no banco de dados
      em.getTransaction().commit();

    } catch (Exception e) {
      em.getTransaction().rollback();
      throw e;
    }
  }

  /**
   * Exclui uma entidade do banco de dados.
   *
   */
  public void deletar(long id, Class<T> t) {
    try {
      em.getTransaction().begin();
      T entity = em.find(t, id);
      if (entity != null) {
        em.remove(entity);; // Remove o objeto do banco de dados
      }
      em.getTransaction().commit();
    } catch (Exception e) {
      em.getTransaction().rollback();
      throw e;
    }
  }

  protected abstract Class<T> getEntityClass();

}

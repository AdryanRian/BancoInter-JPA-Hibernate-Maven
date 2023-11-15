package br.com.BancoInter.dao;

import br.com.BancoInter.Entidades.Categoria;
import br.com.BancoInter.Entidades.Usuario;

import javax.persistence.EntityManager;

public class CategoriaDao {
    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar (Categoria categoria){
        this.em.persist(categoria);
    }
}

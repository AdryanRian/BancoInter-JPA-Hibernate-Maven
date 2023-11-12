package br.com.BancoInter.dao;

import br.com.BancoInter.Entidades.Usuario;

import javax.persistence.EntityManager;

public class UsuarioDao {
    private EntityManager em;

    public UsuarioDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar (Usuario usuario){
        this.em.persist(usuario);
    }
}

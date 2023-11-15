package br.com.BancoInter.Aplicacao;

import br.com.BancoInter.Entidades.Categoria;
import br.com.BancoInter.Entidades.Usuario;
import br.com.BancoInter.dao.CategoriaDao;
import br.com.BancoInter.dao.UsuarioDao;
import br.com.BancoInter.util.JPAutil;

import javax.persistence.EntityManager;

public class MainAplicacao {
    public static void main(String[] args) {
        EntityManager em = JPAutil.getEntityManger();//     AGORA ESTÁ NO JPA UTIL EntityManagerFactory factory = Persistence.
        UsuarioDao produtoDao = new UsuarioDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);



        Categoria pessoaFisica = new Categoria("Pessoa Fisica");


        Usuario Adryan = new Usuario("Adryan Rian ","adryanrian14@gmail.com",81,"984479047",
                "10.269.392","137.717.994-06", "123456",pessoaFisica);


        em.getTransaction().begin();//Avisa para o banco iniciar a transação (Não precisa se estiver em JTA no lugar de Resoucer local)
        produtoDao.cadastrar(Adryan);
        categoriaDao.cadastrar(pessoaFisica);
        em.getTransaction().commit();//Finaliza as transações no banco de dados
        em.close(); //finalzar

    }
}

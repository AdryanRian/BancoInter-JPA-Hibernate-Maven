package br.com.BancoInter.Aplicacao;

import br.com.BancoInter.Entidades.Usuario;
import br.com.BancoInter.dao.UsuarioDao;
import br.com.BancoInter.util.JPAutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainAplicacao {
    public static void main(String[] args) {
        EntityManager em = JPAutil.getEntityManger();
//     AGORA ESTÁ NO JPA UTIL EntityManagerFactory factory = Persistence.
//                createEntityManagerFactory("BancoInterFinal");//As Linhas 10 e 9 estão mostrando como é
//        //para usar o EntityManager da linha 12

        EntityManager em = factory.createEntityManager(); //é responsável por liberar as alterações no BD.
        Usuario Adryan = new Usuario();
        Adryan.setCpf("11111111111");
        Adryan.setNome("Adryan Rian");
        Adryan.setRg("11111111");
        Adryan.setSenha("111111");
        Adryan.setTelefone("81984479047");

        Usuario Rian = new Usuario();
        Rian.setCpf("22222222222");
        Rian.setNome("Rian");
        Rian.setRg("22222222");
        Rian.setSenha("22222");
        Rian.setTelefone("81955555555");


        em.getTransaction().begin();//Avisa para o banco iniciar a transação (Não precisa se estiver em JTA no lugar de Resoucer local)
        UsuarioDao dao = new UsuarioDao(em);
        dao.cadastrar(Rian);
       // AGORA ESTÁ NA CLASSE DAOem.persist(Rian);//Adiciona no Banco
        em.getTransaction().commit();//Finaliza as transações no banco de dados
        em.close(); //finalzar

    }
}

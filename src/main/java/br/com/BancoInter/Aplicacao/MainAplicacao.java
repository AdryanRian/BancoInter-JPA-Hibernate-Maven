package br.com.BancoInter.Aplicacao;

import br.com.BancoInter.Entidades.Categoria;
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

         //é responsável por liberar as alterações no BD.
//        Usuario Adryan = new Usuario();
//        Adryan.setCpf("11111111111");
//        Adryan.setNome("Adryan Rian");
//        Adryan.setRg("11111111");
//        Adryan.setSenha("111111");
//        Adryan.setTelefone("81984479047");

        Usuario Maria = new Usuario("Maria","8195556542","000000000","00000000000",
                "000000", Categoria.PESSOA_FISICA);



        em.getTransaction().begin();//Avisa para o banco iniciar a transação (Não precisa se estiver em JTA no lugar de Resoucer local)
        UsuarioDao dao = new UsuarioDao(em);
        dao.cadastrar(Maria);
       // AGORA ESTÁ NA CLASSE DAO em.persist(Rian);//Adiciona no Banco
        em.getTransaction().commit();//Finaliza as transações no banco de dados
        em.close(); //finalzar

    }
}

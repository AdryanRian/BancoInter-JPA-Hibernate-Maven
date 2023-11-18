package br.com.BancoInter.Aplicacao;

import br.com.BancoInter.Entidades.Categoria;
import br.com.BancoInter.Entidades.Usuario;
import br.com.BancoInter.dao.CategoriaDao;
import br.com.BancoInter.dao.UsuarioDao;
import br.com.BancoInter.util.JPAutil;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class MainAplicacao {
    public static void main(String[] args) {
//        EntityManager em = JPAutil.getEntityManger();//     AGORA ESTÁ NO JPA UTIL EntityManagerFactory factory = Persistence.
//        UsuarioDao produtoDao = new UsuarioDao(em);
//        CategoriaDao categoriaDao = new CategoriaDao(em);
        Scanner scan = new Scanner(System.in);
        int menu1;

        do {

            System.out.println("Menu Inicial\n\n 1 - Entrar\n 2 - Criar Conta\n 0 - Sair\n\nDigite a sua opção: ");
            menu1 = scan.nextInt();

            switch (menu1) {
                case 1:

                    int menu1sub1;

                    do {
                        System.out.println("\nEntrar em qual tipo de conta?\n");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        System.out.println("0 - Voltar");
                        System.out.println("\nDigite a sua opção: ");

                         menu1sub1 = scan.nextInt();

                    }while (menu1sub1 != 0);
                    break;

                case 2:

                    int menu1sub2;
                    do {
                        System.out.println("\nQual tipo de conta deseja criar?\n");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        System.out.println("0 - Voltar");
                        System.out.println("\nDigite a sua opção: ");

                    menu1sub2 = scan.nextInt();
                    }while (menu1sub2 != 0);
                    break;

                case 0:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opção inválida. Tente novamente.");


            }
        }while (menu1 != 0);






//        Categoria pessoaFisica = new Categoria("Pessoa Fisica");
//
//
//        Usuario Adryan = new Usuario("Adryan Rian ","adryanrian14@gmail.com",81,"984479047",
//                "10.269.392","137.717.994-06", "123456",pessoaFisica);
//
//
//        em.getTransaction().begin();//Avisa para o banco iniciar a transação (Não precisa se estiver em JTA no lugar de Resoucer local)
//        produtoDao.cadastrar(Adryan);
//        categoriaDao.cadastrar(pessoaFisica);
//        em.getTransaction().commit();//Finaliza as transações no banco de dados
//        em.close(); //finalzar
        scan.close();

    }
}

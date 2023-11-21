package br.com.BancoInter.Aplicacao;

import br.com.BancoInter.Entidades.UsuarioPessoaFisica;
//import br.com.BancoInter.dao.CategoriaDao;
import br.com.BancoInter.Entidades.UsuarioPessoaJuridica;
import br.com.BancoInter.dao.UsuarioDao;
import br.com.BancoInter.util.JPAutil;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class MainAplicacao {
    public static void main(String[] args) {
        EntityManager em = JPAutil.getEntityManger();//     AGORA ESTÁ NO JPA UTIL EntityManagerFactory factory = Persistence.
        UsuarioDao UsuarioDao = new UsuarioDao(em);
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

                        switch (menu1sub1) {
                            case 1:

                                // FAZER O LOGIN, EDIÇÃO DE TABELA E CONFERIR A SENHA

                                System.out.println("\nDigite o seu CPF:\n");
                                System.out.println("Digite a sua senha:\n");

                                break; // MOMENTANEO

                            // MENU CONTA

                            case 2:

                                System.out.println("\nDigite o seu CNPJ:\n");
                                System.out.println("Digite a sua senha:\n");

                                break; // MOMENTANEO

                            // MENU CONTA

                            case 0:
                                break;

                            default:

                                System.out.println("\nOpção inválida. Tente novamente.\n");


                        }

                    } while (menu1sub1 != 0);
                    break;

                case 2:

                    int menu1sub2;
                    do {

                        System.out.println("========================================");
                        System.out.println("\nQual tipo de conta deseja criar?\n");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        System.out.println("0 - Voltar");
                        System.out.println("\nDigite a sua opção: ");

                        menu1sub2 = scan.nextInt();

                        switch (menu1sub2) {
                            case 1:

                                System.out.println("Crie sua conta:");

                                System.out.println("Digite o seu E-mail:\n");
                                String email = scan.next();

                                scan.nextLine();

                                System.out.println("Digite o seu Nome:\n");
                                String nome = scan.nextLine();

                                System.out.println("Digite o seu CPF:\n");
                                float cpf = scan.nextFloat();

                                System.out.println("Digite o seu DDD:\n");
                                int ddd = scan.nextInt();

                                System.out.println("Digite o seu Telefone:\n");
                                float telefone = scan.nextFloat();

                                System.out.println("Digite o seu rg:\n");
                                float rg = scan.nextFloat();


                                UsuarioPessoaFisica usuarioPessoaFisica = new UsuarioPessoaFisica(nome, email, cpf,
                                        ddd, telefone, rg);

                                em.getTransaction().begin();
                                UsuarioDao.cadastrar(usuarioPessoaFisica);
                                em.getTransaction().commit();
                                em.close();


                                break; // MOMENTANEO

                            // MENU CONTA

                            case 2:

                                System.out.println("Crie sua conta:");

                                System.out.println("Digite o E-mail da Empresa:\n");
                                email = scan.next();

                                scan.nextLine();

                                System.out.println("Digite o Nome de Registro da Empresa:\n");
                                nome = scan.nextLine();

                                scan.nextLine();

                                System.out.println("Digite o Nome Fantasia da Empresa:\n");
                                String nomeFantasia = scan.nextLine();

                                System.out.println("Digite o N° do CNPJ:\n");
                                float cnpj = scan.nextFloat();

                                System.out.println("Digite o N° da Inscrição Estadual:\n");
                                float ie = scan.nextFloat();

                                System.out.println("Digite o seu DDD:\n");
                                ddd = scan.nextInt();

                                System.out.println("Digite o seu Telefone:\n");
                                telefone = scan.nextFloat();

                                UsuarioPessoaJuridica usuarioPessoaJuridica = new UsuarioPessoaJuridica(nome,email,ddd,
                                        telefone,cnpj,nomeFantasia,ie);

                                em.getTransaction().begin();
                                UsuarioDao.cadastrar(usuarioPessoaJuridica);
                                em.getTransaction().commit();
                                em.close();

                                break; // MOMENTANEO

                            // MENU CONTA

                            case 0:
                                break;

                            default:

                                System.out.println("\nOpção inválida. Tente novamente.\n");
                        }
                    } while (menu1sub2 != 0);

                    break;

                case 0:

                    System.out.println("\nPrograma finalizado.\n");
                    break;

                default:

                    System.out.println("\nOpção inválida. Tente novamente.\n");


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

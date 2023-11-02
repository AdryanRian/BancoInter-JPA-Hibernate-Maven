package br.com.BancoInter.Entidades;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity // Avisa ao JPA que isso é uma entidade
@Table(name = "Usuarios") // O Nome da Tabela, caso não queira o nome da entidade

public class Usuario {



    private String nome;
    private String email;
    private Date dataDeNascimento;
    private String telefone;
    private String rg;
    private String cpf;
    private String senha;

    public Usuario(){

    }

    public Usuario(String nome, String email, Date dataDeNascimento,
                   String telefone, String rg, String cpf, String senha) {

        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.senha = senha;
    }
}

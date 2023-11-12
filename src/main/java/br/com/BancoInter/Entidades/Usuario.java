package br.com.BancoInter.Entidades;

import java.sql.Date;
import javax.persistence.*;


@Entity // Avisa ao JPA que isso é uma entidade
@Table(name = "Usuarios") // O Nome da Tabela, caso não queira o nome da entidade

public class Usuario {
    @Id //Define chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "Nome") // Aqui define o nome da Coluna caso queira que seja diferente
    private String nome;
    private String telefone;
    private String rg;
    private String cpf;
    private String senha;

    public Usuario(){

    }

    public Usuario(String nome, String telefone, String rg, String cpf, String senha) {

        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

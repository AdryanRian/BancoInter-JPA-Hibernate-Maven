package br.com.BancoInter.Entidades;

import javax.persistence.*;

@Entity
//@Table (name =  "Usuario PJ") ERRO
@DiscriminatorValue("Usuario PJ")
public class UsuarioPessoaJuridica extends Usuario {

    @Id
    @Column(name = "N° do CNPJ")
    private String Cnpj;
    @Column (name = "Nome Fantasia")
    private String nomeFantasia;
    @Column (name = "Inscrição Estadual")
    private String inscricaoEstadual;

    public UsuarioPessoaJuridica(String nome, String email, int DDD, String telefone, String Cnpj, String nomeFantasia
    ,String inscricaoEstadual) {
        super(nome, email, DDD, telefone);
        this.Cnpj = Cnpj;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}

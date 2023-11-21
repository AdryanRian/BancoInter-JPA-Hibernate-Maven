package br.com.BancoInter.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table (name =  "Usuario PJ")
public class UsuarioPessoaJuridica extends Usuario {

    @Id
    @Column(name = "N° do CNPJ")
    private float Cnpj;
    @Column (name = "Nome Fantasia")
    private String nomeFantasia;
    @Column (name = "Inscrição Estadual")
    private float inscricaoEstadual;

    public UsuarioPessoaJuridica(String nome, String email, int DDD, float telefone, float Cnpj, String nomeFantasia
    ,float inscricaoEstadual) {
        super(nome, email, DDD, telefone);
        this.Cnpj = Cnpj;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Float getCnpj() {
        return Cnpj;
    }

    public void setCnpj(Float cnpj) {
        Cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Float getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(Float inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}

package br.com.BancoInter.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name =  "Usuario PJ")
public class UsuarioPessoaJuridica extends Usuario {

    @Id
    @Column(name = "N° do CNPJ")
    private Float Cnpj;
    @Column (name = "Nome Fantasia")
    private String nomeFantasia;
    @Column (name = "Inscrição Estadual")
    private Float inscricaoEstadual;

    public UsuarioPessoaJuridica(String nome, String email, int DDD, String telefone, Float Cnpj, String nomeFantasia
    ,Float inscricaoEstadual) {
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

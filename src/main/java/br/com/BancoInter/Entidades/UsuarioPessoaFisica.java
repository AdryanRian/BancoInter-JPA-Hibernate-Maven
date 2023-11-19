package br.com.BancoInter.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Usuarios PF")
public class UsuarioPessoaFisica extends Usuario{

    @Column(name = "N°_Identidade")
    private String rg;
    @Column(name = "N°_Cpf")
    private String cpf;

    public UsuarioPessoaFisica(String nome, String email, int DDD, String telefone, String rg, String cpf) {
        super(nome, email, DDD, telefone);
        this.rg = rg;
        this.cpf = cpf;
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
}

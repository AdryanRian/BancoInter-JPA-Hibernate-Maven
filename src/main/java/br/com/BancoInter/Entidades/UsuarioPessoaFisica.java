package br.com.BancoInter.Entidades;

import javax.persistence.*;

@Entity
//@Table (name = "Usuarios PF") ERRO
@DiscriminatorValue("Usuario PF")
public class UsuarioPessoaFisica extends Usuario{

    @Column(name = "N°_Identidade")
    private String rg;
    @Column(name = "N°_Cpf")
    private String cpf;

    public UsuarioPessoaFisica(String nome, String email, String cpf, int DDD, String telefone, String rg) {
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

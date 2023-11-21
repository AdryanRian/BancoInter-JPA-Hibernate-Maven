package br.com.BancoInter.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table (name = "Usuarios PF")
public class UsuarioPessoaFisica extends Usuario{

    @Column(name = "N°_Identidade")
    private float rg;
    @Column(name = "N°_Cpf")
    private float cpf;

    public UsuarioPessoaFisica(String nome, String email, float cpf, int DDD, float telefone, float rg) {
        super(nome, email, DDD, telefone);
        this.rg = rg;
        this.cpf = cpf;
    }


    public float getRg() {
        return rg;
    }

    public void setRg(float rg) {
        this.rg = rg;
    }

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }
}

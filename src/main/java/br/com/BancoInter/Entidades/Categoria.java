package br.com.BancoInter.Entidades;

//public enum Categoria {
//
//    TRABALHADOR,
//    PESSOA_FISICA,
//    PESSOA_JURIDICA;
//}

import javax.persistence.*;


@Entity
@Table (name = "Categorias")
public class Categoria {

    @Id //Define chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

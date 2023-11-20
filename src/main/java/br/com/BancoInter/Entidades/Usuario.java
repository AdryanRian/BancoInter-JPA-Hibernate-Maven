package br.com.BancoInter.Entidades;

import java.time.LocalDate;
import javax.persistence.*;


@Entity // Avisa ao JPA que isso é uma entidade
@Table(name = "Usuarios") // O Nome da Tabela, caso não queira o nome da entidade

public class Usuario {
    @Id //Define chave primária
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "Nome") // Aqui define o nome da Coluna caso queira que seja diferente
    private String nome;
    @Column(name = "Email")
    private String email;
    private int DDD;
    @Column(name = "Contato")
    private float telefone;
    private String senha;
    @Column(name = "Dia_de_Cadastro")
    private final LocalDate dataCadastro = LocalDate.now();
    //@Enumerated (EnumType.STRING) // Passa o nome do enum e o ORIGNAL passa a posição
//    @OneToOne
//    private Categoria categoria;





    public Usuario(String nome,String email,int DDD, float telefone) {

        this.nome = nome;
        this.email = email;
        this.DDD = DDD;
        this.telefone = telefone;
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

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }



    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }
}

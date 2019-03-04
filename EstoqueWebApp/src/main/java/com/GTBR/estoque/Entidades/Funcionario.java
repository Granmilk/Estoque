package com.GTBR.Estoque.Entidades;


import javax.persistence.*;

@Entity
@Table(name="funcionario", schema = "public")
public class Funcionario {

    @Id
    @SequenceGenerator(name="sq_id_funcionario", sequenceName = "public.sq_id_funcionario")
    @GeneratedValue(generator = "sq_id_funcionario", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_funcionario", nullable = false)
    private Long idFuncionario;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "senha", nullable = false)
    private String senha;


    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



}

package com.GTBR.Estoque.Entidades;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="produto", schema = "public")
public class Produto {

    @Id
    @SequenceGenerator(name="sq_id_funcionario", sequenceName = "public.sq_id_funcionario")
    @GeneratedValue(generator = "sq_id_funcionario", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_funcionario", nullable = false)
    private Long idProduto;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "codigo", nullable = false)
    private Long codigo;

    @Column(name = "preco_do_produto", nullable = false)
    private Double precoDoProduto;

    @Column(name = "data_de_estoque", nullable = false)
    private Date dataDeEstoque;




    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(Double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public Date getDataDeEstoque() {
        return dataDeEstoque;
    }

    public void setDataDeEstoque(Date dataDeEstoque) {
        this.dataDeEstoque = dataDeEstoque;
    }
}

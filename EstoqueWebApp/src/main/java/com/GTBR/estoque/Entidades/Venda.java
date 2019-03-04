package com.GTBR.Estoque.Entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="venda", schema = "public")
public class Venda {

    @Id
    @SequenceGenerator(name="sq_id_venda", sequenceName = "public.sq_id_venda")
    @GeneratedValue(generator = "sq_id_venda", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_venda", nullable = false)
    private Long idVenda;

    @Column(name = "id_funcionario", nullable = false)
    private Long idFuncionario;
        @ManyToOne(fetch=FetchType.LAZY)
            @JoinColumn(name = "id_funcionario", insertable = false, updatable = false, foreignKey = @ForeignKey(name="fk_venda_id_funcionario"))
            private Funcionario funcionario;

    @Column(name = "id_produto", nullable = false)
    private Long idProduto;
        @ManyToOne(fetch=FetchType.LAZY)
            @JoinColumn(name = "id_produto", insertable = false, updatable = false, foreignKey = @ForeignKey(name="fk_venda_id_produto"))
            private Produto produto;

    @Column(name = "valor_da_venda", nullable = false)
    private Double valorDaVenda;

    @Column(name = "data_da_venda", nullable = false)
    private Date dataDaVenda;





    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(Double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    /*Getter e setters das FKs*/
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}



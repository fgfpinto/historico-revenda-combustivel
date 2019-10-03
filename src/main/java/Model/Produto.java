package Model;

import java.util.Date;

public class Produto {
    //atributos
    private Date dataDaColeta;
    private String codigoProduto;
    private String nomeProduto;
    private Double valorDeCompra;
    private Double valorDeVenda;

    //metodos
    
    public Produto(Date dataDaColeta, String codigoProduto, String nomeProduto, Double valorDeCompra, Double valorDeVenda) {
        this.dataDaColeta = dataDaColeta;
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.valorDeCompra = valorDeCompra;
        this.valorDeVenda = valorDeVenda;
    }

    //construtor
    public Produto(){}

    //Retorna o dado isolado da Data da Coleta
    public Date getDataDaColeta() {
        return dataDaColeta;
    }

    //Altera isoladamente a Data da Coleta
    public void setDataDaColeta(Date dataDaColeta) {
        this.dataDaColeta = dataDaColeta;
    }

    //Retorna o dado isolado do Codigo do Produto
    public String getCodigoProduto() {
        return codigoProduto;
    }

    //Altera isoladamente o Código do Produto
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    //Retorna o dado isolado do Nome do Produto
    public String getNomeProduto() {
        return nomeProduto;
    }

    //Altera isoladamente o Nome do Produto
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    //Retorna o dado isolado do Valor de Compra
    public Double getValorDeCompra() {
        return valorDeCompra;
    }

    //Altera isoladamente o Valor de Compra
    public void setValorDeCompra(Double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    //Retorna o dado isolado do Valor de Venda
    public Double getValorDeVenda() {
        return valorDeVenda;
    }
    //Altera isoladamente o Valor de Venda
    public void setValorDeVenda(Double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }
}

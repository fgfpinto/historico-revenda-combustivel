package Model;

import java.util.Date;

public class PlaceHolder {
    
    //atributos
    private String regiao;
    private String siglaEstado;
    private String siglaMunicipio;
    private String revendaInstalacao;
    private String codigoProduto;
    private String nomeProduto;
    private String unidadeDeMedida;
    private String bandeira;
    private Double valorDeCompra;
    private Double valorDeVenda;
    private Date dataDaColeta;

    //metodos
    
    //Retorna o dado isolado da Regiao
    public String getRegiao() {
        return regiao;
    }

    //Atribui isoladamente o dado Regiao
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    //Retorna o dado isolado da sigla do estado
    public String getSiglaEstado() {
        return siglaEstado;
    }

    //Atribui isoladamente o dado da sigla Estado
    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    //Retorna o dado isolado do Municipio
    public String getSiglaMunicipio() {
        return siglaMunicipio;
    }

    //Atribui isoladamente o dado Municipio
    public void setSiglaMunicipio(String siglaMunicipio) {
        this.siglaMunicipio = siglaMunicipio;
    }

    //Retorna o dado isolado da Revenda
    public String getRevendaInstalacao() {
        return revendaInstalacao;
    }

    //Atribui isoladamente o dado Revenda
    public void setRevendaInstalacao(String revendaInstalacao) {
        this.revendaInstalacao = revendaInstalacao;
    }

    //Retorna o dado isolado do codigo do produto
    public String getCodigoProduto() {
        return codigoProduto;
    }

    //Atribui isoladamente o dado Codigo do produto
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    //Retorna o dado isolado do nome do produto
    public String getNomeProduto() {
        return nomeProduto;
    }

    //Atribui isoladamente o dado Nome do Produto
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    //Retorna o dado isolado da unidade de medida
    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    //Atribui isoladamente o dado unidade de medida
    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    //Retorna o dado isolado da Bandeira
    public String getBandeira() {
        return bandeira;
    }

    //Atribui isoladamente o dado Bandeira
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    //Retorna o dado isolado do Valor de compra
    public Double getValorDeCompra() {
        return valorDeCompra;
    }

    //Atribui isoladamente o dado Valor de compra
    public void setValorDeCompra(Double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    //Retorna o dado isolado do Valor de venda
    public Double getValorDeVenda() {
        return valorDeVenda;
    }

    //Atribui isoladamente o dado Valor de venda
    public void setValorDeVenda(Double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }
    
    //Retorna o dado isolado da data da coleta
    public Date getDataDaColeta() {
        return dataDaColeta;
    }

    //Atribui isoladamente o dado data da coleta
    public void setDataDaColeta(Date dataDaColeta) {
        this.dataDaColeta = dataDaColeta;
    }
}

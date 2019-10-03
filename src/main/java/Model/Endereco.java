package Model;

public class Endereco {
   //atributos
    private String regiao;
    private String siglaEstado;
    private String siglaMunicipio;
    
    //metodos
    public Endereco(String regiao, String siglaEstado, String siglaMunicipio) {
        this.regiao = regiao;
        this.siglaEstado = siglaEstado;
        this.siglaMunicipio = siglaMunicipio;
    }
    //Construtor
    public Endereco(){}
   
    //Retorna o dado isolado da Regiao
    public String getRegiao() {
        return regiao;
    }
    
    //Atribui isoladamente o dado de Regiao
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    
    //Retorna o dado isolado do Estado
    public String getSiglaEstado() {
        return siglaEstado;
    }

    //Atribui isoladamente o dado Estado
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
}

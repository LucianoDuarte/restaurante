package model;

import java.math.BigDecimal;

/**
*
* @author Luciano
*/
public class ModelCliente {

    private int cliId;
    private String cliTelefone;
    private String cliNome;
    private String cliCpfCnpj;
    private String cliEmail;
    private String cliObservacao;
    private String cliEndereco;
    private String cliNumero;
    private String cliComplemento;
    private String cliBairro;
    private String cliCidade;
    private String cliEstado;
    private String cliCep;
    private BigDecimal cliTaxaEntrega;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de cliId
    * @param pCliId
    */
    public void setCliId(int pCliId){
        this.cliId = pCliId;
    }
    /**
    * return cliId
    */
    public int getCliId(){
        return this.cliId;
    }

    /**
    * seta o valor de cliTelefone
    * @param pCliTelefone
    */
    public void setCliTelefone(String pCliTelefone){
        this.cliTelefone = pCliTelefone;
    }
    /**
    * return cliTelefone
    */
    public String getCliTelefone(){
        return this.cliTelefone;
    }

    /**
    * seta o valor de cliNome
    * @param pCliNome
    */
    public void setCliNome(String pCliNome){
        this.cliNome = pCliNome;
    }
    /**
    * return cliNome
    */
    public String getCliNome(){
        return this.cliNome;
    }

    /**
    * seta o valor de cliCpfCnpj
    * @param pCliCpfCnpj
    */
    public void setCliCpfCnpj(String pCliCpfCnpj){
        this.cliCpfCnpj = pCliCpfCnpj;
    }
    /**
    * return cliCpfCnpj
    */
    public String getCliCpfCnpj(){
        return this.cliCpfCnpj;
    }

    /**
    * seta o valor de cliEmail
    * @param pCliEmail
    */
    public void setCliEmail(String pCliEmail){
        this.cliEmail = pCliEmail;
    }
    /**
    * return cliEmail
    */
    public String getCliEmail(){
        return this.cliEmail;
    }

    /**
    * seta o valor de cliObservacao
    * @param pCliObservacao
    */
    public void setCliObservacao(String pCliObservacao){
        this.cliObservacao = pCliObservacao;
    }
    /**
    * return cliObservacao
    */
    public String getCliObservacao(){
        return this.cliObservacao;
    }

    /**
    * seta o valor de cliEndereco
    * @param pCliEndereco
    */
    public void setCliEndereco(String pCliEndereco){
        this.cliEndereco = pCliEndereco;
    }
    /**
    * return cliEndereco
    */
    public String getCliEndereco(){
        return this.cliEndereco;
    }

    /**
    * seta o valor de cliNumero
    * @param pCliNumero
    */
    public void setCliNumero(String pCliNumero){
        this.cliNumero = pCliNumero;
    }
    /**
    * return cliNumero
    */
    public String getCliNumero(){
        return this.cliNumero;
    }

    /**
    * seta o valor de cliComplemento
    * @param pCliComplemento
    */
    public void setCliComplemento(String pCliComplemento){
        this.cliComplemento = pCliComplemento;
    }
    /**
    * return cliComplemento
    */
    public String getCliComplemento(){
        return this.cliComplemento;
    }

    /**
    * seta o valor de cliBairro
    * @param pCliBairro
    */
    public void setCliBairro(String pCliBairro){
        this.cliBairro = pCliBairro;
    }
    /**
    * return cliBairro
    */
    public String getCliBairro(){
        return this.cliBairro;
    }

    /**
    * seta o valor de cliCidade
    * @param pCliCidade
    */
    public void setCliCidade(String pCliCidade){
        this.cliCidade = pCliCidade;
    }
    /**
    * return cliCidade
    */
    public String getCliCidade(){
        return this.cliCidade;
    }

    /**
    * seta o valor de cliEstado
    * @param pCliEstado
    */
    public void setCliEstado(String pCliEstado){
        this.cliEstado = pCliEstado;
    }
    /**
    * return cliEstado
    */
    public String getCliEstado(){
        return this.cliEstado;
    }

    /**
    * seta o valor de cliCep
    * @param pCliCep
    */
    public void setCliCep(String pCliCep){
        this.cliCep = pCliCep;
    }
    /**
    * return cliCep
    */
    public String getCliCep(){
        return this.cliCep;
    }

    /**
    * seta o valor de cliTaxaEntrega
    * @param pCliTaxaEntrega
    */
    public void setCliTaxaEntrega(BigDecimal pCliTaxaEntrega){
        this.cliTaxaEntrega = pCliTaxaEntrega;
    }
    /**
    * return cliTaxaEntrega
    */
    public BigDecimal getCliTaxaEntrega(){
        return this.cliTaxaEntrega;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::cliId = " + this.cliId + "::cliTelefone = " + this.cliTelefone + "::cliNome = " + this.cliNome + "::cliCpfCnpj = " + this.cliCpfCnpj + "::cliEmail = " + this.cliEmail + "::cliObservacao = " + this.cliObservacao + "::cliEndereco = " + this.cliEndereco + "::cliNumero = " + this.cliNumero + "::cliComplemento = " + this.cliComplemento + "::cliBairro = " + this.cliBairro + "::cliCidade = " + this.cliCidade + "::cliEstado = " + this.cliEstado + "::cliCep = " + this.cliCep + "::cliTaxaEntrega = " + this.cliTaxaEntrega +  "}";
    }
}
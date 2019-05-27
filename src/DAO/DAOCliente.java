package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Luciano
*/
public class DAOCliente extends ConexaoMySql {

    /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente ("            
                    + "cli_telefone,"
                    + "cli_nome,"
                    + "cli_cpf_cnpj,"
                    + "cli_email,"
                    + "cli_observacao,"
                    + "cli_endereco,"
                    + "cli_numero,"
                    + "cli_complemento,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_estado,"
                    + "cli_cep,"
                    + "cli_taxa_entrega"
                + ") VALUES ("
                    + "'" + pModelCliente.getCliId() + "',"
                    + "'" + pModelCliente.getCliTelefone() + "',"
                    + "'" + pModelCliente.getCliNome() + "',"
                    + "'" + pModelCliente.getCliCpfCnpj() + "',"
                    + "'" + pModelCliente.getCliEmail() + "',"
                    + "'" + pModelCliente.getCliObservacao() + "',"
                    + "'" + pModelCliente.getCliEndereco() + "',"
                    + "'" + pModelCliente.getCliNumero() + "',"
                    + "'" + pModelCliente.getCliComplemento() + "',"
                    + "'" + pModelCliente.getCliBairro() + "',"
                    + "'" + pModelCliente.getCliCidade() + "',"
                    + "'" + pModelCliente.getCliEstado() + "',"
                    + "'" + pModelCliente.getCliCep() + "',"
                    + "'" + pModelCliente.getCliTaxaEntrega() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Cliente
    * @param pCliId
    * return ModelCliente
    */
    public ModelCliente getClienteDAO(int pCliId){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "cli_id,"
                    + "cli_telefone,"
                    + "cli_nome,"
                    + "cli_cpf_cnpj,"
                    + "cli_email,"
                    + "cli_observacao,"
                    + "cli_endereco,"
                    + "cli_numero,"
                    + "cli_complemento,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_estado,"
                    + "cli_cep,"
                    + "cli_taxa_entrega"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " cli_id = '" + pCliId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCliId(this.getResultSet().getInt(1));
                modelCliente.setCliTelefone(this.getResultSet().getString(2));
                modelCliente.setCliNome(this.getResultSet().getString(3));
                modelCliente.setCliCpfCnpj(this.getResultSet().getString(4));
                modelCliente.setCliEmail(this.getResultSet().getString(5));
                modelCliente.setCliObservacao(this.getResultSet().getString(6));
                modelCliente.setCliEndereco(this.getResultSet().getString(7));
                modelCliente.setCliNumero(this.getResultSet().getString(8));
                modelCliente.setCliComplemento(this.getResultSet().getString(9));
                modelCliente.setCliBairro(this.getResultSet().getString(10));
                modelCliente.setCliCidade(this.getResultSet().getString(11));
                modelCliente.setCliEstado(this.getResultSet().getString(12));
                modelCliente.setCliCep(this.getResultSet().getString(13));
                modelCliente.setCliTaxaEntrega(this.getResultSet().getBigDecimal(14));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "cli_id,"
                    + "cli_telefone,"
                    + "cli_nome,"
                    + "cli_cpf_cnpj,"
                    + "cli_email,"
                    + "cli_observacao,"
                    + "cli_endereco,"
                    + "cli_numero,"
                    + "cli_complemento,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_estado,"
                    + "cli_cep,"
                    + "cli_taxa_entrega"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setCliId(this.getResultSet().getInt(1));
                modelCliente.setCliTelefone(this.getResultSet().getString(2));
                modelCliente.setCliNome(this.getResultSet().getString(3));
                modelCliente.setCliCpfCnpj(this.getResultSet().getString(4));
                modelCliente.setCliEmail(this.getResultSet().getString(5));
                modelCliente.setCliObservacao(this.getResultSet().getString(6));
                modelCliente.setCliEndereco(this.getResultSet().getString(7));
                modelCliente.setCliNumero(this.getResultSet().getString(8));
                modelCliente.setCliComplemento(this.getResultSet().getString(9));
                modelCliente.setCliBairro(this.getResultSet().getString(10));
                modelCliente.setCliCidade(this.getResultSet().getString(11));
                modelCliente.setCliEstado(this.getResultSet().getString(12));
                modelCliente.setCliCep(this.getResultSet().getString(13));
                modelCliente.setCliTaxaEntrega(this.getResultSet().getBigDecimal(14));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "cli_id = '" + pModelCliente.getCliId() + "',"
                    + "cli_telefone = '" + pModelCliente.getCliTelefone() + "',"
                    + "cli_nome = '" + pModelCliente.getCliNome() + "',"
                    + "cli_cpf_cnpj = '" + pModelCliente.getCliCpfCnpj() + "',"
                    + "cli_email = '" + pModelCliente.getCliEmail() + "',"
                    + "cli_observacao = '" + pModelCliente.getCliObservacao() + "',"
                    + "cli_endereco = '" + pModelCliente.getCliEndereco() + "',"
                    + "cli_numero = '" + pModelCliente.getCliNumero() + "',"
                    + "cli_complemento = '" + pModelCliente.getCliComplemento() + "',"
                    + "cli_bairro = '" + pModelCliente.getCliBairro() + "',"
                    + "cli_cidade = '" + pModelCliente.getCliCidade() + "',"
                    + "cli_estado = '" + pModelCliente.getCliEstado() + "',"
                    + "cli_cep = '" + pModelCliente.getCliCep() + "',"
                    + "cli_taxa_entrega = '" + pModelCliente.getCliTaxaEntrega() + "'"
                + " WHERE "
                    + "cli_id = '" + pModelCliente.getCliId() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Cliente
    * @param pCliId
    * return boolean
    */
    public boolean excluirClienteDAO(int pCliId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "cli_id = '" + pCliId + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}
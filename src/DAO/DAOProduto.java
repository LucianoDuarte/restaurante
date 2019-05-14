/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.ConexaoMySql;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import model.ModelProduto;

/**
 *
 * @author FLUFG
 */
public class DAOProduto extends ConexaoMySql {

    public int salvarProdutoDAO(ModelProduto pModelProduto) {

        try {
            this.conectar();

            return this.insertSQL("INSERT INTO tbl_produto (pro_nome, pro_valor_custo, pro_valor_venda, pro_estoque) VALUES ('" + pModelProduto.getNome() + "', '" + pModelProduto.getValorCusto() + "', '" + pModelProduto.getValorVenda() + "', '" + pModelProduto.getEstoque() + "');");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Deu Pau");
            return 0;
        } finally {

            this.fecharConexao();

        }

    }

    public ArrayList<ModelProduto> retornarProdutosDAO() {

        ModelProduto modelProduto = new ModelProduto();
        ArrayList<ModelProduto> listaModelProdutos = new ArrayList<>();

        try {
            this.conectar();

            this.executarSQL("SELECT * FROM tbl_produto;");

            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setValorCusto(this.getResultSet().getBigDecimal(3));
                modelProduto.setValorVenda(this.getResultSet().getBigDecimal(4));
                modelProduto.setEstoque(this.getResultSet().getInt(5));

                listaModelProdutos.add(modelProduto);

            }

        } catch (Exception e) {

            System.out.println(e);
        } finally {

            this.fecharConexao();
        }
        return listaModelProdutos;
    }

    public boolean excluirProdutoDAO(int codigo) {

        try {
            this.conectar();

            return this.executarUpdateDeleteSQL("DELETE FROM tbl_produto where pro_id='" + codigo + "'");

        } catch (Exception e) {

            System.out.println(e);
            return false;
        } finally {

            this.fecharConexao();
        }
    }

    public ModelProduto retornarProdutoDAO(int codigo) {

        ModelProduto modelProduto = new ModelProduto();

        try {
            this.conectar();

            this.executarSQL("select * from tbl_produto where pro_id='" + codigo + "'");

            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setValorCusto(this.getResultSet().getBigDecimal(3));
                modelProduto.setValorVenda(this.getResultSet().getBigDecimal(4));
                modelProduto.setEstoque(this.getResultSet().getInt(5));

            }

        } catch (Exception e) {

            System.out.print(e);
        } finally {

            this.fecharConexao();
        }
        return modelProduto;
    }

    public boolean atualizarProdutoDAO(ModelProduto modelProduto) {
      
        
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("update tbl_produto  set pro_nome ='"+modelProduto.getNome()+"', pro_valor_custo='"+modelProduto.getValorCusto()+"', pro_valor_venda='"+modelProduto.getValorVenda()+"', pro_estoque='"+modelProduto.getEstoque()+"'");
            
        } catch (Exception e) {
          
            System.out.println("DAO.DAOProduto.atualizarProdutoDAO()");
           return false;
        }
        
        finally{
            
            this.fecharConexao();
        }
        
    }

}// fechamento da classe 


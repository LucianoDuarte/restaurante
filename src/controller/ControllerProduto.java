/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProduto;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author FLUFG
 */
public class ControllerProduto {
    
    private DAOProduto dAOProduto = new DAOProduto();
    

    public int salvarProdutoController (ModelProduto pModelProduto){
        
        return this.dAOProduto.salvarProdutoDAO(pModelProduto);
    }

    public ArrayList<ModelProduto> retornarProdutosController() {
        return this.dAOProduto.retornarProdutosDAO();
    }

    public boolean excluirProdutoController(int codigo) {
        return this.dAOProduto.excluirProdutoDAO(codigo);
    }

    public ModelProduto retornarProdutoController(int codigo) {
       return this.dAOProduto.retornarProdutoDAO(codigo);
    }

    public boolean atualizarProdutoController(ModelProduto modelProduto) {
        return this.dAOProduto.atualizarProdutoDAO(modelProduto);
    }
    
   
}

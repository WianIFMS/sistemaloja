/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.app.produtos.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.app.produtos.datamodel.Produto;

/**
 *
 * @author Wian Clodoaldo
 */
public class ProdutoDAO extends GenericDAO<Produto>{
      
    public ProdutoDAO() {
        super(Produto.class);
    }
      
   
}

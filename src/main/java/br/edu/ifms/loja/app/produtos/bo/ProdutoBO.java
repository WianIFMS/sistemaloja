/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.app.produtos.bo;

import br.edu.ifms.loja.app.produtos.dao.ProdutoDAO;
import br.edu.ifms.loja.app.produtos.datamodel.Produto;
import br.edu.ifms.loja.fornecedor.dao.FornecedorDAO;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author Wian Clodoaldo
 */
public class ProdutoBO extends GenericCRUDModel<Produto> {

    private FornecedorDAO fornecedorDao;
    private ProdutoDAO dao;
    
    public ProdutoBO(){
        dao = new ProdutoDAO();
        fornecedorDao = new FornecedorDAO();
    }
    public List<Fornecedor> listarFornecedores(){
        return fornecedorDao.listarTodos();
    }

    @Override
    public void salvarEmBaseDeDados(Produto t) {
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Produto t) {
       dao.remover(t);
    }

    @Override
    public List<Produto> carregarLista() {
        return dao.listarTodos();
    }

    @Override
    public List<Produto> buscar(String string, String string1) {
        return new ArrayList<Produto>();
    }

}

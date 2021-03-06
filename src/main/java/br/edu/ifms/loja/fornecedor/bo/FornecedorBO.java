/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedor.bo;

import br.edu.ifms.loja.cidade.dao.CidadeDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.fornecedor.dao.FornecedorDAO;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
import br.edu.ifms.loja.uf.dao.UfDAO;
import br.edu.ifms.loja.uf.datamodel.Uf;
import java.util.ArrayList;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author Wian Clodoaldo
 */
public class FornecedorBO extends GenericCRUDModel<Fornecedor> {

    private UfDAO ufDao;
    private CidadeDAO cidadeDao;
    private FornecedorDAO dao;

    public FornecedorBO() {
        dao = new FornecedorDAO();
        ufDao = new UfDAO();
        cidadeDao = new CidadeDAO();
        preencherLista(dao.listarTodos());
    }

    public List<Uf> listarUfs() {
        return ufDao.listarTodos();
    }

    public List<Cidade> listarCidadesPorUf(Uf uf) {
        return cidadeDao.listarCidadesPorUf(uf);
    }

    @Override
    public void salvarEmBaseDeDados(Fornecedor t) {
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Fornecedor t) {
        dao.remover(t);
    }

    @Override
    public List<Fornecedor> carregarLista() {
         return dao.listarTodos();
    }

    @Override
    public List<Fornecedor> buscar(String string, String string1) {
        return new ArrayList<Fornecedor>();
    }

}

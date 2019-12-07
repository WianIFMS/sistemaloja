/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.app.produtos.bo;

import br.edu.ifms.loja.app.produtos.datamodel.Produto;
import br.edu.ifms.loja.app.produtos.view.ProdutoForm;
import br.edu.ifms.loja.app.produtos.view.ProdutoView;
import br.edu.ifms.loja.fornecedor.bo.FornecedorBO;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;

import br.edu.ifms.loja.fornecedor.view.FornecedorView;

import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author Wian Clodoaldo
 */
public class ProdutoController extends GenericCRUDController<Produto> {

    private ProdutoView view;
    private ProdutoBO model;

    public ProdutoController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
        this.view = (ProdutoView) view;
        this.model = (ProdutoBO) model;
        carregarFornecedores();
        inicializarAcoesComboBox();
    }

    private void carregarFornecedores() {
        ProdutoForm form = (ProdutoForm) view.getFormulario();
        form.getComboFornecedor().removeAllItems();
        for(Fornecedor fornecedor : model.listarFornecedores()) {
            form.getComboFornecedor().addItem(fornecedor);
        }
    }

    private void inicializarAcoesComboBox() {
        ProdutoForm form = (ProdutoForm) view.getFormulario();
        form.getComboFornecedor().addActionListener((evt) -> {
            carregarFornecedores();
        });
    }

    @Override
    public void dadosViewParaModel(Produto t, JPanel pnl) {
        ProdutoForm form = (ProdutoForm) pnl;
        t.setDescricao(form.getCampoDescricao().getText());
        t.setMarca(form.getCampoMarca().getText());
        t.setModelo(form.getCampoModelo().getText());
        t.setQuantidade(new Integer(form.getCampoQuanridade().getText()));
        t.setValor(new Double(form.getCampoValor().getText()));
        t.setNomeFatasia((Fornecedor) form.getComboFornecedor().getSelectedItem());
    }

    @Override
    public void dadosModelParaView(Produto t, JPanel pnl) {
        ProdutoForm form = (ProdutoForm) pnl;
        form.getCampoDescricao().setText(t.getDescricao());
        form.getCampoMarca().setText(t.getMarca());
        form.getCampoModelo().setText(t.getModelo());
        form.getCampoQuanridade().setText(Integer.toString(t.getQuantidade()));
        form.getCampoValor().setText(Double.toString(t.getValor()));
        if (t.getNomeFatasia() == null) {
            return;
        }
        form.getComboFornecedor().setSelectedItem(t.getNomeFatasia().getId());
    }

}

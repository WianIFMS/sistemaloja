/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedor.bo;

import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
import br.edu.ifms.loja.fornecedor.view.FornecedorForm;
import br.edu.ifms.loja.fornecedor.view.FornecedorView;
import br.edu.ifms.loja.uf.datamodel.Uf;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author Wian Clodoaldo
 */
public class FornecedorController extends GenericCRUDController<Fornecedor> {

    private FornecedorView view;
    private FornecedorBO model;

    public FornecedorController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
        this.view = (FornecedorView) view;
        this.model = (FornecedorBO) model;
        carregarUFs();
        inicializarAcoesComboBox();
    }

    public void inicializarAcoesComboBox() {
        FornecedorForm form = (FornecedorForm) view.getFormulario();
        form.getComboUf().addActionListener((evt) -> {
            carregarCidades();
        });
    }

    public void carregarUFs() {
        FornecedorForm form = (FornecedorForm) view.getFormulario();
        form.getComboUf().removeAllItems();
        for (Uf uf : model.listarUfs()) {
            form.getComboUf().addItem(uf);
        }
    }

    public void carregarCidades() {
        FornecedorForm form = (FornecedorForm) view.getFormulario();
        Uf uf = (Uf) form.getComboUf().getSelectedItem();
        form.getComboCidade().removeAllItems();
        if (uf == null) {
            return;
        }
        for (Cidade cidade : model.listarCidadesPorUf(uf)) {
            form.getComboCidade().addItem(cidade);
        }
    }

    @Override
    public void dadosViewParaModel(Fornecedor t, JPanel pnl) {
        FornecedorForm form = (FornecedorForm) pnl;
        t.setNomeFatasia(form.getCampoNomeFantasia().getText());
        t.setRazaoSocial(form.getCampoRazaoSocial().getText());
        t.setCnpj(form.getCampoCnpj().getText());
        t.setTelefone(form.getCampoTelefone().getText());
        t.setEmail(form.getCampoEmail().getText());
        t.setCep(form.getCampoCep().getText());
        t.setEndereco(form.getCampoEndereco().getText());
        t.setNumero(form.getCampoNumero().getText());
        t.setCidade((Cidade) form.getComboCidade().getSelectedItem());
    }

    @Override
    public void dadosModelParaView(Fornecedor t, JPanel pnl) {
        FornecedorForm form = (FornecedorForm) pnl;
        form.getCampoNomeFantasia().setText(t.getNomeFatasia());
        form.getCampoRazaoSocial().setText(t.getRazaoSocial());
        form.getCampoCnpj().setText(t.getCnpj());
        form.getCampoTelefone().setText(t.getTelefone());
        form.getCampoEmail().setText(t.getEmail());
        form.getCampoCep().setText(t.getCep());
        form.getCampoEndereco().setText(t.getEndereco());
        form.getCampoNumero().setText(t.getNumero());
         if (t.getCidade() == null) {
            return;
        }
        form.getComboUf().setSelectedItem(t.getCidade().getUf());
        form.getComboCidade().setSelectedItem(t.getCidade());
    }

 

}

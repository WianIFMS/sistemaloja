/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.app.produtos.view;

import javax.swing.JDialog;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author Wian Clodoaldo
 */
public class ProdutoView extends GenericCRUDView{
private JDialog janela; 
    public ProdutoView(JPanel formulario) {
        super(formulario);
         janela = new JDialog();
        janela.setModal(true);
        janela.add(this);
        janela.setSize(500, 400);
        janela.setTitle("Produtos");
    }

    @Override
    public String[] configurarCamposDeBusca() {
        return new String[0];
    }
     public void setVisible(boolean b){
        janela.setVisible(b);
    }
    
}

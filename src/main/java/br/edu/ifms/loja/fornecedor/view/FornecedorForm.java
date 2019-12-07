/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedor.view;

import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.uf.datamodel.Uf;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Wian Clodoaldo
 */
public class FornecedorForm extends javax.swing.JPanel {

    /**
     * Creates new form FornecedorForm
     */
    public FornecedorForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNomeFantasia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoRazaoSocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoCnpj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoCep = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboCidade = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        comboUf = new javax.swing.JComboBox<>();

        jLabel1.setText("Nome Fantasia: ");

        campoNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeFantasiaActionPerformed(evt);
            }
        });

        jLabel2.setText("Razão Social: ");

        campoRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRazaoSocialActionPerformed(evt);
            }
        });

        jLabel3.setText("CNPJ: ");

        campoCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCnpjActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone: ");

        jLabel5.setText("Email: ");

        jLabel6.setText("CEP: ");

        jLabel7.setText("Endereço: ");

        jLabel9.setText("Numero: ");

        jLabel11.setText("Cidade: ");

        jLabel12.setText("UF: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoNomeFantasia)
                        .addComponent(campoRazaoSocial)
                        .addComponent(campoCnpj)
                        .addComponent(campoTelefone)
                        .addComponent(campoEmail)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(campoEndereco)
                                .addComponent(campoCep))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboUf, javax.swing.GroupLayout.Alignment.LEADING, 0, 277, Short.MAX_VALUE)
                        .addComponent(comboCidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(comboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeFantasiaActionPerformed

    private void campoRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRazaoSocialActionPerformed

    private void campoCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCnpjActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCnpj;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNomeFantasia;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRazaoSocial;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JComboBox<Cidade> comboCidade;
    private javax.swing.JComboBox<Uf> comboUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public JTextField getCampoCep() {
        return campoCep;
    }

    public void setCampoCep(JTextField campoCep) {
        this.campoCep = campoCep;
    }

    public JTextField getCampoCnpj() {
        return campoCnpj;
    }

    public void setCampoCnpj(JTextField campoCnpj) {
        this.campoCnpj = campoCnpj;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JTextField getCampoEndereco() {
        return campoEndereco;
    }

    public void setCampoEndereco(JTextField campoEndereco) {
        this.campoEndereco = campoEndereco;
    }

    public JTextField getCampoNomeFantasia() {
        return campoNomeFantasia;
    }

    public void setCampoNomeFantasia(JTextField campoNomeFantasia) {
        this.campoNomeFantasia = campoNomeFantasia;
    }

    public JTextField getCampoNumero() {
        return campoNumero;
    }

    public void setCampoNumero(JTextField campoNumero) {
        this.campoNumero = campoNumero;
    }

    public JTextField getCampoRazaoSocial() {
        return campoRazaoSocial;
    }

    public void setCampoRazaoSocial(JTextField campoRazaoSocial) {
        this.campoRazaoSocial = campoRazaoSocial;
    }

    public JTextField getCampoTelefone() {
        return campoTelefone;
    }

    public void setCampoTelefone(JTextField campoTelefone) {
        this.campoTelefone = campoTelefone;
    }

    public JComboBox<Cidade> getComboCidade() {
        return comboCidade;
    }

    public void setComboCidade(JComboBox<Cidade> comboCidade) {
        this.comboCidade = comboCidade;
    }
     public JComboBox<Uf> getComboUf() {
        return comboUf;
    }

    public void setComboUf(JComboBox<Uf> comboUf) {
        this.comboUf = comboUf;
    }

}

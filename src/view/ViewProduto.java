/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProduto;
import util.BLFormatador;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import model.ModelProduto;

/**
 *
 * @author FLUFG
 */
public class ViewProduto extends javax.swing.JFrame {

    ModelProduto modelProduto = new ModelProduto();
    ControllerProduto controllerProduto = new ControllerProduto();

    ArrayList<ModelProduto> listaModelProdutos = new ArrayList<>();
    String salvarAlterar = "salvar";
     BLFormatador bFormatador = new BLFormatador();
   

    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        carregarProdutos();
        jtfCodigo.setEditable(false);
        jtfCodigo.setFocusable(false);
      

    }

    private void carregarProdutos() {
        listaModelProdutos = controllerProduto.retornarProdutosController();

        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);
        

        int cont = listaModelProdutos.size();

        for (int i = 0; i < cont; i++) {

            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getId(),
                listaModelProdutos.get(i).getNome(),
                listaModelProdutos.get(i).getValorCusto(),
                listaModelProdutos.get(i).getValorVenda(),
                listaModelProdutos.get(i).getEstoque()

            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNomeProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfValorVenda = new javax.swing.JTextField();
        jtfVAlorCusto = new javax.swing.JTextField();
        jtfQtdEstoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código");

        jLabel2.setText("Nome do Produto");

        jtfCodigo.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Valor de Custo");

        jLabel4.setText("Valor de Venda");

        jLabel5.setText("Qtd. Estoque");

        jtfValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorVendaActionPerformed(evt);
            }
        });
        jtfValorVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfValorVendaKeyReleased(evt);
            }
        });

        jtfVAlorCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVAlorCustoActionPerformed(evt);
            }
        });
        jtfVAlorCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfVAlorCustoKeyReleased(evt);
            }
        });

        jtfQtdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQtdEstoqueActionPerformed(evt);
            }
        });

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nome", "V. Compra", "V. Venda", "Qtd. Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setMinWidth(50);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtProdutos.getColumnModel().getColumn(0).setMaxWidth(50);
            jtProdutos.getColumnModel().getColumn(2).setMinWidth(80);
            jtProdutos.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtProdutos.getColumnModel().getColumn(2).setMaxWidth(80);
            jtProdutos.getColumnModel().getColumn(3).setMinWidth(70);
            jtProdutos.getColumnModel().getColumn(3).setPreferredWidth(70);
            jtProdutos.getColumnModel().getColumn(3).setMaxWidth(70);
            jtProdutos.getColumnModel().getColumn(4).setMinWidth(70);
            jtProdutos.getColumnModel().getColumn(4).setPreferredWidth(70);
            jtProdutos.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfVAlorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(329, 329, 329))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfVAlorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/icons 20/icons8-adicionar-filled-50.png"))); // NOI18N
        jbCancelar.setText("Limpar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/icons 20/icons8-salvar-filled-50.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/icons 20/icons8-editar-filled-50.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/icons 20/icons8-excluir-filled-50.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar))
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorVendaActionPerformed

    private void jtfQtdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQtdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQtdEstoqueActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        jtfCodigo.setText("");
            jtfNomeProduto.setText("");
            jtfQtdEstoque.setText("");
            jtfVAlorCusto.setText("");
            jtfValorVenda.setText("");
            
            salvarAlterar = "salvar";
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:

        modelProduto = new ModelProduto();
        int linha = jtProdutos.getSelectedRow();
        int codigo = 0;

        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!");
            

        } else {
            codigo = (Integer) jtProdutos.getValueAt(linha, 0);
            modelProduto = controllerProduto.retornarProdutoController(codigo);
            
            jtfCodigo.setText(modelProduto.getId()+"");
            jtfNomeProduto.setText(modelProduto.getNome());
            jtfQtdEstoque.setText(modelProduto.getEstoque()+"");
            jtfVAlorCusto.setText(modelProduto.getValorCusto()+"");
            jtfValorVenda.setText(modelProduto.getValorVenda()+"");
            salvarAlterar = "alterar";
                    
        }


    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // botão salvar

        modelProduto = new ModelProduto();

        modelProduto.setNome(jtfNomeProduto.getText());
        modelProduto.setValorCusto(new BigDecimal(jtfVAlorCusto.getText()));
        modelProduto.setValorVenda(new BigDecimal(jtfValorVenda.getText()));
        modelProduto.setEstoque(Integer.parseInt(jtfQtdEstoque.getText()));
        
        if (salvarAlterar.equals("salvar")){
            
          int salvarProdutoController = controllerProduto.salvarProdutoController(modelProduto);

        if (salvarProdutoController > 0) {
            jtfCodigo.setText("");
            jtfNomeProduto.setText("");
            jtfQtdEstoque.setText("");
            jtfVAlorCusto.setText("");
            jtfValorVenda.setText("");
            carregarProdutos();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar o Produto");

        }
 
            
        }else{ //alterar
            
            modelProduto.setId(Integer.parseInt(jtfCodigo.getText()));
            if(controllerProduto.atualizarProdutoController(modelProduto)){
                
            carregarProdutos();
            
            jtfCodigo.setText("");
            jtfNomeProduto.setText("");
            jtfQtdEstoque.setText("");
            jtfVAlorCusto.setText("");
            jtfValorVenda.setText("");
            
            JOptionPane.showMessageDialog(null, "Produto alterado com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                 
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao alterar o produto!","Erro",JOptionPane.ERROR_MESSAGE);
                
            }
           
           salvarAlterar = "salvar";
                   
            
        }

     

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtfVAlorCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVAlorCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfVAlorCustoActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:

        int linha = jtProdutos.getSelectedRow();
        int codigo = 0;

        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!");

        } else {

            //pega o nome do produto
            String nome = (String) jtProdutos.getValueAt(linha, 1);

            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o produto: " + nome, "Atenção", JOptionPane.YES_NO_CANCEL_OPTION);

            if (opcao == JOptionPane.OK_OPTION) {

                codigo = (Integer) jtProdutos.getValueAt(linha, 0);
                controllerProduto.excluirProdutoController(codigo);
                JOptionPane.showMessageDialog(null, "Produto exluido com sucesso!");
                carregarProdutos();
            }

        }


    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtfVAlorCustoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfVAlorCustoKeyReleased
        // TODO add your handling code here:
        
        
     bFormatador = new BLFormatador();
    
       jtfVAlorCusto.setText(bFormatador.converterVirgulaParaPonto(jtfVAlorCusto.getText()));
    
        
    }//GEN-LAST:event_jtfVAlorCustoKeyReleased

    private void jtfValorVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorVendaKeyReleased
        // TODO add your handling code here:
        
        
        bFormatador = new BLFormatador();
    
       jtfValorVenda.setText(bFormatador.converterVirgulaParaPonto(jtfValorVenda.getText()));
    }//GEN-LAST:event_jtfValorVendaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNomeProduto;
    private javax.swing.JTextField jtfQtdEstoque;
    private javax.swing.JTextField jtfVAlorCusto;
    private javax.swing.JTextField jtfValorVenda;
    // End of variables declaration//GEN-END:variables
}

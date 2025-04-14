/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import com.mycompany.exemplo_02.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.den
 */
public class TelaCadastro extends javax.swing.JFrame {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
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

        jTextField1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        bntBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txArea = new javax.swing.JTextArea();
        txtRemover = new javax.swing.JButton();
        txtExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP), "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("BUSCA:");

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("IDADE:");

        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        bntBuscar.setText("BUSCAR");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        txArea.setColumns(20);
        txArea.setRows(5);
        jScrollPane1.setViewportView(txArea);

        txtRemover.setText("REMOVER");
        txtRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoverActionPerformed(evt);
            }
        });

        txtExportar.setText("EXPORTAR");
        txtExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTextField1Layout = new javax.swing.GroupLayout(jTextField1);
        jTextField1.setLayout(jTextField1Layout);
        jTextField1Layout.setHorizontalGroup(
            jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTextField1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jTextField1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTextField1Layout.createSequentialGroup()
                        .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtIdade)
                            .addComponent(txtBuscar)))
                    .addGroup(jTextField1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTextField1Layout.createSequentialGroup()
                                .addComponent(txtRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtExportar))
                            .addGroup(jTextField1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar)
                                .addGap(61, 61, 61)
                                .addComponent(bntBuscar)))))
                .addGap(41, 41, 41))
        );
        jTextField1Layout.setVerticalGroup(
            jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextField1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(bntBuscar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemover)
                    .addComponent(txtExportar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            String nome = txtNome.getText();
            String idadeTexto = txtIdade.getText();
            int idade = Integer.parseInt(idadeTexto);

            Pessoa p = new Pessoa(nome, idade);
            listaPessoas.add(p);
            txArea.append(p.toString() + "\n");

            txtNome.setText("");
            txtIdade.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        String nomeBusca = txtBuscar.getText().trim();
        String novoNome = txtNome.getText().trim();
        String novaIdadeTexto = txtIdade.getText().trim();
        
        if (nomeBusca.isEmpty() || novoNome.isEmpty() || novaIdadeTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
            return;
        }
        
        try {
            int novaIdade = Integer.parseInt(novaIdadeTexto);
            boolean encontrado = false;
            
            for (Pessoa p : listaPessoas) {
                if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                    p.setNome(novoNome);
                    p.setIdade(novaIdade);
                    encontrado = true;
                    break;
                }
            }
            
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
                txArea.setText("");
                for (Pessoa p : listaPessoas) {
                    txArea.append(p.toString() + "\n");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida.");
        }
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void txtRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoverActionPerformed
        String nomeBusca = txtBuscar.getText().trim();
        if (nomeBusca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um nome para remover.");
            return;
        }
        
        boolean removido = false;
        
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getNome().equalsIgnoreCase(nomeBusca)) {
                listaPessoas.remove(i);
                removido = true;
                break;
            }
        }
        
        if (removido) {
            JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
        }
        
    }//GEN-LAST:event_txtRemoverActionPerformed

    private void txtExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExportarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        String nomeBusca = txtBuscar.getText().trim();
        
        if (nomeBusca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um nome para buscar.");
            return;
        }
        
        boolean encontrado = false;
        
        for (Pessoa p : listaPessoas) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                txtNome.setText(p.getNome());
                txtIdade.setText(String.valueOf(p.getIdade()));
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrado.");
            txtNome.setText("");
            txtIdade.setText("");
        }
    }//GEN-LAST:event_txtBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jTextField1;
    private javax.swing.JTextArea txArea;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JButton txtExportar;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JButton txtRemover;
    // End of variables declaration//GEN-END:variables
}

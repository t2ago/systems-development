/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import com.mycompany.exemplo_02.Carro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.den
 */
public class cadastroCarro extends javax.swing.JFrame {
    private ArrayList <Carro> listaCarros = new ArrayList<>();

    /**
     * Creates new form cadastroCarro
     */
    public cadastroCarro() {
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
        txtMarca = new javax.swing.JTextField();
        btListar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtPortas = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btRemover = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP), "Cadastrar Carro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("MARCA:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PORTAS:");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        btListar.setText("LISTAR");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("MODELO:");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        txtPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortasActionPerformed(evt);
            }
        });

        btAlterar.setText("ALTERAR");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btRemover.setText("REMOVER");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("BUSCAR:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTextField1Layout = new javax.swing.GroupLayout(jTextField1);
        jTextField1.setLayout(jTextField1Layout);
        jTextField1Layout.setHorizontalGroup(
            jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTextField1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jTextField1Layout.createSequentialGroup()
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTextField1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTextField1Layout.createSequentialGroup()
                                .addComponent(btRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpar))
                            .addGroup(jTextField1Layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(btListar)
                                .addGap(61, 61, 61)
                                .addComponent(btAlterar))))
                    .addGroup(jTextField1Layout.createSequentialGroup()
                        .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca)
                            .addComponent(txtModelo)
                            .addComponent(txtBuscar)
                            .addComponent(txtPortas))))
                .addGap(41, 41, 41))
        );
        jTextField1Layout.setVerticalGroup(
            jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextField1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btListar)
                    .addComponent(btAlterar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jTextField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemover)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        String marcaBusca = txtBuscar.getText().trim();

        if (marcaBusca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite a marca para buscar.");
            return;
        }

        boolean encontrado = false;

        for (Carro p : listaCarros) {
            if (p.getMarca().equalsIgnoreCase(marcaBusca)) {
                txtMarca.setText(p.getMarca());
                txtModelo.setText(p.getModelo());
                txtPortas.setText(String.valueOf(p.getPortas()));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Carro não encontrado.");
            txtMarca.setText("");
            txtModelo.setText("");
        }
    }//GEN-LAST:event_btListarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            String portasTexto = txtPortas.getText();
            int portas = Integer.parseInt(portasTexto);
            
            Carro p = new Carro(portas, marca, modelo);
            listaCarros.add(p);
            txtArea.append(p.toString() + "\n");
            
            txtMarca.setText("");
            txtModelo.setText("");
            txtPortas.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Portas inválidas");
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortasActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_txtPortasActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        String marcaBusca = txtBuscar.getText().trim();
        String novaMarca = txtMarca.getText().trim();
        String novoModelo = txtModelo.getText().trim();
        String novaPortasTexto = txtPortas.getText().trim();

        if (marcaBusca.isEmpty() || novaMarca.isEmpty() || novoModelo.isEmpty() || novaPortasTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
            return;
        }

        try {
            int novaPortas = Integer.parseInt(novaPortasTexto);
            boolean encontrado = false;

            for (Carro p : listaCarros) {
                if (p.getMarca().equalsIgnoreCase(marcaBusca)) {
                    p.setMarca(novaMarca);
                    p.setModelo(novoModelo);
                    p.setPortas(novaPortas);
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
                txtArea.setText("");
                for (Carro p : listaCarros) {
                    txtArea.append(p.toString() + "\n");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Carro não encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Portas inválidas.");
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        String marcaBusca = txtBuscar.getText().trim();
        if (marcaBusca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite a marca para remover.");
            return;
        }

        boolean removido = false;

        for (int i = 0; i < listaCarros.size(); i++) {
            if (listaCarros.get(i).getMarca().equalsIgnoreCase(marcaBusca)) {
                listaCarros.remove(i);
                removido = true;
                break;
            }
        }

        if (removido) {
            JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Carro não encontrado.");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtBuscar.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtPortas.setText("");
        txtArea.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(cadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jTextField1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPortas;
    // End of variables declaration//GEN-END:variables
}

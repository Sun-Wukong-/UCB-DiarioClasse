/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import controle.AlunoControle;
import controle.TelaControle;
import persistencia.AlunoDao;

/**
 *
 * @author Ninja
 */
public class AlunoAlterarFrame extends javax.swing.JFrame {

    /**
     * Creates new form AlunoAlterarFrame
     */
    public AlunoAlterarFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuTurma = new javax.swing.JPanel();
        ToolBarMenuTurma = new javax.swing.JToolBar();
        ButtonAtualizarAlunoAlterar = new javax.swing.JButton();
        ButtonLimparAlunoAlterar = new javax.swing.JButton();
        ButtonVoltarAlunoAlterar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigoAlunoAlterar = new javax.swing.JLabel();
        LabelNomeAlunoAlterar = new javax.swing.JLabel();
        jLabelMatriculaAlunoAlterar = new javax.swing.JLabel();
        LabelTurmaAlunoAlterar = new javax.swing.JLabel();
        jTextNomeAlunoAlterar = new javax.swing.JTextField();
        jTextFieldMatriculaAlunoAlterar = new javax.swing.JTextField();
        jComboBoxTurmaAlunoAlterar = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBoxAlterarCodigo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelMenuTurma.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuTurma.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuTurma.setRollover(true);

        ButtonAtualizarAlunoAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonAtualizarAlunoAlterar.setText("Atualizar");
        ButtonAtualizarAlunoAlterar.setFocusable(false);
        ButtonAtualizarAlunoAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAtualizarAlunoAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonAtualizarAlunoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAtualizarAlunoAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonAtualizarAlunoAlterar);

        ButtonLimparAlunoAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonLimparAlunoAlterar.setText("Limpar");
        ButtonLimparAlunoAlterar.setFocusable(false);
        ButtonLimparAlunoAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonLimparAlunoAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonLimparAlunoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparAlunoAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonLimparAlunoAlterar);

        ButtonVoltarAlunoAlterar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonVoltarAlunoAlterar1.setText("Fechar");
        ButtonVoltarAlunoAlterar1.setFocusable(false);
        ButtonVoltarAlunoAlterar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonVoltarAlunoAlterar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonVoltarAlunoAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarAlunoAlterar1ActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonVoltarAlunoAlterar1);

        javax.swing.GroupLayout PanelMenuTurmaLayout = new javax.swing.GroupLayout(PanelMenuTurma);
        PanelMenuTurma.setLayout(PanelMenuTurmaLayout);
        PanelMenuTurmaLayout.setHorizontalGroup(
            PanelMenuTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuTurmaLayout.setVerticalGroup(
            PanelMenuTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualizar Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabelCodigoAlunoAlterar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCodigoAlunoAlterar.setText("Codigo Aluno");

        LabelNomeAlunoAlterar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelNomeAlunoAlterar.setText("Nome");

        jLabelMatriculaAlunoAlterar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMatriculaAlunoAlterar.setText("Matricula:");

        LabelTurmaAlunoAlterar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelTurmaAlunoAlterar.setText("Turma");

        jTextNomeAlunoAlterar.setColumns(20);

        jTextFieldMatriculaAlunoAlterar.setColumns(10);

        jComboBoxTurmaAlunoAlterar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTurmaAlunoAlterar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Turma" }));
        jComboBoxTurmaAlunoAlterar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jComboBoxTurmaAlunoAlterarComponentShown(evt);
            }
        });
        jComboBoxTurmaAlunoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaAlunoAlterarActionPerformed(evt);
            }
        });
        jComboBoxTurmaAlunoAlterar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxTurmaAlunoAlterarFocusGained(evt);
            }
        });

        jComboBoxAlterarCodigo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxAlterarCodigo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Codigo" }));
        jComboBoxAlterarCodigo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAlterarCodigoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMatriculaAlunoAlterar)
                                    .addComponent(LabelTurmaAlunoAlterar)
                                    .addComponent(LabelNomeAlunoAlterar))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMatriculaAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNomeAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTurmaAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodigoAlunoAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxAlterarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoAlunoAlterar)
                    .addComponent(jComboBoxAlterarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNomeAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNomeAlunoAlterar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatriculaAlunoAlterar)
                    .addComponent(jTextFieldMatriculaAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTurmaAlunoAlterar)
                    .addComponent(jComboBoxTurmaAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAtualizarAlunoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtualizarAlunoAlterarActionPerformed
        AlunoControle alunoControle = new AlunoControle();
        alunoControle.Atualizar(this);
    }//GEN-LAST:event_ButtonAtualizarAlunoAlterarActionPerformed

    private void ButtonLimparAlunoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparAlunoAlterarActionPerformed
        AlunoControle alunoControle = new AlunoControle();
        alunoControle.limparTela(this);
    }//GEN-LAST:event_ButtonLimparAlunoAlterarActionPerformed

    private void jComboBoxTurmaAlunoAlterarComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAlunoAlterarComponentShown

    }//GEN-LAST:event_jComboBoxTurmaAlunoAlterarComponentShown

    private void jComboBoxTurmaAlunoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAlunoAlterarActionPerformed

    }//GEN-LAST:event_jComboBoxTurmaAlunoAlterarActionPerformed

    private void jComboBoxTurmaAlunoAlterarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAlunoAlterarFocusGained

    }//GEN-LAST:event_jComboBoxTurmaAlunoAlterarFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AlunoDao dao = new AlunoDao();
        dao.preencherCombo(this);
        dao.preencherComboCodigo(this);
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxAlterarCodigoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAlterarCodigoItemStateChanged
        AlunoDao dao = new AlunoDao();
        dao.preencherCodigoText(this);
    }//GEN-LAST:event_jComboBoxAlterarCodigoItemStateChanged

    private void ButtonVoltarAlunoAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarAlunoAlterar1ActionPerformed
        TelaControle.TelaAlunoAlter.setVisible(false);
        TelaControle.TelaAluno.setVisible(true);
    }//GEN-LAST:event_ButtonVoltarAlunoAlterar1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlunoAlterarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoAlterarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoAlterarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoAlterarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoAlterarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAtualizarAlunoAlterar;
    private javax.swing.JButton ButtonLimparAlunoAlterar;
    private javax.swing.JButton ButtonVoltarAlunoAlterar1;
    private javax.swing.JLabel LabelNomeAlunoAlterar;
    private javax.swing.JLabel LabelTurmaAlunoAlterar;
    private javax.swing.JPanel PanelMenuTurma;
    private javax.swing.JToolBar ToolBarMenuTurma;
    private javax.swing.JComboBox jComboBoxAlterarCodigo;
    private javax.swing.JComboBox jComboBoxTurmaAlunoAlterar;
    private javax.swing.JLabel jLabelCodigoAlunoAlterar;
    private javax.swing.JLabel jLabelMatriculaAlunoAlterar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldMatriculaAlunoAlterar;
    private javax.swing.JTextField jTextNomeAlunoAlterar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTextFieldMatriculaAlunoAlterar
     */
    public javax.swing.JTextField getjTextFieldMatriculaAlunoAlterar() {
        return jTextFieldMatriculaAlunoAlterar;
    }

    /**
     * @param jTextFieldMatriculaAlunoAlterar the jTextFieldMatriculaAlunoAlterar to set
     */
    public void setjTextFieldMatriculaAlunoAlterar(javax.swing.JTextField jTextFieldMatriculaAlunoAlterar) {
        this.jTextFieldMatriculaAlunoAlterar = jTextFieldMatriculaAlunoAlterar;
    }

    /**
     * @return the jTextNomeAlunoAlterar
     */
    public javax.swing.JTextField getjTextNomeAlunoAlterar() {
        return jTextNomeAlunoAlterar;
    }

    /**
     * @param jTextNomeAlunoAlterar the jTextNomeAlunoAlterar to set
     */
    public void setjTextNomeAlunoAlterar(javax.swing.JTextField jTextNomeAlunoAlterar) {
        this.jTextNomeAlunoAlterar = jTextNomeAlunoAlterar;
    }

    /**
     * @return the jComboBoxTurmaAlunoAlterar
     */
    public javax.swing.JComboBox getjComboBoxTurmaAlunoAlterar() {
        return jComboBoxTurmaAlunoAlterar;
    }

    /**
     * @param jComboBoxTurmaAlunoAlterar the jComboBoxTurmaAlunoAlterar to set
     */
    public void setjComboBoxTurmaAlunoAlterar(javax.swing.JComboBox jComboBoxTurmaAlunoAlterar) {
        this.jComboBoxTurmaAlunoAlterar = jComboBoxTurmaAlunoAlterar;
    }

    /**
     * @return the jComboBoxAlterarCodigo
     */
    public javax.swing.JComboBox getjComboBoxAlterarCodigo() {
        return jComboBoxAlterarCodigo;
    }

    /**
     * @param jComboBoxAlterarCodigo the jComboBoxAlterarCodigo to set
     */
    public void setjComboBoxAlterarCodigo(javax.swing.JComboBox jComboBoxAlterarCodigo) {
        this.jComboBoxAlterarCodigo = jComboBoxAlterarCodigo;
    }    
}

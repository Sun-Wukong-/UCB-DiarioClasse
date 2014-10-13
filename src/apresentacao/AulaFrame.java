package apresentacao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AulaFrame extends javax.swing.JFrame {

    public AulaFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTituloAula = new javax.swing.JPanel();
        LabelTituloAula = new javax.swing.JLabel();
        PanelMenuAula = new javax.swing.JPanel();
        ToolBarMenuAula = new javax.swing.JToolBar();
        ButtonHabilitar = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        jPanelBodyAula = new javax.swing.JPanel();
        jLabelDiaAula = new javax.swing.JLabel();
        jComboBoxDiaAula = new javax.swing.JComboBox();
        jLabelMesAula = new javax.swing.JLabel();
        jComboBoxMesAula = new javax.swing.JComboBox();
        jLabelAnoAula = new javax.swing.JLabel();
        jComboBoxAnoAula = new javax.swing.JComboBox();
        jLabelDataAula = new javax.swing.JLabel();
        jPanelPrensencaAula = new javax.swing.JPanel();
        jLabelAlunoAula = new javax.swing.JLabel();
        jComboBoxAlunoAula = new javax.swing.JComboBox();
        jCheckBoxPresenteAula = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAula = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTituloAula.setBackground(new java.awt.Color(255, 255, 255));
        PanelTituloAula.setAutoscrolls(true);

        LabelTituloAula.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTituloAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAula.gif"))); // NOI18N
        LabelTituloAula.setText("Aula");

        javax.swing.GroupLayout PanelTituloAulaLayout = new javax.swing.GroupLayout(PanelTituloAula);
        PanelTituloAula.setLayout(PanelTituloAulaLayout);
        PanelTituloAulaLayout.setHorizontalGroup(
            PanelTituloAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloAulaLayout.setVerticalGroup(
            PanelTituloAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMenuAula.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuAula.setAutoscrolls(true);

        ToolBarMenuAula.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuAula.setRollover(true);

        ButtonHabilitar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonHabilitar.setText("Habilitar");
        ButtonHabilitar.setFocusable(false);
        ButtonHabilitar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonHabilitar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHabilitarActionPerformed(evt);
            }
        });
        ToolBarMenuAula.add(ButtonHabilitar);

        ButtonAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonAlterar.setText("Alterar");
        ButtonAlterar.setFocusable(false);
        ButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuAula.add(ButtonAlterar);

        ButtonExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.setFocusable(false);
        ButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });
        ToolBarMenuAula.add(ButtonExcluir);
        ToolBarMenuAula.add(jSeparator1);

        ButtonSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonSalvar.setText("Salvar");
        ButtonSalvar.setFocusable(false);
        ButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });
        ToolBarMenuAula.add(ButtonSalvar);

        ButtonLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonLimpar.setText("Limpar");
        ButtonLimpar.setFocusable(false);
        ButtonLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });
        ToolBarMenuAula.add(ButtonLimpar);

        javax.swing.GroupLayout PanelMenuAulaLayout = new javax.swing.GroupLayout(PanelMenuAula);
        PanelMenuAula.setLayout(PanelMenuAulaLayout);
        PanelMenuAulaLayout.setHorizontalGroup(
            PanelMenuAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuAulaLayout.setVerticalGroup(
            PanelMenuAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBodyAula.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBodyAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data - Aula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanelBodyAula.setPreferredSize(new java.awt.Dimension(435, 153));

        jLabelDiaAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelDiaAula.setText("Dia");

        jComboBoxDiaAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxDiaAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelMesAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMesAula.setText("Mês");

        jComboBoxMesAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxMesAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelAnoAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAnoAula.setText("Ano");

        jComboBoxAnoAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxAnoAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDataAula.setText("Data");

        javax.swing.GroupLayout jPanelBodyAulaLayout = new javax.swing.GroupLayout(jPanelBodyAula);
        jPanelBodyAula.setLayout(jPanelBodyAulaLayout);
        jPanelBodyAulaLayout.setHorizontalGroup(
            jPanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyAulaLayout.createSequentialGroup()
                        .addComponent(jLabelDiaAula)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDiaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMesAula)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMesAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAnoAula)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxAnoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDataAula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyAulaLayout.setVerticalGroup(
            jPanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiaAula)
                    .addComponent(jComboBoxDiaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMesAula)
                    .addComponent(jComboBoxMesAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnoAula)
                    .addComponent(jComboBoxAnoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelDataAula)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanelPrensencaAula.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPrensencaAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle Presença", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanelPrensencaAula.setPreferredSize(new java.awt.Dimension(435, 153));

        jLabelAlunoAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAlunoAula.setText("Aluno");

        jComboBoxAlunoAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxAlunoAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBoxPresenteAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jCheckBoxPresenteAula.setText("Presente");

        javax.swing.GroupLayout jPanelPrensencaAulaLayout = new javax.swing.GroupLayout(jPanelPrensencaAula);
        jPanelPrensencaAula.setLayout(jPanelPrensencaAulaLayout);
        jPanelPrensencaAulaLayout.setHorizontalGroup(
            jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrensencaAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAlunoAula)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxAlunoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxPresenteAula)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanelPrensencaAulaLayout.setVerticalGroup(
            jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrensencaAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlunoAula)
                    .addComponent(jComboBoxAlunoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxPresenteAula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Presença em Aulas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jTableAula.setBackground(new java.awt.Color(204, 204, 204));
        jTableAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aula", "Aluno", "Presença"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAula);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBodyAula, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrensencaAula, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelMenuAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelBodyAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPrensencaAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHabilitarActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_ButtonHabilitarActionPerformed

    @SuppressWarnings("empty-statement")
    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        salvarCampos();
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limparTela();
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
         if(jTableAula.isCellSelected(jTableAula.getSelectedRow(), jTableAula.getSelectedColumn()))
         {
           String inputUsuario = JOptionPane.showInputDialog("Informe novo valor: ");
           alterarCamposAula(inputUsuario);
        }else{
            if(jTablePresenca.isCellSelected(jTablePresenca.getSelectedRow(), jTablePresenca.getSelectedColumn()))
            {
                String inputUsuario = JOptionPane.showInputDialog("Informe novo valor: ");
                alterarCampoPresenca(inputUsuario);
            }else{
                JOptionPane.showMessageDialog(this, "Selecione um campo para alterar");
            }
        }
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        if(jTableAula.isCellSelected(jTableAula.getSelectedRow(), jTableAula.getSelectedColumn()))
        {
            excluirRegistroAula();
        }else{
            if(jTablePresenca.isCellSelected(jTablePresenca.getSelectedRow(), jTablePresenca.getSelectedColumn()))
            {
                excluirRegistroPresenca();
            }else
            {
                JOptionPane.showMessageDialog(this,"Selecione um registro para exclusão");
            }
        }
    }//GEN-LAST:event_ButtonExcluirActionPerformed
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
            java.util.logging.Logger.getLogger(AulaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AulaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AulaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AulaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AulaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonHabilitar;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelTituloAula;
    private javax.swing.JPanel PanelMenuAula;
    private javax.swing.JPanel PanelTituloAula;
    private javax.swing.JToolBar ToolBarMenuAula;
    private javax.swing.JCheckBox jCheckBoxPresenteAula;
    private javax.swing.JComboBox jComboBoxAlunoAula;
    private javax.swing.JComboBox jComboBoxAnoAula;
    private javax.swing.JComboBox jComboBoxDiaAula;
    private javax.swing.JComboBox jComboBoxMesAula;
    private javax.swing.JLabel jLabelAlunoAula;
    private javax.swing.JLabel jLabelAnoAula;
    private javax.swing.JLabel jLabelDataAula;
    private javax.swing.JLabel jLabelDiaAula;
    private javax.swing.JLabel jLabelMesAula;
    private javax.swing.JPanel jPanelBodyAula;
    private javax.swing.JPanel jPanelPrensencaAula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTableAula;
    // End of variables declaration//GEN-END:variables

    //Metodo Limpar Tela
    private void limparTela() {
        if(jSplitPaneAula.isShowing())
        {
            jTextDataAula.setText("");
            jComboBoxTurmaAula.setSelectedIndex(0);
            
            jComboBoxTurmaAula.setEnabled(false);
            jTextDataAula.setEditable(false);
            jLabelTurmaSelecionadaAula.setText("Turma Selecionada");
            jTableAula.setEnabled(false);
            jTableAula.setRowSelectionAllowed(false);
        }else
        {
            if(jSplitPanePresenca.isShowing());
                jComboBoxAlunoPresenca.setSelectedIndex(0);
                jComboBoxAulaPresenca.setSelectedIndex(0);
                
                jComboBoxAulaPresenca.setEnabled(false);
                jComboBoxAlunoPresenca.setEnabled(false);
                jLabelAlunoSelecionadoPresenca.setText("Aluno Selecionada");
                jLabelAulaSelecionadaPresenca.setText("Aula Selecionada");
                jTablePresenca.setEnabled(false);
                jTablePresenca.setRowSelectionAllowed(false);
        }
    }
    
    //Metodo para Habilitar Campos
    private void habilitarCampos()
    {  if(jSplitPaneAula.isShowing()){   
            jTextDataAula.requestFocus();
            jTextDataAula.setEditable(true);
            jComboBoxTurmaAula.setEnabled(true);
            jTableAula.setEnabled(true);
            jTableAula.setRowSelectionAllowed(true);
            jTablePresenca.setRowSelectionAllowed(false);
        }else{
            if(jSplitPanePresenca.isShowing()){
                jComboBoxAulaPresenca.requestFocus();
                jComboBoxAulaPresenca.setEnabled(true);
                jComboBoxAlunoPresenca.setEnabled(true);
                jTablePresenca.setEnabled(true);
                jTablePresenca.setRowSelectionAllowed(true);
                jTableAula.setRowSelectionAllowed(false);
            }
        }
    }

    //Metodo para Salvar Campos
    private void salvarCampos()
    {
        if(jScrollPaneAula.isShowing()){
            if(validarCampos()){
                adicionarValorTabelaAula();
                JOptionPane.showMessageDialog(this, "Cadastro Salvo com Sucesso");
                limparTela();
            }
        }else{
            if(jScrollPanePresenca.isShowing())
            {
                if(validarCampos()){
                  adicionarValorTabelaPresenca();
                  JOptionPane.showMessageDialog(this, "Cadastro Salvo com Sucesso");
                  limparTela();
                }
            }
        }
    }
    
    //Metodo Alterar Campos
    private void alterarCamposAula(String inputUsuario)
    {
      
            jTableAula.getModel().setValueAt(inputUsuario, jTableAula.getSelectedRow(), jTableAula.getSelectedColumn());
            JOptionPane.showMessageDialog(this, "Campo Alterado com Sucesso");
        
    }
    
    //Metodo Alterar Campos Tabela Presença
    private void alterarCampoPresenca(String inputUsuario)
    {
            jTablePresenca.getModel().setValueAt(inputUsuario, jTablePresenca.getSelectedRow(), jTablePresenca.getSelectedColumn());
            JOptionPane.showMessageDialog(this, "Campo Alterado com Sucesso");
    }
    
    //Remover Registro da Tabela Aula
    private void excluirRegistroAula()
    {
        DefaultTableModel model;
        model = (DefaultTableModel)jTableAula.getModel();
        model.removeRow(jTableAula.getSelectedRow());
        JOptionPane.showMessageDialog(this,"Registro Excluido com Sucesso");
    }
    
    //Remover Registro da Tabela Presença
        private void excluirRegistroPresenca()
    {
        DefaultTableModel model;
        model = (DefaultTableModel)jTablePresenca.getModel();
        model.removeRow(jTablePresenca.getSelectedRow());
        JOptionPane.showMessageDialog(this,"Registro Excluido com Sucesso");
    }
    
    //Metodo Validar Campos
    private boolean validarCampos() 
    {
        if(jSplitPaneAula.isShowing())
        {
            if (jTextDataAula.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Digite a Data");
                jTextDataAula.requestFocus();
                return false;
            }
            
            if(jComboBoxTurmaAula.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma Turma");
                jComboBoxTurmaAula.requestFocus();
                return false;
            }
        }else
            if(jScrollPanePresenca.isShowing())
            {
                if(jComboBoxAulaPresenca.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(this, "Selecione uma Aula");
                    jComboBoxAulaPresenca.requestFocus();
                    return false;
                }
                
                if(jComboBoxAlunoPresenca.getSelectedIndex() == 0)
                {
                    JOptionPane.showMessageDialog(this, "Selecione um Aluno");
                    jComboBoxAlunoPresenca.requestFocus();
                    return false;
                }               
            }
        return true;
        
    }
    
    private void adicionarValorTabelaAula()
    {
        String data = jTextDataAula.getText();
        String turma = jLabelTurmaSelecionadaAula.getText();
        
        Object[] row = { data, turma};
        
        DefaultTableModel model = (DefaultTableModel) jTableAula.getModel();
        
        model.addRow(row);
    }
    
    private void adicionarValorTabelaPresenca()
    {
        String aula = jLabelAulaSelecionadaPresenca.getText();
        String aluno = jLabelAlunoSelecionadoPresenca.getText();
        
        Object[] row = { aula, aluno};
        
        DefaultTableModel model = (DefaultTableModel) jTablePresenca.getModel();
        
        model.addRow(row);
    }
}

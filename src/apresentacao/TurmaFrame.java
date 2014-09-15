package apresentacao;

import javax.swing.JOptionPane;

public class TurmaFrame extends javax.swing.JFrame {

    public TurmaFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTituloTurma = new javax.swing.JPanel();
        LabelTituloTurma = new javax.swing.JLabel();
        PanelBodyTurma = new javax.swing.JPanel();
        LabelNomeTurma = new javax.swing.JLabel();
        TextNomeTurma = new javax.swing.JTextField();
        TextCursoTurma = new javax.swing.JTextField();
        LabelCursoTurma = new javax.swing.JLabel();
        TextDisciplinaTurma = new javax.swing.JTextField();
        LabelDisciplinaTurma = new javax.swing.JLabel();
        LabelTurnoTurma = new javax.swing.JLabel();
        ComboBoxTurnoTurma = new javax.swing.JComboBox();
        LabelPeriodoTurma = new javax.swing.JLabel();
        TextPeriodoTurma = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PanelMenuTurma = new javax.swing.JPanel();
        ToolBarMenuTurma = new javax.swing.JToolBar();
        ButtonIncluir = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        PanelTituloTurma.setBackground(new java.awt.Color(255, 255, 255));

        LabelTituloTurma.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        LabelTituloTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemTurma.png"))); // NOI18N
        LabelTituloTurma.setText("Turma");

        javax.swing.GroupLayout PanelTituloTurmaLayout = new javax.swing.GroupLayout(PanelTituloTurma);
        PanelTituloTurma.setLayout(PanelTituloTurmaLayout);
        PanelTituloTurmaLayout.setHorizontalGroup(
            PanelTituloTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloTurma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloTurmaLayout.setVerticalGroup(
            PanelTituloTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloTurma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBodyTurma.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        LabelNomeTurma.setText("Nome");

        TextNomeTurma.setEditable(false);
        TextNomeTurma.setColumns(20);

        TextCursoTurma.setEditable(false);
        TextCursoTurma.setColumns(20);
        TextCursoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCursoTurmaActionPerformed(evt);
            }
        });

        LabelCursoTurma.setText("Curso");

        TextDisciplinaTurma.setEditable(false);
        TextDisciplinaTurma.setColumns(20);

        LabelDisciplinaTurma.setText("Disciplina");

        LabelTurnoTurma.setText("Turno");

        ComboBoxTurnoTurma.setEditable(true);
        ComboBoxTurnoTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manhã", "Tarde", "Noite", " " }));
        ComboBoxTurnoTurma.setEnabled(false);
        ComboBoxTurnoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTurnoTurmaActionPerformed(evt);
            }
        });

        LabelPeriodoTurma.setText("Periodo");

        TextPeriodoTurma.setEditable(false);
        TextPeriodoTurma.setColumns(2);

        javax.swing.GroupLayout PanelBodyTurmaLayout = new javax.swing.GroupLayout(PanelBodyTurma);
        PanelBodyTurma.setLayout(PanelBodyTurmaLayout);
        PanelBodyTurmaLayout.setHorizontalGroup(
            PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyTurmaLayout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                                .addComponent(LabelNomeTurma)
                                .addGap(18, 18, 18)
                                .addComponent(TextNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelCursoTurma)
                                .addGap(18, 18, 18)
                                .addComponent(TextCursoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                        .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDisciplinaTurma)
                            .addComponent(LabelTurnoTurma))
                        .addGap(18, 18, 18)
                        .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                                .addComponent(ComboBoxTurnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelPeriodoTurma)
                                .addGap(18, 18, 18)
                                .addComponent(TextPeriodoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelBodyTurmaLayout.setVerticalGroup(
            PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeTurma)
                    .addComponent(TextNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCursoTurma)
                    .addComponent(TextCursoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDisciplinaTurma)
                    .addComponent(TextDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTurnoTurma)
                    .addComponent(ComboBoxTurnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPeriodoTurma)
                    .addComponent(TextPeriodoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        PanelMenuTurma.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuTurma.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuTurma.setRollover(true);

        ButtonIncluir.setText("Incluir");
        ButtonIncluir.setFocusable(false);
        ButtonIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIncluirActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonIncluir);

        ButtonAlterar.setText("Alterar");
        ButtonAlterar.setFocusable(false);
        ButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarMenuTurma.add(ButtonAlterar);

        ButtonExcluir.setText("Excluir");
        ButtonExcluir.setFocusable(false);
        ButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarMenuTurma.add(ButtonExcluir);
        ToolBarMenuTurma.add(jSeparator1);

        ButtonSalvar.setText("Salvar");
        ButtonSalvar.setFocusable(false);
        ButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonSalvar);

        ButtonLimpar.setText("Limpar");
        ButtonLimpar.setFocusable(false);
        ButtonLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonLimpar);

        javax.swing.GroupLayout PanelMenuTurmaLayout = new javax.swing.GroupLayout(PanelMenuTurma);
        PanelMenuTurma.setLayout(PanelMenuTurmaLayout);
        PanelMenuTurmaLayout.setHorizontalGroup(
            PanelMenuTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuTurmaLayout.setVerticalGroup(
            PanelMenuTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Curso", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PanelBodyTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBodyTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTurnoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTurnoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTurnoTurmaActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        if(validarCampos()){
            JOptionPane.showMessageDialog(this, "Cadastro Salvo com Sucesso");
            
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIncluirActionPerformed
        TextNomeTurma.setEditable(true);
        TextCursoTurma.setEditable(true);
        TextDisciplinaTurma.setEditable(true);
        ComboBoxTurnoTurma.setEnabled(true);
        TextPeriodoTurma.setEditable(true);
    }//GEN-LAST:event_ButtonIncluirActionPerformed

    private void TextCursoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCursoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCursoTurmaActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limparTela();
        TextNomeTurma.setEditable(false);
        TextCursoTurma.setEditable(false);
        TextDisciplinaTurma.setEditable(false);
        ComboBoxTurnoTurma.setEnabled(false);
        TextPeriodoTurma.setEditable(false);
        
    }//GEN-LAST:event_ButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TurmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TurmaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonIncluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JComboBox ComboBoxTurnoTurma;
    private javax.swing.JLabel LabelCursoTurma;
    private javax.swing.JLabel LabelDisciplinaTurma;
    private javax.swing.JLabel LabelNomeTurma;
    private javax.swing.JLabel LabelPeriodoTurma;
    private javax.swing.JLabel LabelTituloTurma;
    private javax.swing.JLabel LabelTurnoTurma;
    private javax.swing.JPanel PanelBodyTurma;
    private javax.swing.JPanel PanelMenuTurma;
    private javax.swing.JPanel PanelTituloTurma;
    private javax.swing.JTextField TextCursoTurma;
    private javax.swing.JTextField TextDisciplinaTurma;
    private javax.swing.JTextField TextNomeTurma;
    private javax.swing.JTextField TextPeriodoTurma;
    private javax.swing.JToolBar ToolBarMenuTurma;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void limparTela() {
       TextNomeTurma.setText("");
       TextCursoTurma.setText("");
       TextPeriodoTurma.setText("");
       TextDisciplinaTurma.setText("");
       ComboBoxTurnoTurma.setSelectedIndex(0);
}

    private boolean validarCampos(){
        if(TextNomeTurma.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite o Nome");
           TextNomeTurma.requestFocus();
           return false;
        }
        if(TextCursoTurma.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite o Curso");
           TextCursoTurma.requestFocus();
           return false;
        }
        if(TextDisciplinaTurma.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite a Disciplina");
           TextDisciplinaTurma.requestFocus();
           return false;
        }
        if(TextPeriodoTurma.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite o Periodo");
           TextPeriodoTurma.requestFocus();
           return false;
        }
        return true;

    }
}


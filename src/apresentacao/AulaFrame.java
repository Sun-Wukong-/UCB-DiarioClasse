package apresentacao;

public class AulaFrame extends javax.swing.JFrame {

    /**
     * Creates new form AulaFrame
     */
    public AulaFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTituloAula = new javax.swing.JPanel();
        LabelTituloAula = new javax.swing.JLabel();
        jTabbedPaneBodyDataAula = new javax.swing.JTabbedPane();
        jSplitPaneAula = new javax.swing.JSplitPane();
        PanelBodyAula = new javax.swing.JPanel();
        LabelDataAula = new javax.swing.JLabel();
        TextDataAula = new javax.swing.JTextField();
        LabelTurmaAula = new javax.swing.JLabel();
        jComboBoxTurmaAula = new javax.swing.JComboBox();
        jPanelTabelaAula = new javax.swing.JPanel();
        jScrollPaneAula = new javax.swing.JScrollPane();
        jTableAula = new javax.swing.JTable();
        jSplitPanePresenca = new javax.swing.JSplitPane();
        PanelBodyPresenca = new javax.swing.JPanel();
        LabelAulaPresenca = new javax.swing.JLabel();
        jComboBoxAulaPresenca = new javax.swing.JComboBox();
        jLabelAlunoPresenca = new javax.swing.JLabel();
        jComboBoxAlunoPresenca = new javax.swing.JComboBox();
        jPanelTabelaPresenca = new javax.swing.JPanel();
        jScrollPanePresenca = new javax.swing.JScrollPane();
        jTablePresenca = new javax.swing.JTable();
        PanelMenuAula = new javax.swing.JPanel();
        ToolBarMenuAula = new javax.swing.JToolBar();
        ButtonIncluir = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTituloAula.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(662, Short.MAX_VALUE))
        );
        PanelTituloAulaLayout.setVerticalGroup(
            PanelTituloAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneBodyDataAula.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPaneBodyDataAula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPaneBodyDataAula.setAutoscrolls(true);
        jTabbedPaneBodyDataAula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jSplitPaneAula.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        PanelBodyAula.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        PanelBodyAula.setPreferredSize(new java.awt.Dimension(346, 89));

        LabelDataAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelDataAula.setText("Data");

        TextDataAula.setColumns(5);

        LabelTurmaAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelTurmaAula.setText("Turma");

        jComboBoxTurmaAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelBodyAulaLayout = new javax.swing.GroupLayout(PanelBodyAula);
        PanelBodyAula.setLayout(PanelBodyAulaLayout);
        PanelBodyAulaLayout.setHorizontalGroup(
            PanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDataAula)
                .addGap(18, 18, 18)
                .addComponent(TextDataAula, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelTurmaAula)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxTurmaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBodyAulaLayout.setVerticalGroup(
            PanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDataAula)
                    .addComponent(TextDataAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTurmaAula)
                    .addComponent(jComboBoxTurmaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPaneAula.setLeftComponent(PanelBodyAula);

        jPanelTabelaAula.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTabelaAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aulas Cadastradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPaneAula.setBackground(new java.awt.Color(204, 204, 204));

        jTableAula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Data", "Turma"
            }
        ));
        jScrollPaneAula.setViewportView(jTableAula);

        javax.swing.GroupLayout jPanelTabelaAulaLayout = new javax.swing.GroupLayout(jPanelTabelaAula);
        jPanelTabelaAula.setLayout(jPanelTabelaAulaLayout);
        jPanelTabelaAulaLayout.setHorizontalGroup(
            jPanelTabelaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelTabelaAulaLayout.setVerticalGroup(
            jPanelTabelaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAula, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        jSplitPaneAula.setRightComponent(jPanelTabelaAula);

        jTabbedPaneBodyDataAula.addTab("Aula", jSplitPaneAula);

        jSplitPanePresenca.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        PanelBodyPresenca.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyPresenca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        PanelBodyPresenca.setAutoscrolls(true);
        PanelBodyPresenca.setPreferredSize(new java.awt.Dimension(346, 89));

        LabelAulaPresenca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelAulaPresenca.setText("Aula");

        jComboBoxAulaPresenca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelAlunoPresenca.setText("Aluno");

        jComboBoxAlunoPresenca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelBodyPresencaLayout = new javax.swing.GroupLayout(PanelBodyPresenca);
        PanelBodyPresenca.setLayout(PanelBodyPresencaLayout);
        PanelBodyPresencaLayout.setHorizontalGroup(
            PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyPresencaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelAulaPresenca)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxAlunoPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAlunoPresenca)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxAulaPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );
        PanelBodyPresencaLayout.setVerticalGroup(
            PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyPresencaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAulaPresenca)
                    .addComponent(jComboBoxAulaPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlunoPresenca)
                    .addComponent(jComboBoxAlunoPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPanePresenca.setLeftComponent(PanelBodyPresenca);

        jPanelTabelaPresenca.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTabelaPresenca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alunos Presentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanelTabelaPresenca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jScrollPanePresenca.setBackground(new java.awt.Color(204, 204, 204));

        jTablePresenca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTablePresenca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Aula", "Aluno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPanePresenca.setViewportView(jTablePresenca);

        javax.swing.GroupLayout jPanelTabelaPresencaLayout = new javax.swing.GroupLayout(jPanelTabelaPresenca);
        jPanelTabelaPresenca.setLayout(jPanelTabelaPresencaLayout);
        jPanelTabelaPresencaLayout.setHorizontalGroup(
            jPanelTabelaPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanePresenca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelTabelaPresencaLayout.setVerticalGroup(
            jPanelTabelaPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanePresenca, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        jSplitPanePresenca.setRightComponent(jPanelTabelaPresenca);

        jTabbedPaneBodyDataAula.addTab("Presença", jSplitPanePresenca);

        PanelMenuAula.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuAula.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuAula.setRollover(true);

        ButtonIncluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonIncluir.setText("Incluir");
        ButtonIncluir.setFocusable(false);
        ButtonIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIncluirActionPerformed(evt);
            }
        });
        ToolBarMenuAula.add(ButtonIncluir);

        ButtonAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonAlterar.setText("Alterar");
        ButtonAlterar.setFocusable(false);
        ButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarMenuAula.add(ButtonAlterar);

        ButtonExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.setFocusable(false);
        ButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPaneBodyDataAula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelMenuAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(jTabbedPaneBodyDataAula, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIncluirActionPerformed
        jComboBoxTurmaAula.setEditable(true);
        TextDataAula.setEditable(true);
        jComboBoxAlunoPresenca.setEditable(true);
        jComboBoxAulaPresenca.setEnabled(true);
    }//GEN-LAST:event_ButtonIncluirActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        if(validarCampos()){
            JOptionPane.showMessageDialog(this, "Cadastro Salvo com Sucesso");

        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limparTela();
        jComboBoxTurmaAula.setEditable(false);
        TextDataAula.setEditable(false);
        jComboBoxAlunoPresenca.setEditable(false);
        jComboBoxAulaPresenca.setEnabled(false);

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
    private javax.swing.JButton ButtonIncluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelAulaPresenca;
    private javax.swing.JLabel LabelDataAula;
    private javax.swing.JLabel LabelTituloAula;
    private javax.swing.JLabel LabelTurmaAula;
    private javax.swing.JPanel PanelBodyAula;
    private javax.swing.JPanel PanelBodyPresenca;
    private javax.swing.JPanel PanelMenuAula;
    private javax.swing.JPanel PanelTituloAula;
    private javax.swing.JTextField TextDataAula;
    private javax.swing.JToolBar ToolBarMenuAula;
    private javax.swing.JComboBox jComboBoxAlunoPresenca;
    private javax.swing.JComboBox jComboBoxAulaPresenca;
    private javax.swing.JComboBox jComboBoxTurmaAula;
    private javax.swing.JLabel jLabelAlunoPresenca;
    private javax.swing.JPanel jPanelTabelaAula;
    private javax.swing.JPanel jPanelTabelaPresenca;
    private javax.swing.JScrollPane jScrollPaneAula;
    private javax.swing.JScrollPane jScrollPanePresenca;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSplitPane jSplitPaneAula;
    private javax.swing.JSplitPane jSplitPanePresenca;
    private javax.swing.JTabbedPane jTabbedPaneBodyDataAula;
    private javax.swing.JTable jTableAula;
    private javax.swing.JTable jTablePresenca;
    // End of variables declaration//GEN-END:variables

    private void limparTela() {
       TextDataAula.setText("");
       jComboBoxAlunoPresenca.setSelectedIndex(0);
       jComboBoxAulaPresenca.setSelectedIndex(0);
       jComboBoxTurmaAula.setSelectedIndex(0);
}
}

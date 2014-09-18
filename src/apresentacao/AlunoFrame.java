package apresentacao;

public class AlunoFrame extends javax.swing.JFrame {

    public AlunoFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTituloAluno = new javax.swing.JPanel();
        LabelTituloAluno = new javax.swing.JLabel();
        PanelMenuAluno = new javax.swing.JPanel();
        ToolBarMenuAluno = new javax.swing.JToolBar();
        ButtonIncluir = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        PanelBodyAluno = new javax.swing.JPanel();
        LabelNomeAluno = new javax.swing.JLabel();
        TextNomeAluno = new javax.swing.JTextField();
        LabelTurmaAluno = new javax.swing.JLabel();
        jComboBoxTurmaAluno = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelNota1Aluno = new javax.swing.JLabel();
        jTextFieldNota1Aluno = new javax.swing.JTextField();
        jTextFieldNota2Aluno = new javax.swing.JTextField();
        jLabelNota2Aluno = new javax.swing.JLabel();
        jLabelNota3Aluno = new javax.swing.JLabel();
        jTextFieldNota3Aluno = new javax.swing.JTextField();
        jLabel1NotaFinalAluno = new javax.swing.JLabel();
        jLabelNotaFinalRespostaAluno = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPaneAluno = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTituloAluno.setBackground(new java.awt.Color(255, 255, 255));

        LabelTituloAluno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTituloAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAluno.png"))); // NOI18N
        LabelTituloAluno.setText("Aluno");

        javax.swing.GroupLayout PanelTituloAlunoLayout = new javax.swing.GroupLayout(PanelTituloAluno);
        PanelTituloAluno.setLayout(PanelTituloAlunoLayout);
        PanelTituloAlunoLayout.setHorizontalGroup(
            PanelTituloAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloAlunoLayout.setVerticalGroup(
            PanelTituloAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMenuAluno.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuAluno.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuAluno.setRollover(true);

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
        ToolBarMenuAluno.add(ButtonIncluir);

        ButtonAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonAlterar.setText("Alterar");
        ButtonAlterar.setFocusable(false);
        ButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarMenuAluno.add(ButtonAlterar);

        ButtonExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.setFocusable(false);
        ButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarMenuAluno.add(ButtonExcluir);
        ToolBarMenuAluno.add(jSeparator1);

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
        ToolBarMenuAluno.add(ButtonSalvar);

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
        ToolBarMenuAluno.add(ButtonLimpar);

        javax.swing.GroupLayout PanelMenuAlunoLayout = new javax.swing.GroupLayout(PanelMenuAluno);
        PanelMenuAluno.setLayout(PanelMenuAlunoLayout);
        PanelMenuAlunoLayout.setHorizontalGroup(
            PanelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuAlunoLayout.setVerticalGroup(
            PanelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelBodyAluno.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        LabelNomeAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelNomeAluno.setText("Nome");

        TextNomeAluno.setEditable(false);
        TextNomeAluno.setColumns(20);

        LabelTurmaAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelTurmaAluno.setText("Turma");

        jComboBoxTurmaAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Matricula:");

        jTextField3.setColumns(10);

        javax.swing.GroupLayout PanelBodyAlunoLayout = new javax.swing.GroupLayout(PanelBodyAluno);
        PanelBodyAluno.setLayout(PanelBodyAlunoLayout);
        PanelBodyAlunoLayout.setHorizontalGroup(
            PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(LabelNomeAluno))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                        .addComponent(TextNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(LabelTurmaAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBodyAlunoLayout.setVerticalGroup(
            PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeAluno)
                    .addComponent(TextNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTurmaAluno)
                    .addComponent(jComboBoxTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabelNota1Aluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNota1Aluno.setText("1º Nota:");

        jTextFieldNota1Aluno.setColumns(2);

        jTextFieldNota2Aluno.setColumns(2);

        jLabelNota2Aluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNota2Aluno.setText("2º Nota:");

        jLabelNota3Aluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNota3Aluno.setText("3º Nota:");

        jTextFieldNota3Aluno.setColumns(2);

        jLabel1NotaFinalAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1NotaFinalAluno.setText("Nota Final:");

        jLabelNotaFinalRespostaAluno.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNota1Aluno)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldNota1Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNota2Aluno)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNota2Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNota3Aluno)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNota3Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1NotaFinalAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNotaFinalRespostaAluno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNota1Aluno)
                    .addComponent(jTextFieldNota1Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNota2Aluno)
                    .addComponent(jLabelNota3Aluno)
                    .addComponent(jTextFieldNota2Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNota3Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1NotaFinalAluno)
                    .addComponent(jLabelNotaFinalRespostaAluno))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alunos Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPaneAluno.setBackground(new java.awt.Color(204, 204, 204));

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Turma", "Nome", "1º Nota", "2º Nota", "3º Nota", "Nota Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneAluno.setViewportView(jTableAluno);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAluno)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBodyAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMenuAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBodyAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIncluirActionPerformed
        TextNomeAluno.setEditable(true);
        TextCursoTurma.setEditable(true);
        TextDisciplinaTurma.setEditable(true);
        ComboBoxTurnoTurma.setEnabled(true);
        TextPeriodoTurma.setEditable(true);
    }//GEN-LAST:event_ButtonIncluirActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        if(validarCampos()){
            JOptionPane.showMessageDialog(this, "Cadastro Salvo com Sucesso");

        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limparTela();
        TextNomeAluno.setEditable(false);
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
            java.util.logging.Logger.getLogger(AlunoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonIncluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelNomeAluno;
    private javax.swing.JLabel LabelTituloAluno;
    private javax.swing.JLabel LabelTurmaAluno;
    private javax.swing.JPanel PanelBodyAluno;
    private javax.swing.JPanel PanelMenuAluno;
    private javax.swing.JPanel PanelTituloAluno;
    private javax.swing.JTextField TextNomeAluno;
    private javax.swing.JToolBar ToolBarMenuAluno;
    private javax.swing.JComboBox jComboBoxTurmaAluno;
    private javax.swing.JLabel jLabel1NotaFinalAluno;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNota1Aluno;
    private javax.swing.JLabel jLabelNota2Aluno;
    private javax.swing.JLabel jLabelNota3Aluno;
    private javax.swing.JLabel jLabelNotaFinalRespostaAluno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneAluno;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldNota1Aluno;
    private javax.swing.JTextField jTextFieldNota2Aluno;
    private javax.swing.JTextField jTextFieldNota3Aluno;
    // End of variables declaration//GEN-END:variables
}

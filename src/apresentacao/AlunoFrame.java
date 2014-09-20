package apresentacao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        jTextNomeAluno = new javax.swing.JTextField();
        LabelTurmaAluno = new javax.swing.JLabel();
        jComboBoxTurmaAluno = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMatriculaAluno = new javax.swing.JTextField();
        jLabelTurmaSelecionadaAluno = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNota1Aluno = new javax.swing.JLabel();
        jTextFieldNota1Aluno = new javax.swing.JTextField();
        jTextFieldNota2Aluno = new javax.swing.JTextField();
        jLabelNota2Aluno = new javax.swing.JLabel();
        jLabelNota3Aluno = new javax.swing.JLabel();
        jTextFieldNota3Aluno = new javax.swing.JTextField();
        jLabelMedia = new javax.swing.JLabel();
        jButtonMedia = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
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
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });
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

        jTextNomeAluno.setEditable(false);
        jTextNomeAluno.setColumns(20);

        LabelTurmaAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelTurmaAluno.setText("Turma");

        jComboBoxTurmaAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTurmaAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Turma", "Turma 1", "Turma 2", "Turma 3", "Turma 4" }));
        jComboBoxTurmaAluno.setEnabled(false);
        jComboBoxTurmaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaAlunoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Matricula:");

        jTextFieldMatriculaAluno.setEditable(false);
        jTextFieldMatriculaAluno.setColumns(10);

        jLabelTurmaSelecionadaAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelTurmaSelecionadaAluno.setText("Turma Selecionada");

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
                    .addComponent(jTextNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                        .addComponent(LabelTurmaAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTurmaSelecionadaAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBodyAlunoLayout.setVerticalGroup(
            PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeAluno)
                    .addComponent(jTextNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTurmaAluno)
                    .addComponent(jComboBoxTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTurmaSelecionadaAluno))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabelNota1Aluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNota1Aluno.setText("1º Nota:");

        jTextFieldNota1Aluno.setEditable(false);
        jTextFieldNota1Aluno.setColumns(2);

        jTextFieldNota2Aluno.setEditable(false);
        jTextFieldNota2Aluno.setColumns(2);

        jLabelNota2Aluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNota2Aluno.setText("2º Nota:");

        jLabelNota3Aluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNota3Aluno.setText("3º Nota:");

        jTextFieldNota3Aluno.setEditable(false);
        jTextFieldNota3Aluno.setColumns(2);

        jLabelMedia.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMedia.setText("0");

        jButtonMedia.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButtonMedia.setText("Media");
        jButtonMedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMediaMouseClicked(evt);
            }
        });

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
                        .addComponent(jTextFieldNota1Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonMedia)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMedia)))
                .addGap(18, 18, 18)
                .addComponent(jLabelNota2Aluno)
                .addGap(36, 36, 36)
                .addComponent(jTextFieldNota2Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNota3Aluno)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNota3Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedia)
                    .addComponent(jButtonMedia))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alunos Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPaneAluno.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPaneAluno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Turma", "Nome", "1º Nota", "2º Nota", "3º Nota", "Nota Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            .addComponent(jScrollPaneAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        jScrollPaneAluno.getAccessibleContext().setAccessibleName("");
        jScrollPaneAluno.getAccessibleContext().setAccessibleDescription("");

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
        incluirCampos();
    }//GEN-LAST:event_ButtonIncluirActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        salvarCampos();
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limparTela();
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void jComboBoxTurmaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAlunoActionPerformed
        String var = (String)jComboBoxTurmaAluno.getSelectedItem();
        jLabelTurmaSelecionadaAluno.setText(var);
    }//GEN-LAST:event_jComboBoxTurmaAlunoActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
       /* ButtonIncluir.setEnabled(false);
        TextNomeAluno.setEditable(false);
        jTextFieldMatriculaAluno.setEditable(true);
        jComboBoxTurmaAluno.setEnabled(false);
        jTextFieldNota1Aluno.setEditable(false);
        jTextFieldNota2Aluno.setEditable(false);
        jTextFieldNota3Aluno.setEditable(false);
        jTextFieldMatriculaAluno.requestFocus();*/
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void jButtonMediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMediaMouseClicked
        if(jTextFieldNota1Aluno.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a Nota 1");
            jTextNomeAluno.requestFocus();
        }else{
            if(jTextFieldNota2Aluno.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Digite a Nota 2");
                jTextNomeAluno.requestFocus();
            }else{
                if(jTextFieldNota3Aluno.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Digite a Nota 3");
                    jTextNomeAluno.requestFocus();
                }else
                {
                    jLabelMedia.setText(Float.toString(valorNotaFinal()));
                }
            }
        }
    }//GEN-LAST:event_jButtonMediaMouseClicked

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
    private javax.swing.JToolBar ToolBarMenuAluno;
    private javax.swing.JButton jButtonMedia;
    private javax.swing.JComboBox jComboBoxTurmaAluno;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMedia;
    private javax.swing.JLabel jLabelNota1Aluno;
    private javax.swing.JLabel jLabelNota2Aluno;
    private javax.swing.JLabel jLabelNota3Aluno;
    private javax.swing.JLabel jLabelTurmaSelecionadaAluno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneAluno;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldMatriculaAluno;
    private javax.swing.JTextField jTextFieldNota1Aluno;
    private javax.swing.JTextField jTextFieldNota2Aluno;
    private javax.swing.JTextField jTextFieldNota3Aluno;
    private javax.swing.JTextField jTextNomeAluno;
    // End of variables declaration//GEN-END:variables

    // Metodo de Limpar Campos
    private void limparTela() {
        jTextNomeAluno.setText("");
        jTextFieldMatriculaAluno.setText("");
        jTextFieldNota1Aluno.setText("");
        jTextFieldNota2Aluno.setText("");
        jTextFieldNota3Aluno.setText("");
        jLabelMedia.setText("0");
        jComboBoxTurmaAluno.setSelectedIndex(0);
        jLabelTurmaSelecionadaAluno.setText("Turma Selecionada");
        
        jTextNomeAluno.setEditable(false);
        jTextFieldMatriculaAluno.setEditable(false);
        jComboBoxTurmaAluno.setEnabled(false);
        jTextFieldNota1Aluno.setEditable(false);
        jTextFieldNota2Aluno.setEditable(false);
        jTextFieldNota3Aluno.setEditable(false);
    }
    
    //Metodo para Habilitar Campos
    private void incluirCampos()
    {
        jTextNomeAluno.requestFocus();
        jTextNomeAluno.setEditable(true);
        jTextFieldMatriculaAluno.setEditable(true);
        jComboBoxTurmaAluno.setEnabled(true);
        jTextFieldNota1Aluno.setEditable(true);
        jTextFieldNota2Aluno.setEditable(true);
        jTextFieldNota3Aluno.setEditable(true);
    }
    
    //Metodo de Salvar Campos
    private void salvarCampos()
    {
        if (validarCampos()) {
            adicionarValorTabela(valorNotaFinal());
            JOptionPane.showMessageDialog(this, "Cadastro Salvo com Sucesso");
            limparTela();
        }
    }

    //Metodo de Validar Campos
    private boolean validarCampos() {
        if (jTextNomeAluno.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Nome");
            jTextNomeAluno.requestFocus();
            return false;
        }
        if (jTextFieldMatriculaAluno.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a matricula do aluno");
            jTextFieldMatriculaAluno.requestFocus();
            return false;
        }
        
        if (jComboBoxTurmaAluno.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma Turma");
            jComboBoxTurmaAluno.requestFocus();
            return false;
        }
        return true;
    }
    
    //Metodo ValorNotaFinal
    private float valorNotaFinal()
    {
        float NotaFinal;
        float Nota;
        int divisor = 2;
        
        Nota = (Float.parseFloat(jTextFieldNota1Aluno.getText()) + Float.parseFloat(jTextFieldNota2Aluno.getText())
        + Float.parseFloat(jTextFieldNota1Aluno.getText()));
        NotaFinal = (Nota / divisor); 
        return NotaFinal;
    }
    
    //Metodo de Adicionar na Tabela sem Notas
    private void adicionarValorTabela()
    {
        String matricula = jTextFieldMatriculaAluno.getText();
        String nome = jTextNomeAluno.getText();
        String turma = jLabelTurmaSelecionadaAluno.getText();
        
         Object[] row = { matricula, turma ,nome};
        
        DefaultTableModel model = (DefaultTableModel) jTableAluno.getModel();
        
        model.addRow(row);
    }
    
    //Metodo de Adicionar na Tabela com Notas
    private void adicionarValorTabela(float valorNotaFinal) 
    {
        String matricula = jTextFieldMatriculaAluno.getText();
        String nome = jTextNomeAluno.getText();
        String turma = jLabelTurmaSelecionadaAluno.getText();
        String nota1 = jTextFieldNota1Aluno.getText();
        String nota2 = jTextFieldNota2Aluno.getText();
        String nota3 = jTextFieldNota3Aluno.getText();
        String notaFinal;
        notaFinal = String.valueOf(valorNotaFinal);
        
        Object[] row = { matricula, turma ,nome, nota1, nota2, nota3, notaFinal};
        
        DefaultTableModel model = (DefaultTableModel) jTableAluno.getModel();
        
        model.addRow(row);
    }
}

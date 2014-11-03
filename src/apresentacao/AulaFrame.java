package apresentacao;

import controle.AulaControle;
import persistencia.AulaDao;

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
        jButtonConsultarAula = new javax.swing.JButton();
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
        jLabelAlunoSelecionadoAula = new javax.swing.JLabel();
        jComboBoxPresencaAual = new javax.swing.JComboBox();
        jLabelPresencaAula = new javax.swing.JLabel();
        jLabelPresenteAula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAula = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelTituloAula.setBackground(new java.awt.Color(255, 255, 255));
        PanelTituloAula.setAutoscrolls(true);
        PanelTituloAula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PanelTituloAulaFocusGained(evt);
            }
        });

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

        jButtonConsultarAula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonConsultarAula.setText("Consultar");
        jButtonConsultarAula.setFocusable(false);
        jButtonConsultarAula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsultarAula.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAulaActionPerformed(evt);
            }
        });
        ToolBarMenuAula.add(jButtonConsultarAula);

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
        jComboBoxDiaAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabelMesAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMesAula.setText("Mês");

        jComboBoxMesAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxMesAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabelAnoAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAnoAula.setText("Ano");

        jComboBoxAnoAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxAnoAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2013", "2012", "2011", "2010" }));

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
        jComboBoxAlunoAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Aluno" }));
        jComboBoxAlunoAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlunoAulaActionPerformed(evt);
            }
        });

        jLabelAlunoSelecionadoAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAlunoSelecionadoAula.setText("Aluno Selecionado");

        jComboBoxPresencaAual.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Presença", "Sim", "Não" }));
        jComboBoxPresencaAual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPresencaAualActionPerformed(evt);
            }
        });

        jLabelPresencaAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelPresencaAula.setText("Presença");

        jLabelPresenteAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelPresenteAula.setText("Presente");

        javax.swing.GroupLayout jPanelPrensencaAulaLayout = new javax.swing.GroupLayout(jPanelPrensencaAula);
        jPanelPrensencaAula.setLayout(jPanelPrensencaAulaLayout);
        jPanelPrensencaAulaLayout.setHorizontalGroup(
            jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrensencaAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrensencaAulaLayout.createSequentialGroup()
                        .addComponent(jLabelAlunoAula)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxAlunoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrensencaAulaLayout.createSequentialGroup()
                        .addComponent(jLabelAlunoSelecionadoAula)
                        .addGap(87, 87, 87)))
                .addGroup(jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPresenteAula)
                    .addComponent(jLabelPresencaAula))
                .addGap(18, 18, 18)
                .addComponent(jComboBoxPresencaAual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelPrensencaAulaLayout.setVerticalGroup(
            jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrensencaAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlunoAula)
                    .addComponent(jComboBoxAlunoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPresencaAual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPresencaAula))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlunoSelecionadoAula)
                    .addComponent(jLabelPresenteAula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Presença em Aulas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jTableAula.setBackground(new java.awt.Color(204, 204, 204));
        jTableAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoAula", "DataAula", "Turma", "Aluno", "Presente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
                .addComponent(jPanelBodyAula, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrensencaAula, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
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

    @SuppressWarnings("empty-statement")
    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        AulaControle controle = new AulaControle();
        String var = (String)getjComboBoxDiaAula().getSelectedItem();
        String var2 = (String)getjComboBoxMesAula().getSelectedItem(); 
        String var3 = (String)getjComboBoxAnoAula().getSelectedItem(); 
        String var4 = (var3 + "/" + var2 + "/" + var);
        getjLabelDataAula().setText(var4);
        controle.salvarCampos(this);
        
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        AulaControle controle = new AulaControle();
        controle.limparTela(this);
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
       
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed

    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void jButtonConsultarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAulaActionPerformed
        AulaControle controle = new AulaControle();
        controle.consultar(this);
    }//GEN-LAST:event_jButtonConsultarAulaActionPerformed

    private void PanelTituloAulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PanelTituloAulaFocusGained

    }//GEN-LAST:event_PanelTituloAulaFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AulaDao dao = new AulaDao();
        dao.preencherComboxAluno(this);
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxAlunoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlunoAulaActionPerformed
        String var = (String)getjComboBoxAlunoAula().getSelectedItem();
        getjLabelAlunoSelecionadoAula().setText(var);
    }//GEN-LAST:event_jComboBoxAlunoAulaActionPerformed

    private void jComboBoxPresencaAualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPresencaAualActionPerformed
        String var = (String)getjComboBoxPresencaAual().getSelectedItem();
        getjLabelPresenteAula().setText(var);
    }//GEN-LAST:event_jComboBoxPresencaAualActionPerformed
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
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelTituloAula;
    private javax.swing.JPanel PanelMenuAula;
    private javax.swing.JPanel PanelTituloAula;
    private javax.swing.JToolBar ToolBarMenuAula;
    private javax.swing.JButton jButtonConsultarAula;
    private javax.swing.JComboBox jComboBoxAlunoAula;
    private javax.swing.JComboBox jComboBoxAnoAula;
    private javax.swing.JComboBox jComboBoxDiaAula;
    private javax.swing.JComboBox jComboBoxMesAula;
    private javax.swing.JComboBox jComboBoxPresencaAual;
    private javax.swing.JLabel jLabelAlunoAula;
    private javax.swing.JLabel jLabelAlunoSelecionadoAula;
    private javax.swing.JLabel jLabelAnoAula;
    private javax.swing.JLabel jLabelDataAula;
    private javax.swing.JLabel jLabelDiaAula;
    private javax.swing.JLabel jLabelMesAula;
    private javax.swing.JLabel jLabelPresencaAula;
    private javax.swing.JLabel jLabelPresenteAula;
    private javax.swing.JPanel jPanelBodyAula;
    private javax.swing.JPanel jPanelPrensencaAula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTableAula;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTableAula
     */
    public javax.swing.JTable getjTableAula() {
        return jTableAula;
    }

    /**
     * @param jTableAula the jTableAula to set
     */
    public void setjTableAula(javax.swing.JTable jTableAula) {
        this.jTableAula = jTableAula;
    }

    /**
     * @return the jLabelAlunoSelecionadoAula
     */
    public javax.swing.JLabel getjLabelAlunoSelecionadoAula() {
        return jLabelAlunoSelecionadoAula;
    }

    /**
     * @param jLabelAlunoSelecionadoAula the jLabelAlunoSelecionadoAula to set
     */
    public void setjLabelAlunoSelecionadoAula(javax.swing.JLabel jLabelAlunoSelecionadoAula) {
        this.jLabelAlunoSelecionadoAula = jLabelAlunoSelecionadoAula;
    }

    /**
     * @return the jLabelDataAula
     */
    public javax.swing.JLabel getjLabelDataAula() {
        return jLabelDataAula;
    }

    /**
     * @param jLabelDataAula the jLabelDataAula to set
     */
    public void setjLabelDataAula(javax.swing.JLabel jLabelDataAula) {
        this.jLabelDataAula = jLabelDataAula;
    }

    /**
     * @return the jLabelPresenteAula
     */
    public javax.swing.JLabel getjLabelPresenteAula() {
        return jLabelPresenteAula;
    }

    /**
     * @param jLabelPresenteAula the jLabelPresenteAula to set
     */
    public void setjLabelPresenteAula(javax.swing.JLabel jLabelPresenteAula) {
        this.jLabelPresenteAula = jLabelPresenteAula;
    }

    /**
     * @return the jComboBoxAlunoAula
     */
    public javax.swing.JComboBox getjComboBoxAlunoAula() {
        return jComboBoxAlunoAula;
    }

    /**
     * @param jComboBoxAlunoAula the jComboBoxAlunoAula to set
     */
    public void setjComboBoxAlunoAula(javax.swing.JComboBox jComboBoxAlunoAula) {
        this.jComboBoxAlunoAula = jComboBoxAlunoAula;
    }

    /**
     * @return the jComboBoxAnoAula
     */
    public javax.swing.JComboBox getjComboBoxAnoAula() {
        return jComboBoxAnoAula;
    }

    /**
     * @param jComboBoxAnoAula the jComboBoxAnoAula to set
     */
    public void setjComboBoxAnoAula(javax.swing.JComboBox jComboBoxAnoAula) {
        this.jComboBoxAnoAula = jComboBoxAnoAula;
    }

    /**
     * @return the jComboBoxDiaAula
     */
    public javax.swing.JComboBox getjComboBoxDiaAula() {
        return jComboBoxDiaAula;
    }

    /**
     * @param jComboBoxDiaAula the jComboBoxDiaAula to set
     */
    public void setjComboBoxDiaAula(javax.swing.JComboBox jComboBoxDiaAula) {
        this.jComboBoxDiaAula = jComboBoxDiaAula;
    }

    /**
     * @return the jComboBoxMesAula
     */
    public javax.swing.JComboBox getjComboBoxMesAula() {
        return jComboBoxMesAula;
    }

    /**
     * @param jComboBoxMesAula the jComboBoxMesAula to set
     */
    public void setjComboBoxMesAula(javax.swing.JComboBox jComboBoxMesAula) {
        this.jComboBoxMesAula = jComboBoxMesAula;
    }

    /**
     * @return the jComboBoxPresencaAual
     */
    public javax.swing.JComboBox getjComboBoxPresencaAual() {
        return jComboBoxPresencaAual;
    }

    /**
     * @param jComboBoxPresencaAual the jComboBoxPresencaAual to set
     */
    public void setjComboBoxPresencaAual(javax.swing.JComboBox jComboBoxPresencaAual) {
        this.jComboBoxPresencaAual = jComboBoxPresencaAual;
    }
}

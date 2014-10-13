package apresentacao;

import java.util.List;
import java.util.Vector;
import modelo.entidades.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.TurmaDao;

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
        jLabelNomeTurma = new javax.swing.JLabel();
        jTextNomeTurma = new javax.swing.JTextField();
        jTextCursoTurma = new javax.swing.JTextField();
        jLabelCursoTurma = new javax.swing.JLabel();
        jTextDisciplinaTurma = new javax.swing.JTextField();
        LabelDisciplinaTurma = new javax.swing.JLabel();
        jLabelTurnoTurma = new javax.swing.JLabel();
        jComboBoxTurnoTurma = new javax.swing.JComboBox();
        LabelPeriodoTurma = new javax.swing.JLabel();
        jTextPeriodoTurma = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTurnoSelecionadoTurma = new javax.swing.JLabel();
        PanelMenuTurma = new javax.swing.JPanel();
        ToolBarMenuTurma = new javax.swing.JToolBar();
        ButtonHabilitar = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPaneTurma = new javax.swing.JScrollPane();
        jTableTurma = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        PanelTituloTurma.setBackground(new java.awt.Color(255, 255, 255));

        LabelTituloTurma.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
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
        PanelBodyTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabelNomeTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNomeTurma.setText("Nome");

        jTextNomeTurma.setEditable(false);
        jTextNomeTurma.setColumns(20);

        jTextCursoTurma.setEditable(false);
        jTextCursoTurma.setColumns(20);
        jTextCursoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCursoTurmaActionPerformed(evt);
            }
        });

        jLabelCursoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCursoTurma.setText("Curso");

        jTextDisciplinaTurma.setEditable(false);
        jTextDisciplinaTurma.setColumns(20);

        LabelDisciplinaTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelDisciplinaTurma.setText("Disciplina");

        jLabelTurnoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelTurnoTurma.setText("Turno");

        jComboBoxTurnoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTurnoTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Turno", "Manhã", "Tarde", "Noite" }));
        jComboBoxTurnoTurma.setEnabled(false);
        jComboBoxTurnoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurnoTurmaActionPerformed(evt);
            }
        });

        LabelPeriodoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelPeriodoTurma.setText("Periodo");

        jTextPeriodoTurma.setEditable(false);
        jTextPeriodoTurma.setColumns(2);

        jLabelTurnoSelecionadoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelTurnoSelecionadoTurma.setText("Turno Selecionado");

        javax.swing.GroupLayout PanelBodyTurmaLayout = new javax.swing.GroupLayout(PanelBodyTurma);
        PanelBodyTurma.setLayout(PanelBodyTurmaLayout);
        PanelBodyTurmaLayout.setHorizontalGroup(
            PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyTurmaLayout.createSequentialGroup()
                        .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBodyTurmaLayout.createSequentialGroup()
                                .addComponent(jLabelNomeTurma)
                                .addGap(43, 43, 43)
                                .addComponent(jTextNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabelCursoTurma)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCursoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                        .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDisciplinaTurma)
                                    .addComponent(jLabelTurnoTurma))
                                .addGap(18, 18, 18)
                                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                                        .addComponent(jComboBoxTurnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LabelPeriodoTurma)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextPeriodoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48))
                            .addComponent(jLabelTurnoSelecionadoTurma))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelBodyTurmaLayout.setVerticalGroup(
            PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeTurma)
                    .addComponent(jTextNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCursoTurma)
                    .addComponent(jTextCursoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDisciplinaTurma)
                    .addComponent(jTextDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTurnoTurma)
                    .addComponent(jComboBoxTurnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPeriodoTurma)
                    .addComponent(jTextPeriodoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelTurnoSelecionadoTurma)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelMenuTurma.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuTurma.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuTurma.setRollover(true);

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
        ToolBarMenuTurma.add(ButtonHabilitar);

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
        ToolBarMenuTurma.add(ButtonAlterar);

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
        ToolBarMenuTurma.add(ButtonExcluir);

        jButtonConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setFocusable(false);
        jButtonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(jButtonConsultar);
        ToolBarMenuTurma.add(jSeparator1);

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
        ToolBarMenuTurma.add(ButtonSalvar);

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
        ToolBarMenuTurma.add(ButtonLimpar);

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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turmas Cadastradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPaneTurma.setBackground(new java.awt.Color(204, 204, 204));

        jTableTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Curso", "Disciplina", "Periodo", "Turno"
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
        jScrollPaneTurma.setViewportView(jTableTurma);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTurma)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTurma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBodyTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBodyTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTurnoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurnoTurmaActionPerformed
        String var = (String)jComboBoxTurnoTurma.getSelectedItem();
        jLabelTurnoSelecionadoTurma.setText(var);
    }//GEN-LAST:event_jComboBoxTurnoTurmaActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        salvarCampos();
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHabilitarActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_ButtonHabilitarActionPerformed

    private void jTextCursoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCursoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCursoTurmaActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limparTela();
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
         if(getjTableTurma().isCellSelected(getjTableTurma().getSelectedRow(), getjTableTurma().getSelectedColumn())){
            String inputUsuario = JOptionPane.showInputDialog("Informe nova valor: ");
            alterarCampos(inputUsuario);
        }else{
            JOptionPane.showMessageDialog(this,"Selecione um campo para ser alterado");
        }
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        excluirRegistro();
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
       consultar();
    }//GEN-LAST:event_jButtonConsultarActionPerformed

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
    private javax.swing.JButton ButtonHabilitar;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelDisciplinaTurma;
    private javax.swing.JLabel LabelPeriodoTurma;
    private javax.swing.JLabel LabelTituloTurma;
    private javax.swing.JPanel PanelBodyTurma;
    private javax.swing.JPanel PanelMenuTurma;
    private javax.swing.JPanel PanelTituloTurma;
    private javax.swing.JToolBar ToolBarMenuTurma;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JComboBox jComboBoxTurnoTurma;
    private javax.swing.JLabel jLabelCursoTurma;
    private javax.swing.JLabel jLabelNomeTurma;
    private javax.swing.JLabel jLabelTurnoSelecionadoTurma;
    private javax.swing.JLabel jLabelTurnoTurma;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneTurma;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableTurma;
    private javax.swing.JTextField jTextCursoTurma;
    private javax.swing.JTextField jTextDisciplinaTurma;
    private javax.swing.JTextField jTextNomeTurma;
    private javax.swing.JTextField jTextPeriodoTurma;
    // End of variables declaration//GEN-END:variables
    
    private void limparTela() {
       jTextNomeTurma.setText("");
       jTextCursoTurma.setText("");
       jTextPeriodoTurma.setText("");
       jTextDisciplinaTurma.setText("");
       jComboBoxTurnoTurma.setSelectedIndex(0);
       jLabelTurnoSelecionadoTurma.setText("Turno Selecionado");
       
       jTextNomeTurma.setEditable(false);
       jTextCursoTurma.setEditable(false);
       jTextDisciplinaTurma.setEditable(false);
       jTextPeriodoTurma.setEditable(false);
       jComboBoxTurnoTurma.setEnabled(false);
        getjTableTurma().setEnabled(false);
        getjTableTurma().setRowSelectionAllowed(false);
    }
    
    private void habilitarCampos()
    {
        jTextNomeTurma.requestFocus();
        jTextNomeTurma.setEditable(true);
        jTextCursoTurma.setEditable(true);
        jTextDisciplinaTurma.setEditable(true);
        jComboBoxTurnoTurma.setEnabled(true);
        jTextPeriodoTurma.setEditable(true);
        getjTableTurma().setEnabled(true);
        getjTableTurma().setRowSelectionAllowed(true);
    }
    
    //Metodo para Salvar Campos 
    private void salvarCampos()
    {
        if(validarCampos()){
            adicionarValorTabela();
            Inserir();
            JOptionPane.showMessageDialog(this, "Cadastro Salvo com Sucesso");
            limparTela();
        }
    }
    
    //Metodo Alterar Campos
    private void alterarCampos(String inputUsuario)
    {
            getjTableTurma().getModel().setValueAt(inputUsuario, getjTableTurma().getSelectedRow(), getjTableTurma().getSelectedColumn());
            JOptionPane.showMessageDialog(this, "Campo Alterado com Sucesso");
    }
    
    //Metodo Remover Registro
    private void excluirRegistro()
    {
        if(getjTableTurma().isCellSelected(getjTableTurma().getSelectedRow(), getjTableTurma().getSelectedColumn()))
        {
            DefaultTableModel model;
            model = (DefaultTableModel)getjTableTurma().getModel();
            model.removeRow(getjTableTurma().getSelectedRow());
            JOptionPane.showMessageDialog(this,"Registro Excluido com Sucesso");
        }else
        {
            JOptionPane.showMessageDialog(this,"Selecione um registro para exclusão");
        }
    }

    private boolean validarCampos(){
        if(jTextNomeTurma.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite o Nome");
           jTextNomeTurma.requestFocus();
           return false;
        }
        if(jTextCursoTurma.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite o Curso");
           jTextCursoTurma.requestFocus();
           return false;
        }
        if(jTextDisciplinaTurma.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite a Disciplina");
           jTextDisciplinaTurma.requestFocus();
           return false;
        }
        if(jTextPeriodoTurma.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite o Periodo");
           jTextPeriodoTurma.requestFocus();
           return false;
        }
        
        if(jComboBoxTurnoTurma.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Selecione um Turno");
            jComboBoxTurnoTurma.requestFocus();
            return false;
        }
        
        return true;
    }
    
    //Metodo de Adicionar na Tabela
    private void adicionarValorTabela()
    {
        String nome = jTextNomeTurma.getText();
        String curso = jTextCursoTurma.getText();
        String disciplina = jTextDisciplinaTurma.getText();
        String periodo = jTextPeriodoTurma.getText();
        String turno = jLabelTurnoSelecionadoTurma.getText();


        
        Object[] row = { nome, curso ,disciplina, periodo, turno};
        
        DefaultTableModel model = (DefaultTableModel) getjTableTurma().getModel();
        
        model.addRow(row);
    }
    
    //Gravar no BD
    private void Inserir(){
        
        //Pronto para Gravar
        Turma turma = new Turma();
        turma.setNome(jTextNomeTurma.getText());
        turma.setCurso(jTextCursoTurma.getText());
        turma.setDisciplina(jTextDisciplinaTurma.getText());
        turma.setPeriodo((Integer.parseInt(jTextPeriodoTurma.getText())));
        turma.setTurno(jLabelTurnoSelecionadoTurma.getText());

        TurmaDao dao = new TurmaDao();
        
        // Gravando turma
        dao.adicionar(turma);
    }
    
    //Consultar BD
    public void consultar(){
        TurmaDao dao = new TurmaDao();
        Turma turma = new Turma();

        dao.getLista();
        
        String nome = turma.getNome();
        String curso = turma.getCurso();
        String disciplina = turma.getDisciplina();
        int periodo = turma.getPeriodo();
        String turno = turma.getTurno();


 
        Object[] row = { nome, curso ,disciplina, periodo, turno};
        
        DefaultTableModel model = (DefaultTableModel) getjTableTurma().getModel();
        
        model.addRow(row);
    }

    /**
     * @return the jTableTurma
     */
    public javax.swing.JTable getjTableTurma() {
        return jTableTurma;
    }

    /**
     * @param jTableTurma the jTableTurma to set
     */
    public void setjTableTurma(javax.swing.JTable jTableTurma) {
        this.jTableTurma = jTableTurma;
    }
}


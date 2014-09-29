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
        jTabbedPaneBodyDataAula = new javax.swing.JTabbedPane();
        jSplitPaneAula = new javax.swing.JSplitPane();
        PanelBodyAula = new javax.swing.JPanel();
        LabelDataAula = new javax.swing.JLabel();
        jTextDataAula = new javax.swing.JTextField();
        LabelTurmaAula = new javax.swing.JLabel();
        jComboBoxTurmaAula = new javax.swing.JComboBox();
        jLabelTurmaSelecionadaAula = new javax.swing.JLabel();
        jPanelTabelaAula = new javax.swing.JPanel();
        jScrollPaneAula = new javax.swing.JScrollPane();
        jTableAula = new javax.swing.JTable();
        jSplitPanePresenca = new javax.swing.JSplitPane();
        PanelBodyPresenca = new javax.swing.JPanel();
        LabelAulaPresenca = new javax.swing.JLabel();
        jComboBoxAlunoPresenca = new javax.swing.JComboBox();
        jLabelAlunoPresenca = new javax.swing.JLabel();
        jComboBoxAulaPresenca = new javax.swing.JComboBox();
        jLabelAulaSelecionadaPresenca = new javax.swing.JLabel();
        jLabelAlunoSelecionadoPresenca = new javax.swing.JLabel();
        jPanelTabelaPresenca = new javax.swing.JPanel();
        jScrollPanePresenca = new javax.swing.JScrollPane();
        jTablePresenca = new javax.swing.JTable();
        PanelMenuAula = new javax.swing.JPanel();
        ToolBarMenuAula = new javax.swing.JToolBar();
        ButtonHabilitar = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();

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

        jTabbedPaneBodyDataAula.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPaneBodyDataAula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPaneBodyDataAula.setAutoscrolls(true);
        jTabbedPaneBodyDataAula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jSplitPaneAula.setDividerLocation(125);
        jSplitPaneAula.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        PanelBodyAula.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        PanelBodyAula.setPreferredSize(new java.awt.Dimension(346, 89));

        LabelDataAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelDataAula.setText("Data");

        jTextDataAula.setEditable(false);
        jTextDataAula.setColumns(5);

        LabelTurmaAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelTurmaAula.setText("Turma");

        jComboBoxTurmaAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTurmaAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Turma", "Turma 1", "Turma 2", "Turma 3", "Turma 4" }));
        jComboBoxTurmaAula.setEnabled(false);
        jComboBoxTurmaAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaAulaActionPerformed(evt);
            }
        });

        jLabelTurmaSelecionadaAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelTurmaSelecionadaAula.setText("Turma Selecionada");

        javax.swing.GroupLayout PanelBodyAulaLayout = new javax.swing.GroupLayout(PanelBodyAula);
        PanelBodyAula.setLayout(PanelBodyAulaLayout);
        PanelBodyAulaLayout.setHorizontalGroup(
            PanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDataAula)
                .addGap(18, 18, 18)
                .addComponent(jTextDataAula, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTurmaSelecionadaAula)
                    .addGroup(PanelBodyAulaLayout.createSequentialGroup()
                        .addComponent(LabelTurmaAula)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTurmaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        PanelBodyAulaLayout.setVerticalGroup(
            PanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDataAula)
                    .addComponent(jTextDataAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTurmaAula)
                    .addComponent(jComboBoxTurmaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelTurmaSelecionadaAula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPaneAula.setLeftComponent(PanelBodyAula);

        jPanelTabelaAula.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTabelaAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aulas Cadastradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPaneAula.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPaneAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTableAula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Turma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneAula.setViewportView(jTableAula);

        javax.swing.GroupLayout jPanelTabelaAulaLayout = new javax.swing.GroupLayout(jPanelTabelaAula);
        jPanelTabelaAula.setLayout(jPanelTabelaAulaLayout);
        jPanelTabelaAulaLayout.setHorizontalGroup(
            jPanelTabelaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        jPanelTabelaAulaLayout.setVerticalGroup(
            jPanelTabelaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAula, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jSplitPaneAula.setRightComponent(jPanelTabelaAula);

        jTabbedPaneBodyDataAula.addTab("Aula", jSplitPaneAula);

        jSplitPanePresenca.setDividerLocation(125);
        jSplitPanePresenca.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        PanelBodyPresenca.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyPresenca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        PanelBodyPresenca.setAutoscrolls(true);
        PanelBodyPresenca.setPreferredSize(new java.awt.Dimension(346, 89));

        LabelAulaPresenca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelAulaPresenca.setText("Aula");

        jComboBoxAlunoPresenca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxAlunoPresenca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Aluno", "Aluno 1", "Aluno 2", "Aluno 3", "Aluno 4" }));
        jComboBoxAlunoPresenca.setEnabled(false);
        jComboBoxAlunoPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlunoPresencaActionPerformed(evt);
            }
        });

        jLabelAlunoPresenca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAlunoPresenca.setText("Aluno");

        jComboBoxAulaPresenca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxAulaPresenca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Aula", "Aula 1", "Aula 2", "Aula 3", "Aula 4" }));
        jComboBoxAulaPresenca.setEnabled(false);
        jComboBoxAulaPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAulaPresencaActionPerformed(evt);
            }
        });

        jLabelAulaSelecionadaPresenca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAulaSelecionadaPresenca.setText("Aula Selecionada");

        jLabelAlunoSelecionadoPresenca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAlunoSelecionadoPresenca.setText("Aluno Selecionado");

        javax.swing.GroupLayout PanelBodyPresencaLayout = new javax.swing.GroupLayout(PanelBodyPresenca);
        PanelBodyPresenca.setLayout(PanelBodyPresencaLayout);
        PanelBodyPresencaLayout.setHorizontalGroup(
            PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyPresencaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyPresencaLayout.createSequentialGroup()
                        .addComponent(LabelAulaPresenca)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxAulaPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelAulaSelecionadaPresenca))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyPresencaLayout.createSequentialGroup()
                        .addComponent(jLabelAlunoPresenca)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxAlunoPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelAlunoSelecionadoPresenca))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        PanelBodyPresencaLayout.setVerticalGroup(
            PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyPresencaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAulaPresenca)
                    .addComponent(jComboBoxAlunoPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlunoPresenca)
                    .addComponent(jComboBoxAulaPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlunoSelecionadoPresenca)
                    .addComponent(jLabelAulaSelecionadaPresenca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPanePresenca.setLeftComponent(PanelBodyPresenca);

        jPanelTabelaPresenca.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTabelaPresenca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alunos Presentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanelTabelaPresenca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jScrollPanePresenca.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPanePresenca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTablePresenca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTablePresenca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aula", "Aluno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanePresenca.setViewportView(jTablePresenca);

        javax.swing.GroupLayout jPanelTabelaPresencaLayout = new javax.swing.GroupLayout(jPanelTabelaPresenca);
        jPanelTabelaPresenca.setLayout(jPanelTabelaPresencaLayout);
        jPanelTabelaPresencaLayout.setHorizontalGroup(
            jPanelTabelaPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanePresenca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        jPanelTabelaPresencaLayout.setVerticalGroup(
            jPanelTabelaPresencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanePresenca, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jSplitPanePresenca.setRightComponent(jPanelTabelaPresenca);

        jTabbedPaneBodyDataAula.addTab("Presença", jSplitPanePresenca);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneBodyDataAula)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTituloAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMenuAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelMenuAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jTabbedPaneBodyDataAula))
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

    private void jComboBoxAulaPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAulaPresencaActionPerformed
        String var = (String)jComboBoxAulaPresenca.getSelectedItem();
        jLabelAulaSelecionadaPresenca.setText(var);
    }//GEN-LAST:event_jComboBoxAulaPresencaActionPerformed

    private void jComboBoxAlunoPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlunoPresencaActionPerformed
       String var = (String)jComboBoxAlunoPresenca.getSelectedItem();
       jLabelAlunoSelecionadoPresenca.setText(var);
    }//GEN-LAST:event_jComboBoxAlunoPresencaActionPerformed

    private void jComboBoxTurmaAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAulaActionPerformed
        String var = (String)jComboBoxTurmaAula.getSelectedItem();
        jLabelTurmaSelecionadaAula.setText(var);
    }//GEN-LAST:event_jComboBoxTurmaAulaActionPerformed

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
    private javax.swing.JLabel LabelAulaPresenca;
    private javax.swing.JLabel LabelDataAula;
    private javax.swing.JLabel LabelTituloAula;
    private javax.swing.JLabel LabelTurmaAula;
    private javax.swing.JPanel PanelBodyAula;
    private javax.swing.JPanel PanelBodyPresenca;
    private javax.swing.JPanel PanelMenuAula;
    private javax.swing.JPanel PanelTituloAula;
    private javax.swing.JToolBar ToolBarMenuAula;
    private javax.swing.JComboBox jComboBoxAlunoPresenca;
    private javax.swing.JComboBox jComboBoxAulaPresenca;
    private javax.swing.JComboBox jComboBoxTurmaAula;
    private javax.swing.JLabel jLabelAlunoPresenca;
    private javax.swing.JLabel jLabelAlunoSelecionadoPresenca;
    private javax.swing.JLabel jLabelAulaSelecionadaPresenca;
    private javax.swing.JLabel jLabelTurmaSelecionadaAula;
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
    private javax.swing.JTextField jTextDataAula;
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

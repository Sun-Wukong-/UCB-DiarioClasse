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
        PanelBodyAula = new javax.swing.JPanel();
        LabelDataAula = new javax.swing.JLabel();
        TextNomeAluno = new javax.swing.JTextField();
        LabelTurmaAula = new javax.swing.JLabel();
        jComboBoxTurmaAula = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPaneAula = new javax.swing.JScrollPane();
        jTableAula = new javax.swing.JTable();

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
                .addContainerGap(296, Short.MAX_VALUE))
        );
        PanelTituloAulaLayout.setVerticalGroup(
            PanelTituloAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBodyAula.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        LabelDataAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelDataAula.setText("Data");

        TextNomeAluno.setColumns(5);

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
                .addComponent(TextNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(TextNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTurmaAula)
                    .addComponent(jComboBoxTurmaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aulas Cadastradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAula, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBodyAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBodyAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel LabelDataAula;
    private javax.swing.JLabel LabelTituloAula;
    private javax.swing.JLabel LabelTurmaAula;
    private javax.swing.JPanel PanelBodyAula;
    private javax.swing.JPanel PanelTituloAula;
    private javax.swing.JTextField TextNomeAluno;
    private javax.swing.JComboBox jComboBoxTurmaAula;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneAula;
    private javax.swing.JTable jTableAula;
    // End of variables declaration//GEN-END:variables
}

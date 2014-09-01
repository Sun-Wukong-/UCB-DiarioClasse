package apresentacao;


public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
    }

 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelHead = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        JPanelBody = new javax.swing.JPanel();
        jButtonTurma = new javax.swing.JButton();
        jButtonAula = new javax.swing.JButton();
        jButtonAluno = new javax.swing.JButton();
        jLabelTurma = new javax.swing.JLabel();
        jLabelAula = new javax.swing.JLabel();
        jLabelAluno = new javax.swing.JLabel();
        MenuBarHome = new javax.swing.JMenuBar();
        MenuFileHome = new javax.swing.JMenu();
        MenuItemNovaTurmaHome = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        JPanelHead.setBackground(new java.awt.Color(204, 204, 204));
        JPanelHead.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitulo.setText("Diario de Classe");

        javax.swing.GroupLayout JPanelHeadLayout = new javax.swing.GroupLayout(JPanelHead);
        JPanelHead.setLayout(JPanelHeadLayout);
        JPanelHeadLayout.setHorizontalGroup(
            JPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHeadLayout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addGap(0, 618, Short.MAX_VALUE))
        );
        JPanelHeadLayout.setVerticalGroup(
            JPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo)
        );

        JPanelBody.setBackground(java.awt.Color.white);
        JPanelBody.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jButtonTurma.setText("Gerenciar Turmas");
        jButtonTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTurmaMouseClicked(evt);
            }
        });

        jButtonAula.setText("Gerenciar Aulas");
        jButtonAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAulaActionPerformed(evt);
            }
        });

        jButtonAluno.setText("Gerenciar Alunos");

        jLabelTurma.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemTurma.png"))); // NOI18N
        jLabelTurma.setText("Turma");

        jLabelAula.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/ico_espaco.gif"))); // NOI18N
        jLabelAula.setText("Aula");

        jLabelAluno.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/aluno.png"))); // NOI18N
        jLabelAluno.setText("Aluno");

        javax.swing.GroupLayout JPanelBodyLayout = new javax.swing.GroupLayout(JPanelBody);
        JPanelBody.setLayout(JPanelBodyLayout);
        JPanelBodyLayout.setHorizontalGroup(
            JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTurma)
                    .addComponent(jLabelAula)
                    .addComponent(jLabelAluno))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonAula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jButtonAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelBodyLayout.setVerticalGroup(
            JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTurma)
                    .addComponent(jLabelTurma))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAula)
                    .addComponent(jLabelAula))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAluno)
                    .addComponent(jLabelAluno)))
        );

        MenuFileHome.setText("Arquivo");

        MenuItemNovaTurmaHome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemNovaTurmaHome.setText("Turma");
        MenuItemNovaTurmaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNovaTurmaHomeActionPerformed(evt);
            }
        });
        MenuFileHome.add(MenuItemNovaTurmaHome);

        MenuBarHome.add(MenuFileHome);

        setJMenuBar(MenuBarHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAulaActionPerformed

    private void jButtonTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTurmaMouseClicked
        TurmaFrame Turma = new TurmaFrame();
        Turma.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonTurmaMouseClicked

    private void MenuItemNovaTurmaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNovaTurmaHomeActionPerformed
        TurmaFrame Turma = new TurmaFrame();
        Turma.setVisible(true);
    }//GEN-LAST:event_MenuItemNovaTurmaHomeActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBody;
    private javax.swing.JPanel JPanelHead;
    private javax.swing.JMenuBar MenuBarHome;
    private javax.swing.JMenu MenuFileHome;
    private javax.swing.JMenuItem MenuItemNovaTurmaHome;
    private javax.swing.JButton jButtonAluno;
    private javax.swing.JButton jButtonAula;
    private javax.swing.JButton jButtonTurma;
    private javax.swing.JLabel jLabelAluno;
    private javax.swing.JLabel jLabelAula;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTurma;
    // End of variables declaration//GEN-END:variables
}

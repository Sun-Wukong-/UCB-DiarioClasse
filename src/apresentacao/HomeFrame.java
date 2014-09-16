package apresentacao;


public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
    }

 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelHead = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        JPanelBody = new javax.swing.JPanel();
        JButtonTurma = new javax.swing.JButton();
        JButtonAula = new javax.swing.JButton();
        JButtonAluno = new javax.swing.JButton();
        JLabelTurma = new javax.swing.JLabel();
        JLabelAula = new javax.swing.JLabel();
        JLabelAluno = new javax.swing.JLabel();
        JMenuBar = new javax.swing.JMenuBar();
        JMenuHome = new javax.swing.JMenu();
        JMenuItemTurma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        JPanelHead.setBackground(new java.awt.Color(204, 204, 204));
        JPanelHead.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JLabelTitulo.setText("Diario de Classe");

        javax.swing.GroupLayout JPanelHeadLayout = new javax.swing.GroupLayout(JPanelHead);
        JPanelHead.setLayout(JPanelHeadLayout);
        JPanelHeadLayout.setHorizontalGroup(
            JPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHeadLayout.createSequentialGroup()
                .addComponent(JLabelTitulo)
                .addGap(0, 238, Short.MAX_VALUE))
        );
        JPanelHeadLayout.setVerticalGroup(
            JPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelTitulo)
        );

        JPanelBody.setBackground(java.awt.Color.white);
        JPanelBody.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        JButtonTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonTurma.setText("Gerenciar Turmas");
        JButtonTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonTurmaMouseClicked(evt);
            }
        });

        JButtonAula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonAula.setText("Gerenciar Aulas");
        JButtonAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAulaActionPerformed(evt);
            }
        });

        JButtonAluno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonAluno.setText("Gerenciar Alunos");

        JLabelTurma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemTurma.png"))); // NOI18N
        JLabelTurma.setText("Turma");

        JLabelAula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAula.gif"))); // NOI18N
        JLabelAula.setText("Aula");

        JLabelAluno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAluno.png"))); // NOI18N
        JLabelAluno.setText("Aluno");

        javax.swing.GroupLayout JPanelBodyLayout = new javax.swing.GroupLayout(JPanelBody);
        JPanelBody.setLayout(JPanelBodyLayout);
        JPanelBodyLayout.setHorizontalGroup(
            JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelTurma)
                    .addComponent(JLabelAula)
                    .addComponent(JLabelAluno))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JButtonAula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(JButtonAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelBodyLayout.setVerticalGroup(
            JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonTurma)
                    .addComponent(JLabelTurma))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonAula)
                    .addComponent(JLabelAula))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonAluno)
                    .addComponent(JLabelAluno)))
        );

        JMenuHome.setText("Home");
        JMenuHome.setToolTipText("");

        JMenuItemTurma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItemTurma.setText("Turma");
        JMenuItemTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemTurmaActionPerformed(evt);
            }
        });
        JMenuHome.add(JMenuItemTurma);

        JMenuBar.add(JMenuHome);

        setJMenuBar(JMenuBar);

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
                .addComponent(JPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonAulaActionPerformed

    private void JButtonTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonTurmaMouseClicked
        TurmaFrame Turma = new TurmaFrame();
        Turma.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_JButtonTurmaMouseClicked

    private void JMenuItemTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemTurmaActionPerformed
        TurmaFrame Turma = new TurmaFrame();
        Turma.setVisible(true);
    }//GEN-LAST:event_JMenuItemTurmaActionPerformed

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
    private javax.swing.JButton JButtonAluno;
    private javax.swing.JButton JButtonAula;
    private javax.swing.JButton JButtonTurma;
    private javax.swing.JLabel JLabelAluno;
    private javax.swing.JLabel JLabelAula;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JLabel JLabelTurma;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenu JMenuHome;
    private javax.swing.JMenuItem JMenuItemTurma;
    private javax.swing.JPanel JPanelBody;
    private javax.swing.JPanel JPanelHead;
    // End of variables declaration//GEN-END:variables
}

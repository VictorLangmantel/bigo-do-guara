

package admin;


public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuGerenciarCidade = new javax.swing.JMenuItem();
        menuListarCidade = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Pessoa");

        jMenuItem2.setText("Gerenciar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Listar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cidade");

        menuGerenciarCidade.setText("Gerenciar");
        menuGerenciarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarCidadeActionPerformed(evt);
            }
        });
        jMenu2.add(menuGerenciarCidade);

        menuListarCidade.setText("Listar");
        menuListarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarCidadeActionPerformed(evt);
            }
        });
        jMenu2.add(menuListarCidade);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuGerenciarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarCidadeActionPerformed
        
        CidadeTela tela = new CidadeTela();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true); 
    }//GEN-LAST:event_menuGerenciarCidadeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        PessoaTela tela = new PessoaTela();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      
        PessoaListar tela = new PessoaListar();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuListarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarCidadeActionPerformed
       
        CidadeListar tela = new CidadeListar();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        tela.setVisible(true); 
    }//GEN-LAST:event_menuListarCidadeActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem menuGerenciarCidade;
    private javax.swing.JMenuItem menuListarCidade;
    // End of variables declaration//GEN-END:variables
}

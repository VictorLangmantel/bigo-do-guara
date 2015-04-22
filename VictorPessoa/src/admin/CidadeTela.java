

package admin;

import dao.CidadeDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cidade;


public class CidadeTela extends javax.swing.JFrame {
     
    private List<Cidade> lista;
    private Integer posicao;
    
   
   
    public CidadeTela() {
        CidadeDAO dao = new CidadeDAO();
        initComponents();
        lista = dao.listar();
        posicao = 0;
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        primeiro = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        butultimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Cidade");

        jLabel2.setText("Nome:");

        jLabel3.setText("Código:");

        txtcodigo.setEnabled(false);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        primeiro.setText("Primeiro");
        primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        proximo.setText("Próximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        butultimo.setText("Último");
        butultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(primeiro)
                .addGap(18, 18, 18)
                .addComponent(anterior)
                .addGap(18, 18, 18)
                .addComponent(proximo)
                .addGap(18, 18, 18)
                .addComponent(butultimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primeiro)
                    .addComponent(anterior)
                    .addComponent(proximo)
                    .addComponent(butultimo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrar)
                .addGap(18, 18, 18)
                .addComponent(limpar)
                .addGap(18, 18, 18)
                .addComponent(excluir)
                .addGap(18, 18, 18)
                .addComponent(consultar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(limpar)
                    .addComponent(excluir)
                    .addComponent(consultar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void butultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butultimoActionPerformed
        
         if(lista.size() > 0)
        {
            posicao = lista.size() - 1;
            Cidade cidade = lista.get(posicao);
            txtcodigo.setText(cidade.getCodigo().toString());
            txtnome.setText(cidade.getNome()); 
        }
    }//GEN-LAST:event_butultimoActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if (txtcodigo.getText().isEmpty()==false)
        {
            CidadeDAO dao = new CidadeDAO();
            Boolean deucerto = dao.excluir(lista.get(posicao));
            if(deucerto==true)
            {
                JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso");
                lista = dao.listar();
                Limpar();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "ERRO ao excluir");
            }
            
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroActionPerformed
        
        if(lista.size() > 0)
        {
            posicao = 0; 
            Cidade cidade = lista.get(0);
            txtcodigo.setText(cidade.getCodigo().toString());
            txtnome.setText(cidade.getNome()); 
        }
    }//GEN-LAST:event_primeiroActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
       
        if(posicao > 0)
        {
            posicao = posicao -1; 
            Cidade cidade = lista.get(posicao);
            txtcodigo.setText(cidade.getCodigo().toString());
            txtnome.setText(cidade.getNome()); 
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        
        if(posicao < lista.size() - 1)
        {
            posicao = posicao + 1;  
            Cidade cidade = lista.get(posicao);
            txtcodigo.setText(cidade.getCodigo().toString());
            txtnome.setText(cidade.getNome()); 
        }
    }//GEN-LAST:event_proximoActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
       
        Cidade item = new Cidade(); 
        if(txtnome.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos obrigatorios");
        }
        else
        {
            item.setNome(txtnome.getText());
            
                CidadeDAO dao = new CidadeDAO();
           
            boolean deucerto = dao.inserir(item);
            if(deucerto = true)
            {
                JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar");
            }
            
            
            lista = dao.listar();
          
            Limpar();
            
        }
    }//GEN-LAST:event_cadastrarActionPerformed
    private void Limpar()
    {
        txtcodigo.setText("");
        txtnome.setText("");
    }
    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
       
        Limpar();
    }//GEN-LAST:event_limparActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
       
        String consulta = JOptionPane.showInputDialog("Digite o nome da cidade:");
        
        Integer posicaoachou = 0;
        Boolean encontrou = false; 
        if(consulta.isEmpty() == false)
        {
            for (Cidade cidade : lista){
                
                if(consulta.equals(cidade.getNome()))
                {
                    encontrou = true; 
                   txtnome.setText(cidade.getNome());
                   txtcodigo.setText(cidade.getCodigo().toString());
       
                   posicao=posicaoachou;
                   break;
                }
                posicaoachou ++; 
               
            }
        }
        if(encontrou == false)
        {
            JOptionPane.showMessageDialog(rootPane, "Pessoa não encontrada");
        }
    }//GEN-LAST:event_consultarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton butultimo;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpar;
    private javax.swing.JButton primeiro;
    private javax.swing.JButton proximo;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}

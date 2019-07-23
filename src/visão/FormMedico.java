package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloDao.DaoMedico;
import modeloBeans.BeansMedico;
import modeloBeans.ModeloTabela;

public class FormMedico extends javax.swing.JFrame {

   BeansMedico mod = new BeansMedico();
   DaoMedico control = new DaoMedico();
   ConexaoBD conex = new ConexaoBD();
   int flag = 0;
   
    public FormMedico() {
      initComponents();
      preencherTabela("select *from medicos order by nome_medico");

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldCrm = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxEspecialista = new javax.swing.JComboBox();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtCOD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel3.setText("CRM:");

        jLabel4.setText("Especialização:");

        jFormattedTextFieldCrm.setEnabled(false);
        jFormattedTextFieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCrmActionPerformed(evt);
            }
        });

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jComboBoxEspecialista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cirugião", "Clínico", "Pediatra", "Generalista" }));
        jComboBoxEspecialista.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salva");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        jLabel5.setText("Pesquisa:");

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisa");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel6.setText("ID:");

        jtCOD.setEnabled(false);
        jtCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCODActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEspecialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonPesquisar))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEspecialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovo)
                    .addComponent(jLabel6)
                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPesquisar)
                            .addComponent(jTextFieldPesquisa)
                            .addComponent(jLabel5))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE MÉDICOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(747, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty()){   // campo não pode está vazio
            JOptionPane.showMessageDialog(null,"preenchar o Nome:");
            jTextFieldNome.requestFocus(); //foca na variavel
        } else if(jFormattedTextFieldCrm.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preemchar o CRM");
            jFormattedTextFieldCrm.requestFocus(); //foca na variavel
        } else
        
     if(flag==1){     // flag de altenando entre salva e editar
     mod.setNome(jTextFieldNome.getText());
     mod.setEspecialidade((String) jComboBoxEspecialista.getSelectedItem());
     mod.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
     control.Salvar(mod);
     //limpar campos
     jTextFieldNome.setText("");
     jFormattedTextFieldCrm.setText("");
     //bloqueando campos
     jTextFieldNome.setEnabled(false);
     jFormattedTextFieldCrm.setEnabled(false);
     jComboBoxEspecialista.setEnabled(false);
     jButtonSalvar.setEnabled(false);
     jButtonCancelar.setEnabled(false);
     
     preencherTabela("select *from medicos order by nome_medico");
     } else {
         mod.setCodigo(Integer.parseInt(jtCOD.getText()));
         mod.setNome(jTextFieldNome.getText());
         mod.setEspecialidade((String)jComboBoxEspecialista.getSelectedItem());
         mod.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
         control.Editar(mod);
      ////////////////////////////   
     jtCOD.setText("");
     jTextFieldNome.setText("");
     jFormattedTextFieldCrm.setText("");
     // DESABILITANDO
     jTextFieldNome.setEnabled(false);
     jFormattedTextFieldCrm.setEnabled(false);
     jComboBoxEspecialista.setEnabled(false);
     jButtonSalvar.setEnabled(false);
         
     jTextFieldPesquisa.setEnabled(true);
     jButtonPesquisar.setEnabled(true);
     
     jButtonNovo.setEnabled(true);
     jButtonCancelar.setEnabled(false);
     
     preencherTabela("select *from medicos order by nome_medico");
     }
     
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCrmActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jComboBoxEspecialista.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        
        jtCOD.setText("");
     jTextFieldNome.setText("");
     jFormattedTextFieldCrm.setText("");
        jTextFieldPesquisa.setText("");
        
        jButtonEditar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false );
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
       mod.setPesquisa(jTextFieldPesquisa.getText());  // setagem de do campo pesquisa
       BeansMedico model  =  control.buscaMedico(mod); // vai fazeer a pesquisa e vai volta um modelo
       
       jtCOD.setText(String.valueOf(model.getCodigo()));
       jTextFieldNome.setText(model.getNome()); //
       jComboBoxEspecialista.setSelectedItem(model.getEspecialidade());
       jFormattedTextFieldCrm.setText(String.valueOf(mod.getCrm()));
       
       jButtonEditar.setEnabled(true);
       jButtonExcluir.setEnabled(true);

       
       
       preencherTabela("select *from medicos where nome_medico like'%"+mod.getPesquisa()+"%'"); // BUSCA TODOS QUE CONTA A,B....
       
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    
    
    
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCrm.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jComboBoxEspecialista.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
        jtCOD.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCrm.setText("");
        jTextFieldPesquisa.setText("");
        
        jButtonEditar.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisa.setEnabled(true);
        
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jComboBoxEspecialista.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
           
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jtCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCODActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"deseja realmente excluir");
        if(resposta == JOptionPane.YES_OPTION){
        mod.setCodigo(Integer.parseInt(jtCOD.getText()));
        control.Excluir(mod);
        
     jtCOD.setText("");
     jTextFieldNome.setText("");
     jFormattedTextFieldCrm.setText("");
     // DESABILITANDO
     jTextFieldNome.setEnabled(false);
     jFormattedTextFieldCrm.setEnabled(false);
     jComboBoxEspecialista.setEnabled(false);
     
     jButtonSalvar.setEnabled(false);
     jButtonNovo.setEnabled(true);
     jButtonCancelar.setEnabled(false);
     jButtonEditar.setEnabled(false);
     jButtonExcluir.setEnabled(false);
     
     preencherTabela("select *from medicos order by nome_medico");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed
      
      // ATRAVES DO EVENTO TABLE, AO SELECIONAR A COLUNA PARA EDITA
    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
       String nome_medico =""+jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(),1);   //o que for selecionado na table 
       conex.conexao();
       conex.executaSql("select *from medicos where nome_medico='"+nome_medico+"'");
       try{
       conex.rs.first();                                                                      // primeiro do banco    
       jtCOD.setText(String.valueOf(conex.rs.getInt("cod_medico")));
       jTextFieldNome.setText(conex.rs.getString("nome_medico"));
       jComboBoxEspecialista.setSelectedItem(conex.rs.getString("especialidade_medico"));
       jFormattedTextFieldCrm.setText(conex.rs.getString("crm_medico"));
       }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados\n Erro:  "+ex);
       }
       conex.desconecta();
       jButtonEditar.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       
       
       
    }//GEN-LAST:event_jTableMedicosMouseClicked

    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();   // instancia da arraylist
        String [] colunas = new String[]{"ID","Nome","Especialidade","Crm"};   // recebe o nomes das colunas
        conex.conexao();
        conex.executaSql(Sql);
        try{
        conex.rs.first();
        do{
            dados.add(new Object[]{conex.rs.getInt("cod_medico"),
                                   conex.rs.getString("nome_medico"),
                                   conex.rs.getString("especialidade_medico"), 
                                   conex.rs.getInt("crm_medico")});
        }while(conex.rs.next());  // quanto houve dados na base será exibido
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(rootPane,"Busque por outro médico");
        }
            ModeloTabela modelo = new ModeloTabela(dados, colunas);  // quantidade de linhas e colunas
        jTableMedicos.setModel(modelo);                                 // passando modelo da tabela
        jTableMedicos.getColumnModel().getColumn(0).setPreferredWidth(23);   //tamanha da tabela, começa do zero, espaço da coluna
        jTableMedicos.getColumnModel().getColumn(0).setResizable(false);     // desabilidado para redimensionar
        jTableMedicos.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableMedicos.getColumnModel().getColumn(1).setResizable(false);
        jTableMedicos.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTableMedicos.getColumnModel().getColumn(2).setResizable(false);
        jTableMedicos.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableMedicos.getColumnModel().getColumn(3).setResizable(false);
        jTableMedicos.getTableHeader().setReorderingAllowed(false); // desabilitado para reodenar
        jTableMedicos.setAutoResizeMode(jTableMedicos.AUTO_RESIZE_OFF); // desabilidata para redimensionar a tabela
        jTableMedicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // apenas seleciona um dado por vez
        conex.desconecta();
    }
    
    
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
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxEspecialista;
    private javax.swing.JFormattedTextField jFormattedTextFieldCrm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jtCOD;
    // End of variables declaration//GEN-END:variables
}

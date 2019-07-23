package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansPaciente;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoPaciente;

/**
 *
 * @author Eduardo
 */
public class FormPaciente extends javax.swing.JFrame {

   
    int flag= 0;
   BeansPaciente pac = new BeansPaciente();
   DaoPaciente dao = new DaoPaciente();
   ConexaoBD conex = new ConexaoBD();
    
    
    
    public FormPaciente() {
        initComponents();
        preencharBairros();  // buscando dados de duas tabelas: tabela paciente e a tabela bairro com uma coluna do bainome
        preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from  pacientes inner join  bairro on paci_baicodigo = baicodigo order by paci_nome");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldNasc = new javax.swing.JTextField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jComboBoxBairros = new javax.swing.JComboBox();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jtCOD = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel3.setText("Data de nacismento:");

        jLabel4.setText("RG:");

        jLabel5.setText("Telefone:");

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldNasc.setEnabled(false);

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRG.setEnabled(false);

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Rua:");

        jLabel8.setText("Cep:");

        jLabel9.setText("Complemento:");

        jLabel10.setText("Bairro:");

        jTextFieldRua.setEnabled(false);

        jTextFieldComplemento.setEnabled(false);

        jComboBoxBairros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBairros.setEnabled(false);
        jComboBoxBairros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBairrosActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCep.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxBairros, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBairros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel6.setText("Endereço");

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel11.setText("Pesquisar Paciente");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jtCOD.setEnabled(false);

        jLabel12.setText("COD:");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonNovo))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulário de Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(671, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  // PREENCHIMENDO DO COMBOBOX BAIRROS, BUSCA PELA TABELA
    public void  preencharBairros(){
        conex.conexao();
        conex.executaSql("select *from bairro order by bainome");
        try {
            conex.rs.first();
            jComboBoxBairros.removeAllItems();
            do{
            jComboBoxBairros.addItem(conex.rs.getString("bainome"));        
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"Erro ao preencher Bairros\n Erro: "+ex);
        }
        conex.desconecta();
    }
    
    
    
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
    int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"deseja realmente excluir");
        if(resposta == JOptionPane.YES_OPTION){
        pac.setCodPac(Integer.parseInt(jtCOD.getText()));
        dao.excluir(pac);
        
        preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from  pacientes inner join  bairro on paci_baicodigo = baicodigo order by paci_nome");
        
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if(jTextFieldNome.getText().isEmpty()){   // campo não pode está vazio
            JOptionPane.showMessageDialog(null,"preenchar o Nome:");
            jTextFieldNome.requestFocus(); //foca na variavel
        } else if(jTextFieldNasc.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preemchar a Data de Nascimento");
            jTextFieldNasc.requestFocus(); //foca na variavel
        } else if(jFormattedTextFieldRG.getText().equals("  .   .  -  ")){
            JOptionPane.showMessageDialog(null,"preemchar o RG");
            jFormattedTextFieldRG.requestFocus(); //foca na variavel
        } else if(jFormattedTextFieldTelefone.getText().equals("(  )     -      ")){
            JOptionPane.showMessageDialog(null,"preemchar o Telefone");
            jFormattedTextFieldTelefone.requestFocus(); //foca na variavel
        }  else if(jTextFieldRua.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preemchar a RUA");
            jTextFieldRua.requestFocus(); //foca na variavel
        } else if(jFormattedTextFieldCep.getText().equals("      -  ")){
            JOptionPane.showMessageDialog(null,"preemchar o CEP");
            jFormattedTextFieldCep.requestFocus(); //foca na variavel
        } else if(jTextFieldComplemento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preemchar o Complemento");
            jTextFieldComplemento.requestFocus(); //foca na variavel
        } else 
     if(flag==1){     
     pac.setNomePac(jTextFieldNome.getText());
     pac.setRg(jFormattedTextFieldRG.getText());
     pac.setTelefone(jFormattedTextFieldTelefone.getText());
     pac.setRua(jTextFieldRua.getText());
     pac.setCep(jFormattedTextFieldCep.getText());
     pac.setComplemento(jTextFieldComplemento.getText());
     pac.setNomeBairro((String)jComboBoxBairros.getSelectedItem());
     pac.setNasc(jTextFieldNasc.getText());
     dao.salvar(pac);
     
   jTextFieldNome.setEnabled(false);
   jTextFieldNasc.setEnabled(false);
   jFormattedTextFieldRG.setEnabled(false);
   jFormattedTextFieldCep.setEnabled(false);
   jFormattedTextFieldTelefone.setEnabled(false);
   jTextFieldComplemento.setEnabled(false);
   jTextFieldRua.setEnabled(false);
   
   jButtonEditar.setEnabled(false);
   jButtonCancelar.setEnabled(false);
   jButtonSalvar.setEnabled(false);
   jButtonNovo.setEnabled(true);
   jButtonExcluir.setEnabled(false);
      jtCOD.setText("");
        jTextFieldNome.setText("");
   jTextFieldNasc.setText("");
   jFormattedTextFieldRG.setText("");
   jFormattedTextFieldCep.setText("");
   jFormattedTextFieldTelefone.setText("");
   jTextFieldComplemento.setText("");
   jTextFieldRua.setText("");
   preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from  pacientes inner join  bairro on paci_baicodigo = baicodigo order by paci_nome");
     
     }else{
         pac.setNomePac(jTextFieldNome.getText());
         pac.setCep(jFormattedTextFieldCep.getText());
         pac.setComplemento(jTextFieldComplemento.getText());
         pac.setNasc(jTextFieldNasc.getText());
         pac.setNomeBairro((String)jComboBoxBairros.getSelectedItem());
         pac.setCodPac(Integer.parseInt(jtCOD.getText()));
         pac.setRg(jFormattedTextFieldRG.getText());
         pac.setRua(jTextFieldRua.getText());
          pac.setTelefone(jFormattedTextFieldTelefone.getText());
         dao.editar(pac);
         jTextFieldNome.setEnabled(false);
   jTextFieldNasc.setEnabled(false);
   jFormattedTextFieldRG.setEnabled(false);
   jFormattedTextFieldCep.setEnabled(false);
   jFormattedTextFieldTelefone.setEnabled(false);
   jTextFieldComplemento.setEnabled(false);
   jTextFieldRua.setEnabled(false);
   
   jButtonEditar.setEnabled(false);
   jButtonCancelar.setEnabled(false);
   jButtonSalvar.setEnabled(false);
   jButtonNovo.setEnabled(true);
   jButtonExcluir.setEnabled(false);
      jtCOD.setText("");
        jTextFieldNome.setText("");
   jTextFieldNasc.setText("");
   jFormattedTextFieldRG.setText("");
   jFormattedTextFieldCep.setText("");
   jFormattedTextFieldTelefone.setText("");
   jTextFieldComplemento.setText("");
   jTextFieldRua.setText("");
   
    preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from  pacientes inner join  bairro on paci_baicodigo = baicodigo order by paci_nome");
         
         
     }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
   flag =1;
        
   jTextFieldNome.setEnabled(true);
   jTextFieldNasc.setEnabled(true);
   jFormattedTextFieldRG.setEnabled(true);
   jFormattedTextFieldCep.setEnabled(true);
   jFormattedTextFieldTelefone.setEnabled(true);
   jTextFieldComplemento.setEnabled(true);
   jTextFieldRua.setEnabled(true);
   jComboBoxBairros.setEnabled(true);
   
   
   jButtonEditar.setEnabled(false);
   jButtonCancelar.setEnabled(true);
   jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        
        jtCOD.setText("");
        jTextFieldNome.setText("");
   jTextFieldNasc.setText("");
   jFormattedTextFieldRG.setText("");
   jFormattedTextFieldCep.setText("");
   jFormattedTextFieldTelefone.setText("");
   jTextFieldComplemento.setText("");
   jTextFieldRua.setText("");
        
        preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from  pacientes inner join  bairro on paci_baicodigo = baicodigo order by paci_nome");
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
    flag = 2;
   
    jTextFieldNome.setEnabled(true);
   jTextFieldNasc.setEnabled(true);
   jFormattedTextFieldRG.setEnabled(true);
   jFormattedTextFieldCep.setEnabled(true);
   jFormattedTextFieldTelefone.setEnabled(true);
   jTextFieldComplemento.setEnabled(true);
   jTextFieldRua.setEnabled(true);
   
   jButtonEditar.setEnabled(false);
   jButtonCancelar.setEnabled(true);
   jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
    jComboBoxBairros.setEnabled(true);
     
        
        preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from  pacientes inner join  bairro on paci_baicodigo = baicodigo order by paci_nome");
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        pac.setPesquisa(jTextFieldPesquisa.getText());
        BeansPaciente pac1 = dao.buscaPaciente(pac);
        jTextFieldNome.setText(pac1.getNomePac());
        jtCOD.setText(String.valueOf(pac1.getCodPac()));
        jTextFieldNasc.setText(pac1.getNasc());
        jFormattedTextFieldRG.setText(pac1.getRg());
        jFormattedTextFieldTelefone.setText(pac1.getTelefone());
        jTextFieldRua.setText(pac1.getRua());
        jFormattedTextFieldCep.setText(pac1.getCep());
        jTextFieldComplemento.setText(pac1.getComplemento());
        jComboBoxBairros.setSelectedItem(pac1.getNomeBairro());
       
        preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from  pacientes inner join  bairro on paci_baicodigo = baicodigo order by paci_nome");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
String paci_nome =""+jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(),1);   //o que for selecionado na table 
       conex.conexao();
       conex.executaSql("select *from pacientes where paci_nome='"+paci_nome+"'");
       try{
       conex.rs.first();                                                                      // primeiro do banco    
       jtCOD.setText(String.valueOf(conex.rs.getInt("paci_codigo")));
       jTextFieldNome.setText(conex.rs.getString("paci_nome"));
       jFormattedTextFieldRG.setText(conex.rs.getString("paci_rg"));
       jFormattedTextFieldCep.setText(conex.rs.getString("paci_cep"));
       jTextFieldNasc.setText(conex.rs.getString("paci_nasc"));
       jFormattedTextFieldTelefone.setText(conex.rs.getString("paci_telefone"));
       jTextFieldRua.setText(conex.rs.getString("paci_rua"));
       jTextFieldComplemento.setText(conex.rs.getString("paci_complemento"));
       ///////// IMPORTANTE  A TROCA DE TABELA E SABE USA COLUNA ESTRANGEIRA  COM TROCA DE CONEXÃO
       ConexaoBD conexPesquisa = new ConexaoBD();
       conexPesquisa.conexao();
       conexPesquisa.executaSql("select *from bairro where baicodigo ="+conex.rs.getInt("paci_baicodigo"));
       conexPesquisa.rs.first();
       jComboBoxBairros.setSelectedItem(conexPesquisa.rs.getString("bainome"));
       conexPesquisa.desconecta();
       
       }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados\n Erro:  "+ex);
       }
       conex.desconecta();
       
       preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from  pacientes inner join  bairro on paci_baicodigo = baicodigo order by paci_nome");
    jTextFieldNome.setEnabled(false);
   jTextFieldNasc.setEnabled(false);
   jFormattedTextFieldRG.setEnabled(false);
   jFormattedTextFieldCep.setEnabled(false);
   jFormattedTextFieldTelefone.setEnabled(false);
   jTextFieldComplemento.setEnabled(false);
   jTextFieldRua.setEnabled(false);
   
   jButtonEditar.setEnabled(true);
   jButtonCancelar.setEnabled(false);
   jButtonSalvar.setEnabled(false);
   jButtonNovo.setEnabled(true);
   jButtonExcluir.setEnabled(true);
       
        
        
        
        
    }//GEN-LAST:event_jTablePacientesMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
          jTextFieldNome.setEnabled(false);
   jTextFieldNasc.setEnabled(false);
   jFormattedTextFieldRG.setEnabled(false);
   jFormattedTextFieldCep.setEnabled(false);
   jFormattedTextFieldTelefone.setEnabled(false);
   jTextFieldComplemento.setEnabled(false);
   jTextFieldRua.setEnabled(false);
   
   
   jButtonEditar.setEnabled(false);
   jButtonCancelar.setEnabled(false);
   jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
   
        
        
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxBairrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBairrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBairrosActionPerformed

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();   // instancia da arraylist
        String [] colunas = new String[]{"ID","Nome","RG","Telefone","Bairro"};   // recebe o nomes das colunas
        conex.conexao();
        conex.executaSql(Sql);
        try{
        conex.rs.first();
        do{
            dados.add(new Object[]{conex.rs.getInt("paci_codigo"),
                                   conex.rs.getString("paci_nome"),
                                   conex.rs.getString("paci_rg"),
                                   conex.rs.getString("paci_telefone"),
                                   conex.rs.getString("bainome")});  // variavel de outra tabela
        }while(conex.rs.next());  // quanto houve dados na base será exibido
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(rootPane,"Busque por outro médico");
        }
            ModeloTabela modelo = new ModeloTabela(dados, colunas);  // quantidade de linhas e colunas
        jTablePacientes.setModel(modelo);                                 // passando modelo da tabela
        jTablePacientes.getColumnModel().getColumn(0).setPreferredWidth(23);   //tamanha da tabela, começa do zero, espaço da coluna
        jTablePacientes.getColumnModel().getColumn(0).setResizable(false);     // desabilidado para redimensionar
        jTablePacientes.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTablePacientes.getColumnModel().getColumn(1).setResizable(false);
        jTablePacientes.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTablePacientes .getColumnModel().getColumn(2).setResizable(false);
        jTablePacientes.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTablePacientes.getColumnModel().getColumn(3).setResizable(false);
        jTablePacientes.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTablePacientes.getColumnModel().getColumn(4).setResizable(false);
        
        jTablePacientes.getTableHeader().setReorderingAllowed(false); // desabilitado para reodenar
        jTablePacientes.setAutoResizeMode(jTablePacientes.AUTO_RESIZE_OFF); // desabilidata para redimensionar a tabela
        jTablePacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // apenas seleciona um dado por vez
        conex.desconecta();
   
    
    
    
    
    }
    
    
    
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
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxBairros;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldNasc;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jtCOD;
    // End of variables declaration//GEN-END:variables
}

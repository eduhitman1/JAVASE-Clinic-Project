package visão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import static modeloConection.ConexaoBD.con;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaPrincipal extends javax.swing.JFrame {
    ConexaoBD conecta = new ConexaoBD();   // instanci do banco
    FormMedico tela = new FormMedico();
    FormUsuario telaUsu = new FormUsuario();
    FormPaciente telaPac = new FormPaciente();
    
    FormAgendamento telaAge = new FormAgendamento();
    
    
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();   // chamada da class conexoaBD
         
        //esse método seta Imagens no nosso Label referente ao Banco de Dados
        /*if(conecta !=null){
            jLabelBancoDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("Diretório da Imagem")));
         }else{
            jLabelBancoDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("Diretório da segunda opção de imagem")));
         }*/
        
    }

    TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jButtonAgenda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonCadPacientes = new javax.swing.JButton();
        jButtonCadEnfermeiras = new javax.swing.JButton();
        jButtonCadMedico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelBancoDados = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuItemEnfermeira = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemPacientes = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBenvindo = new javax.swing.JMenuItem();
        jMenuAgenda = new javax.swing.JMenu();
        jMenuItemAgenda = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Agendamento");
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonAgenda);
        jButtonAgenda.setBounds(20, 190, 120, 120);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Agenda -");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(40, 160, 70, 15);

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        jButtonCadPacientes.setToolTipText("Registra Paciente");
        jButtonCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacientesActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(270, 30, 100, 120);

        jButtonCadEnfermeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        jButtonCadEnfermeiras.setToolTipText("Registra Enfermeira");
        jButtonCadEnfermeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEnfermeirasActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadEnfermeiras);
        jButtonCadEnfermeiras.setBounds(150, 30, 110, 120);

        jButtonCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadMedico.setToolTipText("Registra Médico");
        jButtonCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMedico);
        jButtonCadMedico.setBounds(20, 30, 120, 120);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cadastros -");
        jPanelInternal.add(jLabel2);
        jLabel2.setBounds(40, 10, 80, 15);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 790, 340);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 40, 790, 350);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de gerenciamento de:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 260, 20);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela Bem-vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(710, 0, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 10, 810, 430);

        jLabel4.setText("Usuário:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 450, 60, 14);

        jLabelUsuario.setText("jLabel5");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(80, 450, 110, 14);

        jLabelBancoDados.setText("Validação banco conectado ou não ");
        getContentPane().add(jLabelBancoDados);
        jLabelBancoDados.setBounds(500, 450, 190, 14);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 810, 480);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadMedico.setText("Médicos ");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadMedico);

        jMenuItemCadPaciente.setText("Pacientes");
        jMenuItemCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadPaciente);

        jMenuItemEnfermeira.setText("Enfermeiras");
        jMenuCadastro.add(jMenuItemEnfermeira);

        jMenuItemUsuarios.setText("Usuários");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenu2.setText("Relatórios");

        jMenuItemPacientes.setText("Relatório De Pacientes");
        jMenuItemPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPacientesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPacientes);

        jMenuItem2.setText("Relatório De Médicos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBenvindo.setText("Tela Bem - vindos");
        jMenuItemTelaBenvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBenvindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBenvindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuAgenda.setText("Agenda");

        jMenuItemAgenda.setText("Agenda Hoje");
        jMenuItemAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemAgendaMouseClicked(evt);
            }
        });
        jMenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMenuItemAgenda);

        jMenuItem1.setText("Agenda Médico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMenuItem1);

        jMenuBar1.add(jMenuAgenda);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSairMouseClicked(evt);
            }
        });
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(827, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacienteActionPerformed
                      try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("administrador")){
                if(telaPac==null){                       
                       telaPac = new FormPaciente();      //FormMedico tela = new FormMedico();
                       telaPac.setResizable(false);     //tela.setVisible(true);
                }else{
                        telaPac.setVisible(true);
                        telaPac.setResizable(false);
                }
            } else {
                JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!");
            }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!\n Erro: "+ex);
        }
    }//GEN-LAST:event_jMenuItemCadPacienteActionPerformed

    private void jButtonCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacientesActionPerformed
try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("administrador")){
                if(telaPac==null){                       
                       telaPac = new FormPaciente();      //FormMedico tela = new FormMedico();
                       telaPac.setResizable(false);     //tela.setVisible(true);
                }else{
                        telaPac.setVisible(true);
                        telaPac.setResizable(false);
                }
            } else {
                JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!");
            }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!\n Erro: "+ex);
        }        
    }//GEN-LAST:event_jButtonCadPacientesActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
      jInternalFrameBemVindo.dispose();       
        
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
     conecta.desconecta();
       System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBenvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBenvindoActionPerformed

     jInternalFrameBemVindo.setVisible(true);

    }//GEN-LAST:event_jMenuItemTelaBenvindoActionPerformed

    private void jButtonCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicoActionPerformed
            try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("administrador")){
               if(tela==null){                       //para não dubliccar tela
                       tela = new FormMedico();      //FormMedico tela = new FormMedico();
                       tela.setResizable(false);     //tela.setVisible(true);
                }else{
                        tela.setVisible(true);
                        tela.setResizable(false);
                }
               } else {
                JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!");
            }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!\n Erro: "+ex);
        }
    }//GEN-LAST:event_jButtonCadMedicoActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
            try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("administrador")){
                if(tela==null){                       
                       tela = new FormMedico();      //FormMedico tela = new FormMedico();
                       tela.setResizable(false);     //tela.setVisible(true);
                }else{
                        tela.setVisible(true);
                        tela.setResizable(false);
                }
            } else {
                JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!");
            }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!\n Erro: "+ex);
        }
    
            
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jMenuItemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairMouseClicked

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
             try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            
            if(conecta.rs.getString("usu_tipo").equals("administrador")){
                 if(telaUsu==null){                 // para não ser dublica a tela
                       telaUsu = new FormUsuario();      //FormMedico tela = new FormMedico();
                       telaUsu.setResizable(false);     //tela.setVisible(true);
                }else{
                        telaUsu.setVisible(true);
                        telaUsu.setResizable(false);
                }
                
            } else {
                JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!");
            }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!\n Erro: "+ex);
        }
        
        
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jButtonCadEnfermeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEnfermeirasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadEnfermeirasActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed

                    try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("administrador")){
               if(telaAge==null){                       //para não dubliccar tela
                       telaAge = new FormAgendamento();      //FormMedico tela = new FormMedico();
                       telaAge.setResizable(false);     //tela.setVisible(true);
                }else{
                        telaAge.setVisible(true);
                        telaAge.setResizable(false);
                }
               } else {
                JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!");
            }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Acesso somente para login Administrador, contate o administrador!\n Erro: "+ex);
        }
        
        
    }//GEN-LAST:event_jButtonAgendaActionPerformed

    private void jMenuItemAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAgendaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAgendaMouseClicked

    private void jMenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaActionPerformed
        FormAgenda telaAten = new FormAgenda();
        if(telaAten==null){                       //para não dubliccar tela
                       telaAten = new FormAgenda();      //FormMedico tela = new FormMedico();
                       telaAten.setResizable(false);     //tela.setVisible(true);
                }else{
                        telaAten.setVisible(true);
                        telaAten.setResizable(false);
                }

    }//GEN-LAST:event_jMenuItemAgendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  FormAgendaMedico telaMed = new FormAgendaMedico();
        if(telaMed==null){                       //para não dubliccar tela
                       telaMed = new FormAgendaMedico();      //FormMedico tela = new FormMedico();
                       telaMed.setResizable(false);     //tela.setVisible(true);
                }else{
                        telaMed.setVisible(true);
                        telaMed.setResizable(false);
                }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPacientesActionPerformed
  
  conecta.conexao();
  Connection con = ConexaoBD.con;
  //int confirma  = JOptionPane.showConfirmDialog(null, "dejesa Imprimir?","Atenção",JOptionPane.YES_NO_OPTION);
 // if (confirma == JOptionPane.YES_OPTION) {
  try {
  JasperPrint print = JasperFillManager.fillReport("Relatórios/pacientes/Relatório de Pacientes.jasper",null,con);
  JasperViewer.viewReport( print,false);
}catch (  Exception ex ) {
  JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório"+ex);
}    
//}
       /*
        Connection con = ConexaoBD.getConnection();
        int confirma = JOptionPane.showConfirmDialog(null,"Confirma a impressão do relatório? ","atenção",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            String src = "C:/Users/Eduardo/Documents/Relatórios/RelPacientes.jasper";
            JasperPrint  jasperPrint = null;
            try{
            jasperPrint = JasperFillManager.fillReport(src,null,con);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório \n"+ex);
            }
            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);
        }*/ 

    }//GEN-LAST:event_jMenuItemPacientesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
conecta.conexao();
  Connection con = ConexaoBD.con;
  try {
  JasperPrint print = JasperFillManager.fillReport("Relatórios/medicos/Relatório de medicos.jasper",null,con);
  JasperViewer.viewReport( print,false);
}catch (  Exception ex ) {
  JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório"+ex);
}    
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadEnfermeiras;
    private javax.swing.JButton jButtonCadMedico;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBancoDados;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAgenda;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemEnfermeira;
    private javax.swing.JMenuItem jMenuItemPacientes;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBenvindo;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visão;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansAgenda;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoAgenda;

/**
 *
 * @author Eduardo
 */
public class FormAgenda extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
    BeansAgenda agenda = new BeansAgenda();
    BeansAgenda agen = new BeansAgenda();
    DaoAgenda dao = new DaoAgenda();
    
    String dtHoje;
    String status;
    
    public FormAgenda() {
        initComponents();
        
        Calendar data = Calendar.getInstance();  // instacis da calendario
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.format(d);
        
                // data de hoje
        dtHoje = dateFormat.format(d);
        status = "Aberto";
        
        preencherTabela("select *from agenda  inner join pacientes on agenda_codpac=paci_codigo inner join medicos on agenda_codmedico=cod_medico where agenda_data='"+dtHoje+"' and agenda_status='"+status+"' order by agenda_turno");
        
    }
    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();   // instancia da arraylist
        String [] colunas = new String[]{"ID","Nome","Turno","Data","Status","Médico"};   // recebe o nomes das colunas
        conex.conexao();
        conex.executaSql(Sql);
        try{
        conex.rs.first();
        do{
            dados.add(new Object[]{conex.rs.getInt("agenda_cod"),
                                   conex.rs.getString("paci_nome"),
                                   conex.rs.getString("agenda_turno"), 
                                   conex.rs.getString("agenda_data"), 
                                   conex.rs.getString("agenda_status"), 
                                   conex.rs.getString("nome_medico")});
        }while(conex.rs.next());  // quanto houve dados na base será exibido
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(rootPane,"Busque por outro médico");
        }
            ModeloTabela modelo = new ModeloTabela(dados, colunas);  // quantidade de linhas e colunas
        jTableAgenda.setModel(modelo);                                 // passando modelo da tabela
        jTableAgenda.getColumnModel().getColumn(0).setPreferredWidth(30);   //tamanha da tabela, começa do zero, espaço da coluna
        jTableAgenda.getColumnModel().getColumn(0).setResizable(false);     // desabilidado para redimensionar
        jTableAgenda.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTableAgenda.getColumnModel().getColumn(1).setResizable(false);
        jTableAgenda.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableAgenda.getColumnModel().getColumn(2).setResizable(false);
        jTableAgenda.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTableAgenda.getColumnModel().getColumn(3).setResizable(false);
        jTableAgenda.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTableAgenda.getColumnModel().getColumn(4).setResizable(false);
        jTableAgenda.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTableAgenda.getColumnModel().getColumn(5).setResizable(false);
        
        jTableAgenda.getTableHeader().setReorderingAllowed(false); // desabilitado para reodenar
        jTableAgenda.setAutoResizeMode(jTableAgenda.AUTO_RESIZE_OFF); // desabilidata para redimensionar a tabela
        jTableAgenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // apenas seleciona um dado por vez
        conex.desconecta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgenda = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonAtender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgenda);

        jLabel2.setText("Agendamento para Hoje");

        jButtonAtender.setText("Atender Agendamento");
        jButtonAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                    .addComponent(jButtonAtender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAtender)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Agenda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(357, 357, 357))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        setSize(new java.awt.Dimension(802, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgendaMouseClicked

               String agenda_cod =""+jTableAgenda.getValueAt(jTableAgenda.getSelectedRow(),0);   //o que for selecionado na table 
       conex.conexao();
       conex.executaSql("select *from agenda where agenda_cod='"+agenda_cod+"'");
       try{
       conex.rs.first();
       agen.setStatus("Atendimento");
       agen.setAgendaCod(conex.rs.getInt("agenda_cod")); // setando a strint atendomento

       // testando //JOptionPane.showMessageDialog(rootPane, conex.rs.getInt("agenda_cod"));
       }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados\n Erro:  "+ex);
       }
       conex.desconecta();
       
       
       
        
        
        
    }//GEN-LAST:event_jTableAgendaMouseClicked

    private void jButtonAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtenderActionPerformed
    dao.alterar(agen);
        
        preencherTabela("select *from agenda  inner join pacientes on agenda_codpac=paci_codigo inner join medicos on agenda_codmedico=cod_medico where agenda_data='"+dtHoje+"' and agenda_status='"+status+"' order by agenda_turno");
    }//GEN-LAST:event_jButtonAtenderActionPerformed

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
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAgenda;
    // End of variables declaration//GEN-END:variables
}

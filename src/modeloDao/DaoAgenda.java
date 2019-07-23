
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansAgenda;
import modeloConection.ConexaoBD;

/**
 *
 * @author Eduardo
 */
public class DaoAgenda {

    
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexPaciente = new ConexaoBD();
    ConexaoBD conexMedico = new ConexaoBD();
     
    
    
    int codMed;
    int codPac;
    
    
    public void salva(BeansAgenda agenda){
        buscarMedico(agenda.getNomeMed());
        buscarPaciente(agenda.getNomePac());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into agenda (agenda_codpac, agenda_codmedico, agenda_motivo, agenda_turno, agenda_data, agenda_status)values (?,?,?,?,?,?)");
            pst.setInt(1, codPac);
            pst.setInt(2, codMed);
            pst.setString(3, agenda.getMotivo());
            pst.setString(4, agenda.getTurno());
            pst.setDate(5, new java.sql.Date(agenda.getData().getTime()));
            pst.setString(6,agenda.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "agendamento marcado com sucesso");
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "erro ao salva agenda"+ex);
        }
        
        
        conex.desconecta();
        
        
        
        
    }
    
    public void buscarMedico(String nomeMedico){
        conexMedico.conexao();
        conexMedico.executaSql("select *from medicos where nome_medico='"+nomeMedico+"'");
        try {
            conexMedico.rs.first();
            codMed = conexMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"medico não cadastrado");
        }
        
        conexMedico.desconecta();
    }
    
    public int buscarCodMedico(String nomeMedico){
        conexMedico.conexao();
        conexMedico.executaSql("select *from medicos where nome_medico='"+nomeMedico+"'");
        try {
            conexMedico.rs.first();
            codMed = conexMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"medico não cadastrado");
        }
        
        conexMedico.desconecta();
        return codMed;
    }
    
    
    
    public void buscarPaciente(String nomePaciente){
        conexPaciente.conexao();
        conexPaciente.executaSql("select *from pacientes where paci_nome='"+nomePaciente+"'");
        try {
            conexPaciente.rs.first();
            codPac = conexPaciente.rs.getInt("paci_codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"paciente não cadastrado");
        }
        
        conexMedico.desconecta();
        
    }
    
    public void buscarAgendamento(BeansAgenda agenda){
        conexMedico.conexao();
        conexMedico.executaSql("select *from agenda where agenda_data='"+agenda.getData()+"'");
        try {
            conexMedico.rs.first();
            codPac = conexMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"agendamento não encontrado"+ex);
        }
        
        
        
    }
    
    
    
    
    public void alterar(BeansAgenda agenda){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update agenda set agenda_status=? where agenda_cod=?");
            pst.setString(1, agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            
            JOptionPane.showMessageDialog(null,"Agendamento em atendimento");
            pst.execute();
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao atender agendamento\n Erro:"+ex);
        }
       conex.desconecta();
    }
    
    
    public BeansAgenda buscarAgendaPorCodigo(int cod){
        BeansAgenda agen = new BeansAgenda();
        
        conex.conexao();
        conex.executaSql("select *from agenda inner join pacientes on agenda_codpac=paci_codigo inner join medicos on agenda_codmedico=cod_medico where agenda_cod='"+cod+"'");
        try {
            conex.rs.first();
            agen.setNomePac(conex.rs.getString("paci_nome"));
            agen.setNomeMed(conex.rs.getString("nome_medico"));
            agen.setMotivo(conex.rs.getString("agenda_motivo"));
            agen.setPacienteNasc(conex.rs.getString("paci_nasc"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"agendamento não encontrado\n"+ex);
        }
        return agen;
        }
    
    
}

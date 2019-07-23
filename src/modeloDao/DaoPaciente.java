package modeloDao;
import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;
import modeloBeans.BeansPaciente;

public class DaoPaciente {
    
    ConexaoBD conex = new ConexaoBD();
    BeansPaciente pac = new BeansPaciente();
    ConexaoBD conexBairro = new ConexaoBD(); // conexão para o bairro
    int codBai;
    String nomeBairro; // variavel
    
    
    public void salvar(BeansPaciente pac){
    buscaBaiCod(pac.getNomeBairro());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pacientes(paci_nome, paci_rg ,paci_telefone ,paci_rua ,paci_cep ,paci_complemento ,paci_baicodigo ,paci_nasc)values(?,?,?,?,?,?,?,?)");
             pst.setString(1,pac.getNomePac());
             pst.setString(2, pac.getRg());
             pst.setString(3, pac.getTelefone());
             pst.setString(4, pac.getRua());
             pst.setString(5, pac.getCep());
             pst.setString(6, pac.getComplemento());
             pst.setInt(7, codBai);
             pst.setString(8, pac.getNasc());
             JOptionPane.showMessageDialog(null, "Paciente inserido com sucesso");
             pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex.getMessage());
        }
        conex.desconecta();
    }
    // FUNÇÃO PARA BUSCA EM OUTRA TABLA O BAIRRO
    public void buscaBaiCod(String nome){
        conex.conexao();
        
        conex.executaSql("select *from bairro where bainome ='"+nome+"'");
        try {
            conex.rs.first();
            codBai = conex.rs.getInt("baicodigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao buscar baixo>\n"+ex);
        }
        conex.desconecta();
        }
    
    
    public void editar(BeansPaciente pac){
    buscaBaiCod(pac.getNomeBairro());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update pacientes set paci_nome=?, paci_rg=?,  paci_telefone=?, paci_rua=?,  paci_cep=?, paci_complemento=?, paci_baicodigo=?, paci_nasc=? where paci_codigo=?");
            pst.setString(1, pac.getNomePac());
            pst.setString(2, pac.getRg());
            pst.setString(3, pac.getTelefone());
            pst.setString(4,pac.getRua());
            pst.setString(5,pac.getCep());
            pst.setString(6,pac.getComplemento());
            pst.setInt(7,codBai);
            pst.setString(8,pac.getNasc());
            pst.setInt(9,pac.getCodPac());
            JOptionPane.showMessageDialog(null,"Paciente alterado");
            pst.execute();
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro na alteração de dados\n Erro:"+ex);
        }
       conex.desconecta();
    }
    
    public BeansPaciente buscaPaciente(BeansPaciente pac){
        conex.conexao();
        try {
            conex.executaSql("select *from pacientes where paci_nome like'%"+pac.getPesquisa()+"%'"); // passand string sql
            conex.rs.first();
            buscaNomeBairro(conex.rs.getInt("paci_baicodigo"));
            pac.setCodPac(conex.rs.getInt("paci_codigo"));
            pac.setNomePac(conex.rs.getString("paci_nome"));
            pac.setRg(conex.rs.getString("paci_rg"));
            pac.setTelefone(conex.rs.getString("paci_telefone"));  
            pac.setRua(conex.rs.getString("paci_rua"));
            pac.setCep(conex.rs.getString("paci_cep"));
            pac.setComplemento(conex.rs.getString("paci_complemento"));
            pac.setNomeBairro(nomeBairro);  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar paciente"+ex);
        }
        conex.desconecta();
       return  pac;
    }
       //busca chave estrageira
       public void buscaNomeBairro(int cod){
            conexBairro.conexao();
                    try {
            conexBairro.executaSql("select *from bairro where baicodigo="+cod);
            conexBairro.rs.first();
            nomeBairro = conexBairro.rs.getString("bainome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao busca bairro \n"+ex);
        }
            conexBairro.desconecta();
       }
       
       public void excluir(BeansPaciente pac) {
        conex.conexao();
       try{
        PreparedStatement pst = conex.con.prepareStatement("delete from pacientes where paci_codigo=?");
        pst.setInt(1,pac.getCodPac());
        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        pst.execute();
        } catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro ao deleta \nErro:"+ex);
        }
        conex.desconecta();
        }
       
    }
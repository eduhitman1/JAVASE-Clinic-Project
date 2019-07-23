package modeloConection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
   
    public Statement stm;                                 // responsavel pela pesquisa
    public ResultSet rs;                                  //vai armazenar o resultado da pesquisa
    private String driver = "org.postgresql.Driver";      //identificação do serviço
    private String caminho = "jdbc:postgresql://localhost:5432/projetoclinica"; // caminha para base
    private String usuario = "postgres";   
    private String senha = "eduhit00";   
    public  static Connection con; 
    
    public Connection  conexao(){                                // metodo de conexao
       try {
           System.setProperty("jdbc.Drivers",driver);     // setar a propriedade do driver
           con=DriverManager.getConnection(caminho, usuario, senha);
            // JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");//
         
       } catch (SQLException ex) {   
              JOptionPane.showMessageDialog(null, "Erro de conexão:\n"+ex.getMessage()); 
          }
         return con;
        } 
    
    
    
    public  void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);   // verificação de caracter
            rs = stm.executeQuery(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao executar SQL:\n"+ex.getMessage());
        }        
    } 
    

     public void desconecta(){
       try { 
        //   JOptionPane.showMessageDialog(null, "Desconexão com sucesso");
           con.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao fecha a Desconexão  com banco:\n"+ex.getMessage());
           }
         }
    
}

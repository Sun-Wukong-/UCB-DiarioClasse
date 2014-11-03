package persistencia;

import apresentacao.AlunoFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.entidades.Aluno;

public class AlunoDao {
    
   // a conexão com o banco de dados
   private Connection connection;
 
   public AlunoDao() {
     this.connection = new ConnectionFactory().getConnection();
   }
   
   //Adicionar no BD
   public void adicionar(Aluno aluno) {
        String sql = "insert into aluno " +
             "(matricula,nome,turma)" +
             " values (?,?,?)";
       
 
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            // seta os valores
            stmt.setString(1,aluno.getMatricula());
            stmt.setString(2,aluno.getNome());
            stmt.setString(3,aluno.getTurma());

         
            // executa
            stmt.execute();
            stmt.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
   
     //Alterar BD
    public void alterar(Aluno aluno) {
        String sql = "update aluno set matricula=?, nome=?,"+
            "turma=?  where idAluno=?";
        
        try {
         PreparedStatement stmt = connection
            .prepareStatement(sql);
         stmt.setString(1, aluno.getMatricula());
         stmt.setString(2, aluno.getNome());
         stmt.setObject(3, aluno.getTurma());
         stmt.setInt(4, aluno.getIdAluno());
         stmt.execute();
         stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }   
    }
    
    //Remover BD
    public void remover(Aluno aluno, int id) {
        try {
             PreparedStatement stmt = connection
                     .prepareStatement("delete from aluno where idAluno=?");
             stmt.setInt(1, id);
             stmt.execute();
             stmt.close();
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     } 
   
    //Atualizar Tabela
    public ResultSet atualizarTabela(){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql;
            sql = "select idAluno as CodigoAluno, "
                    + "matricula as Matricula,"
                    + "nome as Nome,"
                    + "turma as Turma "
                    + "from aluno "
                    + "order by turma,nome";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }

    //PreencherComboBox
    public void preencherCombo(AlunoFrame alunoFrame) {
        try {
            String sql = "select * from turma order by nome";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) { 
                String name = rs.getString("nome");
                alunoFrame.getjComboBoxTurmaAluno().addItem(name);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
   

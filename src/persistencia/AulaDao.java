package persistencia;

import apresentacao.AulaFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.entidades.Aula;

public class AulaDao {
    
   // a conexão com o banco de dados
   private Connection connection;
   
   public AulaDao() {
     this.connection = new ConnectionFactory().getConnection();
   }
   
      //Adicionar no BD
    public void adicionar(Aula aula) {
        String sql = "insert into aula " +
             "(data,aluno,presente,codigoAluno)" +
             " values (?,?,?,(select idAluno from aluno where nome ?))";
 
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDate(1, aula.getData());
            stmt.setBoolean(3, aula.getPresenca());
            // executa
            stmt.execute();
            stmt.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


      //Alterar BD
   @SuppressWarnings("empty-statement")
    public void alterar(Aula aula) {
        String sql = "update aula set data=?, aluno=?,"+
            "presenca=?  where idAula=?";
        
        try {
         PreparedStatement stmt = connection
            .prepareStatement(sql);
         stmt.setDate(1, aula.getData());
         stmt.setBoolean(3, aula.getPresenca());;
         stmt.setInt(4, aula.getIdAula());
         stmt.execute();
         stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }   
    }
   
   //Remover BD
    public void remover(Aula aula, int id) {
        try {
             PreparedStatement stmt = connection
                     .prepareStatement("delete from aula where idAula=?");
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
            sql = "select (select turma from aluno where nome = aluno) as Turma,"
                    + "aluno as Aluno,"
                    + "presente as Presente from aula order by Turma,data,aluno";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
   
   public void preencherJTable(AulaFrame aulaFrame) {
        try {
            String var = aulaFrame.getjComboBoxTurmaAula().getSelectedItem().toString();
            String sql = "select nome from aluno where codigoTurma = "
                    + "(select idTurma from turma where nome = ?)" ;
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, var);
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) aulaFrame.getjTableAula().getModel();
            model.setRowCount(0);
            while (rs.next()) { 
                String name = rs.getString("nome");
                Object[][] data = {{name}};
                model.insertRow(aulaFrame.getjTableAula().getRowCount(), new Object[] {name});
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    public void preencherCombo(AulaFrame aulaFrame){
        try {
            String sql = "select * from turma order by nome";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) { 
                String name = rs.getString("nome");
                aulaFrame.getjComboBoxTurmaAula().addItem(name);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

package persistencia;

import apresentacao.AlunoAlterarFrame;
import apresentacao.AlunoFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.entidades.Aluno;
import modelo.entidades.Turma;

public class AlunoDao {
    
   // a conexão com o banco de dados
   private Connection connection;
 
   public AlunoDao() {
     this.connection = new ConnectionFactory().getConnection();
   }
   
   //Adicionar no BD
   public void adicionar(Aluno aluno,Turma turma) {
       AlunoFrame alunoFrame = new AlunoFrame();
        String sql = "insert into aluno " +
             "(matricula,nome,codigoTurma)" +
             " values (?,?,(select idTurma from turma where nome = ?))";
 
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,aluno.getMatricula());
            stmt.setString(2,aluno.getNome());
            stmt.setString(3, turma.getNome());
              
            // executa
            stmt.execute();
            stmt.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
   
     //Alterar BD
    public void alterar(Aluno aluno, Turma turma) {
        String sql = "update aluno set matricula=?, nome=? , codigoTurma = (select idTurma from turma where nome = ?) "+
            "where idAluno=? ";
        
        try {
         PreparedStatement stmt = connection
            .prepareStatement(sql);
         stmt.setInt(1, aluno.getMatricula());
         stmt.setString(2, aluno.getNome());
         stmt.setString(3, turma.getNome());
         stmt.setInt(4, aluno.getIdAluno());
         stmt.executeUpdate();
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
            sql = "select idAluno as CodigoAluno, matricula as Matricula, aluno.nome as Nome, turma.nome as Turma from aluno, turma where codigoTurma = idTurma";

            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }

    //PreencherComboBox

    /**
     *
     * @param alunoFrame
     */
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
       
    public void preencherCombo(AlunoAlterarFrame alunoFrame){
        try {
            String sql = "select * from turma order by nome";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) { 
                String name = rs.getString("nome");
                alunoFrame.getjComboBoxTurmaAlunoAlterar().addItem(name);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void preencherComboCodigo(AlunoAlterarFrame alunoFrame){
        try {
            String sql = "select * from aluno order by idAluno";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) { 
                int codigo = rs.getInt("idAluno");
                alunoFrame.getjComboBoxAlterarCodigo().addItem(codigo);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void preencherCodigoText(AlunoAlterarFrame alunoFrame){
        try{
            String var = alunoFrame.getjComboBoxAlterarCodigo().getSelectedItem().toString();
            String sql = "select aluno.nome as Nome, matricula, turma.nome as Turma from aluno, turma where codigoTurma = idTurma and aluno.idAluno = ?";

            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, var);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString("Nome");
                int matricula = rs.getInt("matricula");
                String turma = rs.getString("Turma");
                
                alunoFrame.getjTextNomeAlunoAlterar().setText(nome);
                alunoFrame.getjTextFieldMatriculaAlunoAlterar().setText(String.valueOf(matricula));
                alunoFrame.getjComboBoxTurmaAlunoAlterar().getModel().setSelectedItem(turma);
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
   

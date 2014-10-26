package persistencia;

import apresentacao.TurmaFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.entidades.Turma;

public class TurmaDao {
    
   // a conexão com o banco de dados
   private Connection connection;
 
   public TurmaDao() {
     this.connection = new ConnectionFactory().getConnection();
   }
   
   //Adicionar no BD
   public void adicionar(Turma turma) {
        String sql = "insert into turma " +
             "(nome,curso,disciplina,periodo,turno)" +
             " values (?,?,?,?,?)";
 
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
 
            // seta os valores
            stmt.setString(1,turma.getNome());
            stmt.setString(2,turma.getCurso());
            stmt.setString(3,turma.getDisciplina());
            stmt.setInt(4, turma.getPeriodo());
            stmt.setString(5, turma.getTurno());
         
            // executa
            stmt.execute();
            stmt.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
   
   //Alterar BD
    public void alterar(Turma turma) {
        String sql = "update turma set nome=?, curso=?,"+
            "disciplina=?, periodo=?, turno=?  where idTurma=?";
        
        try {
         PreparedStatement stmt = connection
            .prepareStatement(sql);
         stmt.setString(1, turma.getNome());
         stmt.setString(2, turma.getCurso());
         stmt.setString(3, turma.getDisciplina());
         stmt.setInt(4, turma.getPeriodo());
         stmt.setString(5, turma.getTurno());
         stmt.setInt(6, turma.getIdTurma());
         stmt.execute();
         stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }   
    }
    
    //Remover BD
    public void remover(Turma turma, int id) {
        try {
             PreparedStatement stmt = connection
                     .prepareStatement("delete from turma where idTurma=?");
             stmt.setInt(1, id);
             stmt.execute();
             stmt.close();
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     } 
    
    //Selecionar Tabela
    public void selecionarTabela(String tableClick){
        try {
            TurmaFrame turmaFrame = new TurmaFrame();
            String sql = "select nome,curso,disciplina,periodo,turno from turma where idTurma='"+tableClick+"'";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("nome");
                turmaFrame.getjTextNomeTurma().setText(add1);
                String add2 = rs.getString("curso");
                turmaFrame.getjTextCursoTurma().setText(add2);
                String add3 = rs.getString("disciplina");
                turmaFrame.getjTextDisciplinaTurma().setText(add3);
                String add4 = rs.getString("periodo");
                turmaFrame.getjTextPeriodoTurma().setText(add4);
                String add5 = rs.getString("turno");
                turmaFrame.getjComboBoxTurnoTurma().setSelectedItem(add5);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //Atualizar Tabela
    public ResultSet atualizarTabela(){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql;
            sql = "select nome,curso,disciplina,periodo,turno from turma order by nome";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
}

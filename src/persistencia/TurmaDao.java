package persistencia;

import apresentacao.TurmaFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.entidades.Turma;
import net.proteanit.sql.DbUtils;

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
   
   //Selecionar do BD   
   public List<Turma> getLista() {
        try {
            List<Turma> turmas = new ArrayList<>();
            try (PreparedStatement stmt = this.connection.
                    prepareStatement("select nome,curso,disciplina,periodo,turno"
                            + " from turma"); ResultSet rs = stmt.executeQuery()) {
                
                while (rs.next()) {
                    // criando o objeto Turma
                    Turma turma = new Turma();
                    turma.setNome(rs.getString("nome"));
                    turma.setCurso(rs.getString("curso"));
                    turma.setDisciplina(rs.getString("disciplina"));
                    turma.setPeriodo(rs.getInt("periodo"));
                    turma.setTurno(rs.getString("turno"));
                    
                    // adicionando o objeto à lista
                    turmas.add(turma);
                }
                
            }
            return turmas;
            
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
    public void remover(Turma turma) {
        try {
             PreparedStatement stmt = connection
                     .prepareStatement("delete from turma where idTurma=?");
             stmt.setInt(1, turma.getIdTurma());
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
            sql = "select nome,curso,disciplina,periodo,turno from turma";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
}

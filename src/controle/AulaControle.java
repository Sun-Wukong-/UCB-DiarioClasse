package controle;

import apresentacao.AulaFrame;
import modelo.entidades.Aula;
import net.proteanit.sql.DbUtils;
import persistencia.AulaDao;

public class AulaControle {
    
    public AulaControle(){
        AulaFrame turmaFrame = new AulaFrame();
    }
    
        //Consultar BD
    public void consultar(AulaFrame aulaFrame) {
        AulaDao dao = new AulaDao();
        aulaFrame.getjTableAula().setModel(DbUtils.resultSetToTableModel(dao.atualizarTabela()));
    }
    
       //Gravar no BD
    public void Inserir(AulaFrame turmaFrame) {
        Aula aula = new Aula();
        aula.setData(aulaFrame.);
        aula.setAluno(aulaFrame.);
        aula.setPresenca(aulaFrame.);
        AulaDao dao = new AulaDao();
        dao.adicionar(aula);
    }
    
}

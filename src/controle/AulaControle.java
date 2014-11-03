package controle;

import apresentacao.AulaFrame;
import javax.swing.JOptionPane;
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
    public void Inserir(AulaFrame aulaFrame) {
        Aula aula = new Aula();
        aula.setData(aulaFrame.getjLabelDataAula().getText());
        aula.setAluno(aulaFrame.getjLabelAlunoSelecionadoAula().getText());
        aula.setPresenca(aulaFrame.getjLabelPresenteAula().getText());
        AulaDao dao = new AulaDao();
        dao.adicionar(aula);
    }
    
    //Metodo de Salvar Campos
    public void salvarCampos(AulaFrame aulaFrame) {
        Inserir(aulaFrame);
        JOptionPane.showMessageDialog(aulaFrame, "Cadastro Salvo com Sucesso");
        consultar(aulaFrame);
        limparTela(aulaFrame);
    }
    
    public void limparTela(AulaFrame aulaFrame) {
        aulaFrame.getjLabelDataAula().setText("Data");
        aulaFrame.getjLabelAlunoSelecionadoAula().setText("Aluno Selecionado");
        aulaFrame.getjLabelPresenteAula().setText("Presente");
    }
    
}

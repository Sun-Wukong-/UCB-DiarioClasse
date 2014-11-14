package controle;

import apresentacao.AulaFrame;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
        for (int i = 0; i < aulaFrame.getjTableAula().getRowCount(); i++) {
            aula.setData(Date.valueOf(aulaFrame.getjComboBoxDataAula().getSelectedItem().toString()));
            try {
                aula.setPresenca((boolean) aulaFrame.getjTableAula().getModel().getValueAt(i, 1));
                
            } catch (NullPointerException e) {
                aula.setPresenca(false);
            }
            AulaDao dao = new AulaDao();
            dao.adicionar(aula);
        }
    }
    
    //Metodo de Salvar Campos
    public void salvarCampos(AulaFrame aulaFrame) {
        Inserir(aulaFrame);
        JOptionPane.showMessageDialog(aulaFrame, "Cadastro Salvo com Sucesso");
        consultar(aulaFrame);
        limparTela(aulaFrame);
    }
    
    public void limparTela(AulaFrame aulaFrame) {
        aulaFrame.getjComboBoxDataAula().setSelectedIndex(0);
        aulaFrame.getjComboBoxTurmaAula().setSelectedIndex(0);
    }
    
    public void preencherComboBoxData(AulaFrame aulaFrame){
        Calendar cal = new GregorianCalendar();
        int month =cal.get(Calendar.MONTH);
        int year =cal.get(Calendar.YEAR);
        int day =cal.get(Calendar.DAY_OF_MONTH);
        aulaFrame.getjComboBoxDiaAula().addItem(+year+"-"+(month+1)+"-"+day);
        aulaFrame.getjComboBoxDiaAula().addItem(+year+"-"+(month+1)+"-"+(day+1));
    }
    
}

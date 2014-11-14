package controle;

import apresentacao.AulaAlterarFrame;
import apresentacao.AulaFrame;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import modelo.entidades.Aluno;
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
        Aluno aluno = new Aluno();
        for (int i = 0; i < aulaFrame.getjTablePresenca().getRowCount(); i++) {
            aula.setData(Date.valueOf(aulaFrame.getjComboBoxDataAula().getSelectedItem().toString()));
            
            try {
                aula.setPresenca((boolean) aulaFrame.getjTablePresenca().getModel().getValueAt(i, 2));
                aluno.setMatricula((int) aulaFrame.getjTablePresenca().getModel().getValueAt(i, 0));
                
            } catch (NullPointerException e) {
                aula.setPresenca(false);
                aluno.setMatricula((int) aulaFrame.getjTablePresenca().getModel().getValueAt(i, 0));

            }
            AulaDao dao = new AulaDao();
            dao.adicionar(aula,aluno);
        }
    }
    
    public void Atualizar(AulaAlterarFrame aulaFrame){
        if(validarCampos(aulaFrame)){
            Aula aula = new Aula();
            for (int i = 0; i < aulaFrame.getjTablePresenca().getRowCount(); i++) {
                aula.setIdAula(aulaFrame.getjComboBoxCodigoAula().getSelectedIndex());
                try {
                    aula.setPresenca((boolean) aulaFrame.getjTablePresenca().getModel().getValueAt(i, 2));

                } catch (NullPointerException e) {
                    aula.setPresenca(false);

                }
                AulaDao dao = new AulaDao();
                dao.alterar(aula);
                JOptionPane.showMessageDialog(aulaFrame, "Cadastro Atualizado com Sucesso");
                limparTela(aulaFrame);
            }
        }
    }

    
    public void Deletar(Aula aula){  
        try{
            int id;
            id = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do Registro para ser Deletado"));
             AulaDao dao = new AulaDao();
            dao.remover(aula, id);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cancelado");
        }
    }
    
    //Metodo de Salvar Campos
    public void salvarCampos(AulaFrame aulaFrame) {
        if(validarCampos(aulaFrame)){
            Inserir(aulaFrame);
            JOptionPane.showMessageDialog(aulaFrame, "Cadastro Salvo com Sucesso");
            consultar(aulaFrame);
            limparTela(aulaFrame);
        }
    }
    
    public void limparTela(AulaFrame aulaFrame) {
        aulaFrame.getjComboBoxDataAula().setSelectedIndex(0);
        aulaFrame.getjComboBoxTurmaAula().setSelectedIndex(0);
    }
    
    public void limparTela(AulaAlterarFrame aulaFrame) {
        aulaFrame.getjComboBoxCodigoAula().setSelectedIndex(0);
    }
    
    public boolean validarCampos(AulaFrame aulaFrame){
        if(aulaFrame.getjComboBoxDataAula().getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(aulaFrame, "Selecione uma Data");
            return false;
        }
        if(aulaFrame.getjComboBoxTurmaAula().getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(aulaFrame, "Selecione uma Turma");
            return false;
        }
        return true;
    }
    
        public boolean validarCampos(AulaAlterarFrame aulaFrame){
        if(aulaFrame.getjComboBoxCodigoAula().getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(aulaFrame, "Selecione o Codigo");
            return false;
        }

        return true;
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

package controle;

import apresentacao.AlunoAlterarFrame;
import apresentacao.AlunoFrame;
import javax.swing.JOptionPane;
import modelo.entidades.Aluno;
import modelo.entidades.Turma;
import net.proteanit.sql.DbUtils;
import persistencia.AlunoDao;

public class AlunoControle {
    
    public AlunoControle(){
        AlunoFrame alunoFrame = new AlunoFrame();
    }
    
    //Consultar BD
    public void consultar(AlunoFrame alunoFrame) {
        AlunoDao dao = new AlunoDao();
        alunoFrame.getjTableAluno().setModel(DbUtils.resultSetToTableModel(dao.atualizarTabela()));
    }
    
    //Gravar no BD
    public void Inserir(AlunoFrame alunoFrame) {
        Aluno aluno = new Aluno();
        Turma turma = new Turma();
        AlunoDao dao = new AlunoDao();

        aluno.setMatricula(Integer.parseInt(alunoFrame.getjTextFieldMatriculaAluno().getText()));
        aluno.setNome(alunoFrame.getjTextNomeAluno().getText());
        turma.setNome(alunoFrame.getjComboBoxTurmaAluno().getSelectedItem().toString());
        
        dao.adicionar(aluno,turma);
    }
 public void Atualizar(AlunoAlterarFrame alunoFrame){
        if(validarCampos(alunoFrame)){
            Aluno aluno = new Aluno();
            boolean test = false; 
            aluno.setIdAluno(Integer.parseInt(alunoFrame.getjTextFieldCodigoAlunoAlterar().getText()));
            aluno.setMatricula(Integer.parseInt(alunoFrame.getjTextFieldMatriculaAlunoAlterar().getText()));
            aluno.setNome(alunoFrame.getjTextNomeAlunoAlterar().getText());
            test = true;
            if(test){
                AlunoDao dao = new AlunoDao();
                dao.alterar(aluno);
                JOptionPane.showMessageDialog(alunoFrame, "Cadastro Atualizado com Sucesso");
                limparTela(alunoFrame);
            }
        }
    }
 
    public void Deletar(Aluno aluno){  
        try{
            int id;
            id = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do Registro para ser Deletado"));
             AlunoDao dao = new AlunoDao();
            dao.remover(aluno, id);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cancelado");
        }
    }
    
        public boolean validarCampos(AlunoAlterarFrame alunoFrame) {
        if(alunoFrame.getjTextFieldCodigoAlunoAlterar().getText().equals("")){
            JOptionPane.showMessageDialog(alunoFrame, "Digite o Codigo");
            alunoFrame.getjTextFieldCodigoAlunoAlterar().requestFocus();
            return false;
        } 
         
        if (alunoFrame.getjTextNomeAlunoAlterar().getText().equals("")) {
            JOptionPane.showMessageDialog(alunoFrame, "Digite o Nome");
            alunoFrame.getjTextNomeAlunoAlterar().requestFocus();
            return false;
        }
        if (alunoFrame.getjTextFieldMatriculaAlunoAlterar().getText().equals("")) {
            JOptionPane.showMessageDialog(alunoFrame, "Digite a matricula do aluno");
            alunoFrame.getjTextFieldMatriculaAlunoAlterar().requestFocus();
            return false;
        }
        if (alunoFrame.getjComboBoxTurmaAlunoAlterar().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(alunoFrame, "Selecione uma Turma");
            alunoFrame.getjComboBoxTurmaAlunoAlterar().requestFocus();
            return false;
        }
        return true;
    }
    
    //Metodo de Salvar Campos
    public void salvarCampos(AlunoFrame alunoFrame) {
        if (validarCampos(alunoFrame)) {
            Inserir(alunoFrame);
            JOptionPane.showMessageDialog(alunoFrame, "Cadastro Salvo com Sucesso");
            limparTela(alunoFrame);
            consultar(alunoFrame);
        }
    }
    

    //Metodo de Validar Campos
    private boolean validarCampos(AlunoFrame alunoFrame) {
        if (alunoFrame.getjTextNomeAluno().getText().equals("")) {
            JOptionPane.showMessageDialog(alunoFrame, "Digite o Nome");
            alunoFrame.getjTextNomeAluno().requestFocus();
            return false;
        }
        if (alunoFrame.getjTextFieldMatriculaAluno().getText().equals("")) {
            JOptionPane.showMessageDialog(alunoFrame, "Digite a matricula do aluno");
            alunoFrame.getjTextFieldMatriculaAluno().requestFocus();
            return false;
        }
        if (alunoFrame.getjComboBoxTurmaAluno().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(alunoFrame, "Selecione uma Turma");
            alunoFrame.getjComboBoxTurmaAluno().requestFocus();
            return false;
        }
        return true;
    }

    // Metodo de Limpar Campos
    public void limparTela(AlunoFrame alunoFrame) {
        alunoFrame.getjTextNomeAluno().setText("");
        alunoFrame.getjTextFieldMatriculaAluno().setText("");
        alunoFrame.getjComboBoxTurmaAluno().setSelectedIndex(0);
    }
    
     // Metodo de Limpar Campos
    public void limparTela(AlunoAlterarFrame alunoFrame) {
        alunoFrame.getjTextFieldCodigoAlunoAlterar().setText("");
        alunoFrame.getjTextNomeAlunoAlterar().setText("");
        alunoFrame.getjTextFieldMatriculaAlunoAlterar().setText("");
        alunoFrame.getjComboBoxTurmaAlunoAlterar().setSelectedIndex(0);
    }
}

package controle;

import apresentacao.AlunoAlterarFrame;
import apresentacao.AlunoFrame;
import javax.swing.JOptionPane;
import modelo.entidades.Aluno;
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
        AlunoDao dao = new AlunoDao();
        aluno.setMatricula(alunoFrame.getjTextFieldMatriculaAluno().getText());
        aluno.setNome(alunoFrame.getjTextNomeAluno().getText());
        aluno.setTurma(alunoFrame.getjComboBoxTurmaAluno().getSelectedItem().toString());

        dao.adicionar(aluno);
    }
    
    public void Atualizar(AlunoAlterarFrame alunoFrame){
        Aluno aluno = new Aluno();
        boolean test = false; 
        aluno.setIdAluno(Integer.parseInt(alunoFrame.getjTextFieldCodigoAlunoAlterar().getText()));
        aluno.setMatricula(alunoFrame.getjTextFieldMatriculaAlunoAlterar().getText());
        aluno.setNome(alunoFrame.getjTextNomeAlunoAlterar().getText());
        aluno.setTurma(alunoFrame.getjComboBoxTurmaAlunoAlterar().getSelectedItem().toString());
        test = true;
        if(test){
            AlunoDao dao = new AlunoDao();
            dao.alterar(aluno);
            JOptionPane.showMessageDialog(alunoFrame, "Cadastro Atualizado com Sucesso");
        }
    }
    
    public void Deletar(Aluno aluno){
        int id;  
        id = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do Registro para ser Deletado"));
        AlunoDao dao = new AlunoDao();
        dao.remover(aluno, id);
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
        alunoFrame.getjTextNomeAlunoAlterar().setText("");
        alunoFrame.getjTextFieldMatriculaAlunoAlterar().setText("");
        alunoFrame.getjComboBoxTurmaAlunoAlterar().setSelectedIndex(0);
    }
}

package controle;

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
        aluno.setMatricula(alunoFrame.getjTextFieldMatriculaAluno().getText());
        aluno.setNome(alunoFrame.getjTextNomeAluno().getText());
        aluno.setTurma(alunoFrame.getjLabelTurmaSelecionadaAluno().getText());

        AlunoDao dao = new AlunoDao();
        dao.adicionar(aluno);
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
        return true;
    }

    // Metodo de Limpar Campos
    public void limparTela(AlunoFrame alunoFrame) {
        alunoFrame.getjTextNomeAluno().setText("");
        alunoFrame.getjTextFieldMatriculaAluno().setText("");
        alunoFrame.getjComboBoxTurmaAluno().setSelectedIndex(0);
        alunoFrame.getjLabelTurmaSelecionadaAluno().setText("Turma Selecionada");
        alunoFrame.getjTextNomeAluno().setEditable(false);
        alunoFrame.getjTextFieldMatriculaAluno().setEditable(false);
        alunoFrame.getjComboBoxTurmaAluno().setEnabled(false);
        alunoFrame.getjTableAluno().setEnabled(false);
        alunoFrame.getjTableAluno().setRowSelectionAllowed(false);
    }

    //Metodo para Habilitar Campos
    public void habilitarCampos(AlunoFrame alunoFrame) {
        alunoFrame.getjTextNomeAluno().requestFocus();
        alunoFrame.getjTextNomeAluno().setEditable(true);
        alunoFrame.getjTextFieldMatriculaAluno().setEditable(true);
        alunoFrame.getjComboBoxTurmaAluno().setEnabled(true);
        alunoFrame.getjTableAluno().setEnabled(true);
        alunoFrame.getjTableAluno().setRowSelectionAllowed(true);
    }
    
}

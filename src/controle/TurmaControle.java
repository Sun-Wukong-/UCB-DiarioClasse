package controle;

import apresentacao.TurmaFrame;
import javax.swing.JOptionPane;
import modelo.entidades.Turma;
import net.proteanit.sql.DbUtils;
import persistencia.TurmaDao;

public class TurmaControle {
    
    public TurmaControle(){
        TurmaFrame turmaFrame = new TurmaFrame();
    }
    
    //Atualizar Tabela
    public void atualizar(TurmaFrame turmaFrame){
        int row = turmaFrame.getjTableTurma().getSelectedRow();
        String tableClick = (turmaFrame.getjTableTurma().getModel().getValueAt(row, 0).toString());
        TurmaDao dao = new TurmaDao();
        dao.selecionarTabela(tableClick);
    }

    //Consultar BD
    public void consultar(TurmaFrame turmaFrame) {
        TurmaDao dao = new TurmaDao();
        turmaFrame.getjTableTurma().setModel(DbUtils.resultSetToTableModel(dao.atualizarTabela()));
    }

    //Gravar no BD
    public void Inserir(TurmaFrame turmaFrame) {
        Turma turma = new Turma();
        turma.setNome(turmaFrame.getjTextNomeTurma().getText());
        turma.setCurso(turmaFrame.getjTextCursoTurma().getText());
        turma.setDisciplina(turmaFrame.getjTextDisciplinaTurma().getText());
        turma.setPeriodo(Integer.parseInt(turmaFrame.getjTextPeriodoTurma().getText()));
        turma.setTurno(turmaFrame.getjLabelTurnoSelecionadoTurma().getText());
        TurmaDao dao = new TurmaDao();
        dao.adicionar(turma);
    }
    
    public void Deletar(Turma turma){
        int id;  
        id = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do Registro para ser Deletado"));
        TurmaDao dao = new TurmaDao();
        dao.remover(turma, id);
    }
    
    private boolean validarCampos(TurmaFrame turmaFrame) {
        if (turmaFrame.getjTextNomeTurma().getText().equals("")) {
            JOptionPane.showMessageDialog(turmaFrame, "Digite o Nome");
            turmaFrame.getjTextNomeTurma().requestFocus();
            return false;
        }
        if (turmaFrame.getjTextCursoTurma().getText().equals("")) {
            JOptionPane.showMessageDialog(turmaFrame, "Digite o Curso");
            turmaFrame.getjTextCursoTurma().requestFocus();
            return false;
        }
        if (turmaFrame.getjTextDisciplinaTurma().getText().equals("")) {
            JOptionPane.showMessageDialog(turmaFrame, "Digite a Disciplina");
            turmaFrame.getjTextDisciplinaTurma().requestFocus();
            return false;
        }
        if (turmaFrame.getjTextPeriodoTurma().getText().equals("")) {
            JOptionPane.showMessageDialog(turmaFrame, "Digite o Periodo");
            turmaFrame.getjTextPeriodoTurma().requestFocus();
            return false;
        }
        if (turmaFrame.getjComboBoxTurnoTurma().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(turmaFrame, "Selecione um Turno");
            turmaFrame.getjComboBoxTurnoTurma().requestFocus();
            return false;
        }
        return true;
    }
    
    //Limpar Tela
    public void limparTela(TurmaFrame turmaFrame) {
        turmaFrame.getjTextNomeTurma().setText("");
        turmaFrame.getjTextCursoTurma().setText("");
        turmaFrame.getjTextPeriodoTurma().setText("");
        turmaFrame.getjTextDisciplinaTurma().setText("");
        turmaFrame.getjComboBoxTurnoTurma().setSelectedIndex(0);
        turmaFrame.getjLabelTurnoSelecionadoTurma().setText("Turno Selecionado");
        turmaFrame.getjTextNomeTurma().setEditable(false);
        turmaFrame.getjTextCursoTurma().setEditable(false);
        turmaFrame.getjTextDisciplinaTurma().setEditable(false);
        turmaFrame.getjTextPeriodoTurma().setEditable(false);
        turmaFrame.getjComboBoxTurnoTurma().setEnabled(false);
        turmaFrame.getjTableTurma().setEnabled(false);
        turmaFrame.getjTableTurma().setRowSelectionAllowed(false);
    }

    //Metodo para Salvar Campos
    public void salvarCampos(TurmaFrame turmaFrame) {
        if (validarCampos(turmaFrame)) {
            Inserir(turmaFrame);
            JOptionPane.showMessageDialog(turmaFrame, "Cadastro Salvo com Sucesso");
            limparTela(turmaFrame);
            consultar(turmaFrame);
        }
    }

    public void habilitarCampos(TurmaFrame turmaFrame) {
        turmaFrame.getjTextNomeTurma().requestFocus();
        turmaFrame.getjTextNomeTurma().setEditable(true);
        turmaFrame.getjTextCursoTurma().setEditable(true);
        turmaFrame.getjTextDisciplinaTurma().setEditable(true);
        turmaFrame.getjComboBoxTurnoTurma().setEnabled(true);
        turmaFrame.getjTextPeriodoTurma().setEditable(true);
        turmaFrame.getjTableTurma().setEnabled(true);
        turmaFrame.getjTableTurma().setRowSelectionAllowed(true);
    }
}

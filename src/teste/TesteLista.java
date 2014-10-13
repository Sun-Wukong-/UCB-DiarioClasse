package teste;

import java.util.List;
import modelo.entidades.Turma;
import persistencia.TurmaDao;

public class TesteLista {
    
    public static void main(String[] args){
    
        TurmaDao dao = new TurmaDao();

        List<Turma> turmas = dao.getLista();

        for (Turma turma : turmas) {
            System.out.println("Nome: " + turma.getNome());
            System.out.println("Curso: " + turma.getCurso());
            System.out.println("Disciplina: " + turma.getDisciplina());
            System.out.println("Periodo: " + turma.getPeriodo());
            System.out.println("Turno: " + turma.getTurno() + "\n");
        }
    }  
}
